import java.util.Scanner;

/**
 * Clase para manejar la entrada y salida de datos en la consola o GUI. 
 * Esta clase no es necesaria, es solo para demostrar que se puede permitir que el usuario elija cualquiera
 *
 * @author Valeria Zamora
 * @version 9/9/2021
 */
public class Interfaz
{
    private InterfazConsola interfazConsola;
    private InterfazGUI interfazGUI;
    private boolean usarConsola;
    
    public Interfaz() {
        interfazConsola = new InterfazConsola();
        interfazGUI = new InterfazGUI();
        setUsarConsola(true);
    }
    
    public void setUsarConsola(boolean usarConsola) {
        this.usarConsola = usarConsola;
    }
    
    /**
     * Lee un string del usuario
     * @param   mensaje Mensaje que se despliega para solicitar string
     * @return String ingresado por el usuario
     */
    public String leerString(String mensaje) {
        String texto = "";
        if (usarConsola) {
            texto = interfazConsola.leerString(mensaje);
        } else {
            texto = interfazGUI.leerString(mensaje);
        }
        return texto;
    }
    
    /**
     * Lee un entero del usuario
     * @param   mensaje Mensaje que se despliega para solicitar entero
     * @return  Entero ingresado por el usuario
     */
    public int leerEntero(String mensaje) {
        int numero = 0;
        if (usarConsola) {
            numero = interfazConsola.leerEntero(mensaje);
        } else {
            numero = interfazGUI.leerEntero(mensaje);
        }
        return numero;
    }
    
    /**
     * Lee un double del usuario
     * @param   mensaje     Mensaje que se despliega para solicitar double
     * @return  Double ingresado por el usuario
     */
    public double leerDouble(String mensaje) {
        double numero = 0;
        if (usarConsola) {
            numero = interfazConsola.leerDouble(mensaje);
        } else {
            numero = interfazGUI.leerDouble(mensaje);
        }
        return numero;
    }
    
    /**
     * Muestra un mensaje al usuario
     * @param   titulo    Titulo del mensaje
     * @param   mensaje   Contenido del mensaje
     */
    public void mostrarMensaje(String titulo, String mensaje) {
        if (usarConsola) {
            interfazConsola.mostrarMensaje(titulo, mensaje);
        } else {
            interfazGUI.mostrarMensaje(titulo, mensaje);
        }
    }
}
