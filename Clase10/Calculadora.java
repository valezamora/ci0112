
/**
 * Write a description of class Calculadora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculadora
{
    public int sumatoriaFor(int inicio, int fin) {
        int resultado = 0;
        for(int i = inicio; i <= fin; ++i) {
            resultado += i;
        }
        return resultado;
    }
    
    public int sumatoriaRec(int inicio, int fin) {
        if (fin > inicio) {
            return fin + sumatoriaRec(inicio, fin-1);
        } else {
            return fin;
        }
    }
    
    public double aproxPi(int terminos) {
        return 0;
    }
    
    public double aproxPiRecursiva(int terminos) {
        return 0;
    }
}
