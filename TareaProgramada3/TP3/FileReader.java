import java.io.File;
import java.io.FileInputStream;

public class FileReader
{
    private FileInputStream inputStream;

    /**
     * Constructor for objects of class FileReader
     */
    public FileReader(String nombreArchivo)
    {
        try {
            File archivo = new File(nombreArchivo);
            inputStream = new FileInputStream(archivo);
        } catch (Exception e) {
            System.out.println("Error abriendo el archivo");
        }
    }
    
    public String leerArchivo() throws Exception {
        String contenido = "";
        int cont;
        while ((cont = inputStream.read()) != -1) {
           // Para convertir el entero que lee a binario
           String binario = Integer.toBinaryString(cont);
           // Para convertir el entero a caracter
           char c = (char)cont;
           contenido +=  c + "\n";
        }
        
        return contenido;
    }
    
    public String leerSiguienteCaracter() throws Exception  {
       int cont = inputStream.read();
       if (cont == -1) {
            return "-1";
       }
       return Integer.toBinaryString(cont);
    }

    public void close() throws Exception  {
        inputStream.close();
    }
}
