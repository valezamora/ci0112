import java.io.FileOutputStream;

public class FileWriter
{
    private FileOutputStream outputStream;
    
    public FileWriter(String nombreArchivo) {
        try {
            outputStream = new FileOutputStream(nombreArchivo);
        } catch (Exception e) {
            System.out.println("Error escribiendo el archivo. " + e);
        }
        
    }

    public void crearArchivo(String contenido) throws Exception {
        byte[] stringToBytes = contenido.getBytes();
        outputStream.write(stringToBytes);
    }
    
    public void close() throws Exception {
        outputStream.close();
    }
}
