
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        AplicacionCalendario app = new AplicacionCalendario();
        app.run();
        
        
        // Ejemplo de ciclos
        System.out.println("Usando WHILE");
        EjemploCiclos ciclos = new EjemploCiclos();
        String resultado = ciclos.concatenarString(3, "hola");
        System.out.println(resultado);
        
        System.out.println("Usando FOR");
        String resultadoFor = ciclos.concatenarStringUsandoFor(3, "hola");
        System.out.println(resultadoFor);
    }
}
