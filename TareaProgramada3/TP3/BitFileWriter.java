/**
 * Writes bits from/to a file
 * 
 * @author (Francisco Arroyo)
 * @version (2021/Nov/01)
 *
 * Huffman compressed file structure
 * Bytes
 *  0      5  6        k k+1
 *  -------------------------------------------
 * | Header | Code tree | Compressed file code |
 *  -------------------------------------------
 *
 * File header structure (for Huffman compression)
 *  
 *  0     1    2    3       (offset bytes)
 *  .     H    U    F       (ASCII value)
 * 0x7f 0x48 0x55 0xF0bbb   (hexadecimal value)
 *
 * where last byte has a hexadecimal F code plus four bit number (0bbb)
 * indicating how many bits are stuffed the end of file
 *
 *  Code tree is the Huffman character code tree stored as a flat string of bits
 *  If bit is 1 it represents a middle node, go left first, then right (preOrder)
 *  If bit is 0 it represents a leaf node, with its character encoding, recursion stops here
 *
 * Compressed file code
 *  Each character in the original file is replaced with its correspondig Huffman code
 *  and stored in this area
 *
 * Writes are buffered until we hace WriteSize (512) chars or more to be written to the file
 *
 */

import java.io.OutputStream;
import java.io.FileOutputStream;

public class BitFileWriter {
    private static final int BitsToEncode = 8;
    private static final int BufferSize = 1024;
    private static final int WriteSize = 512;
    
    // Instance variables
    private StringBuffer writeString;	// String to keep bits (bytes) to be written, only '0' and '1' chars allowed
    private int writePointer;		// Write position index
    private OutputStream outputStream;
    private byte [] writeBuffer;	// Use to store bytes before write them to file
    private int stuffBits;
    

/**
 *  Constructor for objects of class BitStream
 *  This constructor must know the number of bits to be stuffed to the end of the file
 *
 */
    public BitFileWriter( String name, int stuffBits ) {
        this.writePointer = 0;
        this.stuffBits = stuffBits & 7;		// Must be a number between 000 to 111 in binary
        this.writeString = new StringBuffer( "" );
        this.writeBuffer = new byte[ WriteSize ];
        try {
            this.outputStream = new FileOutputStream( name );
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit( 1 );
        }

        this.writeHeader();

    }


/**
 *  First thing to write to stream is file header
 */
   private void writeHeader() {
      char valid[] = { 0x7f, 0x48, 0x55 };
      char last;
      String stuffValue;
      StringBuffer lastHeaderByte = new StringBuffer( "11110" );

      for ( char value:valid ) {	// Write first three characters: 0x1f, H, U
         this.write( value );
      }

      stuffValue = Integer.toString( this.stuffBits, 2 );
      for ( int l = stuffValue.length(); l < 3; l++ ) {	// To complete three bits
         lastHeaderByte.append( '0' );
      }
      lastHeaderByte.append( stuffValue );
      last = (char) (Integer.parseInt( lastHeaderByte.toString(), 2 ) & 0xff);
      this.write( last );

   }


/**
 * Write internal buffer to stream
 * @param closing boolean value, true if last block to be written, false if just writing to the file
 *
 */
    private void writeInternalBuffer( boolean closing ) {

        int k, len;
        int p = 0;

        len = this.writeString.length();
        while ( (len > BitsToEncode) && (this.writePointer < WriteSize) ) {
            k = Integer.parseInt( this.writeString.substring( p, p + BitsToEncode ), 2 );
            p += BitsToEncode;
            len -= BitsToEncode;
            this.writeBuffer[ this.writePointer++ ] = (byte) k;
        }
        if ( closing || (WriteSize == this.writePointer) ) {
            if ( closing ) {
                StringBuffer last = new StringBuffer( this.writeString.substring( p ) );
                for ( int l = last.length(); l < BitsToEncode; l++ ) {
                    last.append( "0" );
                }
                k = Integer.parseInt( last.toString(), 2 );
                writeBuffer[ this.writePointer++ ] = (byte) k;
            }
            // Write byte buffer to stream
            try {
                for ( int j = 0; j < this.writePointer; j++ ) {
                    outputStream.write( writeBuffer[j] );
                }
            } catch ( Exception e ) {
                e.printStackTrace();
            }
            this.writePointer = 0;
        }

        this.writeString = new StringBuffer( this.writeString.substring( p ) );

    }
    
    
/**
 * Add a StringBuffer to this stream
 *  The StringBuffer must contain a codified binary value
 * @param	binCodedText	a binary coded string
 */
    private void addToStream( StringBuffer binCodedText ) {

        this.writeString.append( binCodedText );
        if ( this.writeString.length() > BufferSize ) {
            writeInternalBuffer( false );
        }

    }
    
    
/**
 * Write a String to the stream/file
 * 
 * @param  s   String to write
 */
    public void write( String binaryCodedString ) {

        StringBuffer bits = new StringBuffer( binaryCodedString );
        addToStream( bits );

    }

    
/**
 * Write a character to the stream/file
 * 
 * @param  c   character to write
 *
 * Letter A is coded by 0x65 or "1000001" in binary, function Integer.toBinaryString only returns "1000001", seven bits, so we need to pad to 8 bits per character,
 * using for in this method we create "0", the append "10000001" to form "010000001" to write
 *
 */
    public void write( char letter ) {

        String bits = Integer.toBinaryString( letter );
        StringBuffer m = new StringBuffer( "" );
        for ( int i = bits.length(); i < BitsToEncode; i++ ) {
            m.append( "0" );    // Padding with zeroes
        }
        m.append( bits );

        addToStream( m );

    }


/**
 * Closes the stream
 *
 */
    public void close() {

        writeInternalBuffer( true );		// Flush the buffer
        this.writePointer = 0;
        try {
          outputStream.close();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

    }


    /**
     * Main method to test this class
     */
    public static final void main( String [] args ) {

       BitFileWriter bits = new BitFileWriter( "test.huf", 45 );
       bits.write( "0000111101010101" );
       bits.close();

    }

}

