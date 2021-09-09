import javax.swing.JOptionPane;

/**
 * Clase para manejar la entrada y salida de datos usando JOptionPane
 *
 * @author Valeria Zamora
 * @version 9/9/2021
 */
public class InterfazGUI
{
    /**
     * Lee un string del usuario
     * @param   mensaje Mensaje que se despliega para solicitar string
     * @return String ingresado por el usuario
     */
    public String leerString(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }
    
    /**
     * Lee un entero del usuario
     * @param   mensaje Mensaje que se despliega para solicitar entero
     * @return  Entero ingresado por el usuario
     */
    public int leerEntero(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        int numero = Integer.parseInt(texto);
        return numero;
    }
    
    /**
     * Lee un double del usuario
     * @param   mensaje     Mensaje que se despliega para solicitar double
     * @return  Double ingresado por el usuario
     */
    public double leerDouble(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        double numero = Double.parseDouble(texto);
        return numero;
    }
    
    /**
     * Muestra un mensaje al usuario
     * @param   titulo    Titulo del mensaje
     * @param   mensaje   Contenido del mensaje
     */
    public void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
