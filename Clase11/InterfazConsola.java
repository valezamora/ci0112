import java.util.Scanner;

/**
 * Clase para manejar la entrada y salida de datos en la consola
 *
 * @author Valeria Zamora
 * @version 9/9/2021
 */
public class InterfazConsola
{
    private Scanner entrada;
    
    public InterfazConsola() {
        entrada = new Scanner(System.in);
    }
    
    /**
     * Lee un string del usuario
     * @param   mensaje Mensaje que se despliega para solicitar string
     * @return String ingresado por el usuario
     */
    public String leerString(String mensaje) {
        System.out.println(mensaje);
        String texto = entrada.nextLine();
        System.out.println();
        return texto;
    }
    
    /**
     * Lee un entero del usuario
     * @param   mensaje Mensaje que se despliega para solicitar entero
     * @return  Entero ingresado por el usuario
     */
    public int leerEntero(String mensaje) {
        int numero = 0;
        boolean ingresoNumero = false;
        while(!ingresoNumero) {
            System.out.println(mensaje);
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                ingresoNumero = true;
            } else {
                entrada.next();
                System.out.println("El numero que ingreso tiene formato invalido.");
            }
        }
        System.out.println();
        return numero;
    }
    
    /**
     * Lee un double del usuario
     * @param   mensaje     Mensaje que se despliega para solicitar double
     * @return  Double ingresado por el usuario
     */
    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        double numero = entrada.nextDouble();
        System.out.println();
        return numero;
    }
    
    /**
     * Muestra un mensaje al usuario
     * @param   titulo    Titulo del mensaje
     * @param   mensaje   Contenido del mensaje
     */
    public void mostrarMensaje(String titulo, String mensaje) {
        System.out.println(titulo);
        System.out.println(mensaje);
    }
}