
public class Main
{
    public static final void main( String [] args ) {
        int counter = 0;
        // Para leer un archivo comprimido
      /*
      BitFileReader bits = new BitFileReader( "test.huf" );

      while ( bits.hasNext() ) {
         counter++;
         System.out.print(bits.next());
         if (0 == (counter % 8)) {
            System.out.println();
         }
      }

      bits.close();
      */
      // Para leer un archivo normal
      FileReader archivo = new FileReader( "test.ext" );
      try {
          String s;
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
      

   }
}
