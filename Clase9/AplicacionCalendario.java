
/**
 * Write a description of class AplicacionCalendario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AplicacionCalendario
{
    // instance variables - replace the example below with your own
    private Calendario ejemplo;
    private InterfazConsola interfaz;

    /**
     * Constructor for objects of class AplicacionCalendario
     */
    public AplicacionCalendario()
    {
        ejemplo = new Calendario();
        interfaz = new InterfazConsola();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void run()
    {
        boolean continuar = true;
        while (continuar) {
            int numeroMes = interfaz.leerEntero("Ingrese el numero del mes (1-12) o -1 para salir");
            if (numeroMes == -1) {
                continuar = false;
            } else {
                String mes = ejemplo.obtenerNombreDeMes(numeroMes);
                interfaz.mostrarMensaje("Resultado", "El nombre del mes es: " + mes);
            }
        }
    }
}
