
/**
 * Clase calculadora
 *
 * @version 23/9/2021
 */
public class Calculadora
{
    /**
     * Calcula el valor de Fibonacci para un numero 
     *
     * @param  n  numero de la secuencia que se quiere calcular
     * @return    el valor correspondiente de la secuencia para n
     */
    public int fibonacci(int n)
    {
        // caso base
        if (n == 1 || n == 0) {
            return n;
        } else {
            // subproblema
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public String mostrarSucesion(int terminos) {
        String sucesion = "";
        for(int i = 0; i <= terminos; ++i) {
            sucesion += fibonacci(i) + "  ";
        }
        return sucesion;
    }
}
