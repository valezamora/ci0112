/**
 * Reads bits from a file as a character string of 0's and '1
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
 *  If bit is 1 it represents a middle node, go left first, then right
 *  If bit is 0 it represents a leaf node, with its character encoding, recursion stops here
 *
 * Compressed file code
 *  Each character in the original file is replaced with its correspondig Huffman code
 *  and stored in this area
 *
 * Reads are buffered by WriteSize (512) chars, all reads the occurs on internal buffer
 *
 */


import java.io.InputStream;
import java.io.FileInputStream;


class BitFileReader {
// Class constants
   private static final int BitsToEncode = 8;        // Each character is encoded using eight bits
   private static final int ReadSize = 512;        // Each file read is limited to 512 bytes
   private static final int BytesInHeader = 4;

// Class instance members
   private InputStream inputStream;    // Input stream
   private int readPointer;        // Buffer read pointer
   private byte[] readBuffer;        // Read buffer
   private StringBuffer readString;    // Read string
   private int charsRead;        // Chars read from file
   private int stuffBits;        // Bits added to end of file


/**
 * Constructor for objects of class BitStream
 */
   public BitFileReader( String name ) {
      this.readPointer = 0;
      this.charsRead = 0;
      this.stuffBits = 0;
      this.readString = new StringBuffer( "" );
      this.readBuffer = new byte[ ReadSize ];
      try {
         this.inputStream = new FileInputStream( name );
      }
      catch ( Exception e ) {
         e.printStackTrace();
         System.exit( 1 );
      }

      this.readHeader();

   }


/**
 *   Reads file Huffman compressed file header
 *  Checks if bytes are correct (magic number) and sets stuffBits variable
 */
   public void readHeader() {
      boolean headerOK = true;
      int bytes, bits;
      StringBuffer code [] = new StringBuffer[ BytesInHeader ];
      int valid[] = { 0x7f, 0x48, 0x55, 0x0f0 };

      for ( bytes = 0; this.hasNext() && (bytes < BytesInHeader); bytes++ ) {
         code[ bytes ] = new StringBuffer( "" );
         for ( bits = 0; bits < BitsToEncode; bits++ ) {
            code[ bytes ].append( this.next() );
         }
         if ( bytes < BytesInHeader - 1 ) {    // Checks first three bytes for 0x7f, H, U
            if ( Integer.parseInt( code[ bytes ].toString(), 2 ) != valid [ bytes ] ) {
               headerOK = false;
            }
         } else {
            if ( (Integer.parseInt( code[ bytes ].toString(), 2 ) & 0xF0 ) != valid[ bytes ] ) {    // Checks for first half of fourth byte: 0xF
               headerOK = false;
            }
         }
         
      }

      if ( ! headerOK ) {
         System.out.println( "El encabezado no corresponde a un archivo de Huffman compactado, finalizando" );
         System.exit( 1 );
      }

      this.stuffBits = Integer.parseInt( code[ 3 ].toString(), 2 ) & 0x0F;

   }


/**
 * Read a binary coded file into a char (byte) array
 * Convert every char to its binary representation and fill rString
 * 
 */
   public void read() {

      if ( 0 == this.readPointer ) {
         try {
            this.charsRead = this.inputStream.read( readBuffer );    // Reads up ReadSize bytes (512) from stream
         }
         catch (Exception e) {
            e.printStackTrace();
            System.exit( 1 );
         }
      }

      if ( this.charsRead < 0 ) {
         return;
      }

      // Skips last byte in this for, specially handled if EOF
      for ( int i = 0; i < this.charsRead; i++ ) {
          // For negative numbers, the ones with first bit in 1
          // Create a bigger int (+256) and cut it back to 8 bits (& 0xFF)
          String code = Integer.toString( (readBuffer[ i ] + 256) & 0xFF, 2 );
          StringBuffer c = new StringBuffer( "" );
          for ( int x = code.length(); x < BitsToEncode; x++ ) {    // Zero stuff code
              c.append( "0" );
          }
          c.append( code );
          this.readString.append( c );
      }

      // Process last part of the code
      String code = Integer.toString( (readBuffer[ charsRead - 1 ] + 256) & 0xFF, 2 );
      StringBuffer c = new StringBuffer( "" );
      for ( int x = code.length(); x < BitsToEncode; x++ ) {
          c.append( "0" );
      }
      c.append( code );

      if ( this.charsRead < ReadSize ) {   // End of file detected
          for ( int x = 0; x < this.stuffBits; x++ ) {
              this.readString.append( c.charAt( x ) );
          }
      } else {
          this.readString.append( c );            
      }

  }


/**
 * Return true if the stream has another element
 */
   public boolean hasNext() {

      if ( this.readPointer == this.readString.length() ) {
         this.readPointer = 0;
         this.readString = new StringBuffer( "" );
         this.read();
      }

      return ( this.readPointer < this.readString.length() );

    }


/**
 * Return next char from stream
 */
   public char next() {
      return this.readString.charAt( this.readPointer++ );
   }


/**
 * Closes the stream
 */
    public void close() {

        this.readPointer = 0;
        try {
          this.inputStream.close();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

    }



/**
 * Main method to run tests for this class
 */
   public static final void main( String [] args ) {
      int counter = 0;
      BitFileReader bits = new BitFileReader( "test.huf" );

      while ( bits.hasNext() ) {
         counter++;
         System.out.print( bits.next() );
         if ( 0 == (counter % 8) ) {
            System.out.println();
         }
      }

      bits.close();

   }

}

