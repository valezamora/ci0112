
public class Main
{
    public static final void main( String [] args ) {
        
        // Para leer un archivo comprimido
          int counter = 0;
          BitFileReader bitsReader = new BitFileReader( "test.huf" );

          while ( bitsReader.hasNext() ) {
             counter++;
             System.out.print(bitsReader.next());
             if (0 == (counter % 8)) {
                System.out.println();
             }
          }

          bitsReader.close();
          System.out.println("------------------------");
        // Para leer un archivo normal
        FileReader archivo = new FileReader( "test.ext" );
        String s = "";
        try {
          while ((s = archivo.leerSiguienteCaracter()) != "-1") {
              System.out.println(s);
          }
          
        } catch (Exception e ) {
            System.out.println("ERROR: " + e);
        }
      
        try {
            System.out.println("Archivo completo: " + archivo.leerArchivo());
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        
      try {
        archivo.close();
      } catch (Exception e) {
        System.out.println("ERROR: " + e);
      }
      
      
      // Guardar archivo .huf
       BitFileWriter bitsWriter = new BitFileWriter( "test.huf", 0 );
       bitsWriter.write( "0000111101010101" );
       bitsWriter.write('a');
       bitsWriter.close();
       
       
       // Guardar archivo .ext
       
       FileWriter fileWriter = new FileWriter("test-salida.ext");
       
       try {
        fileWriter.crearArchivo("ARCHIVO CONTENIDO NUEVO");
      } catch (Exception e) {
        System.out.println("ERROR: " + e);
      }
       
       try {
        fileWriter.close();
      } catch (Exception e) {
        System.out.println("ERROR: " + e);
      }
       

    
      

   }
}
