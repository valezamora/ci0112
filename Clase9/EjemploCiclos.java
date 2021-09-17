
/**
 * Write a description of class EjemploCiclos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EjemploCiclos
{
    /**
     * Recibe un texto y lo concatena n veces separado por una coma
     */
    public String concatenarString(int veces, String texto)
    {
        String resultado = "";
        int contador = 1;
        while (contador <= veces) {
            resultado += texto + " ";
            // Aumentar contador!
            ++contador;
        }
        return resultado;
    }
    
    
    /**
     * USANDO FOR
     * Recibe un texto y lo concatena n veces separado por una coma
     */
    public String concatenarStringUsandoFor(int veces, String texto)
    {
        String resultado = "";
        for (int contador = 1; contador <= veces; ++contador) {
            resultado += texto + " ";
        }
        return resultado;
    }
}
