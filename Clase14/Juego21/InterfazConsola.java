import java.util.Scanner;

public class InterfazConsola
{
    private Scanner entrada;
    
    public InterfazConsola() {
        entrada = new Scanner(System.in);
    }
    
    /**
     * Muestra un mensaje al usuario
     * @param   titulo    Titulo del mensaje
     * @param   mensaje   Contenido del mensaje
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public boolean leerBooleano(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextBoolean();
    }
}
