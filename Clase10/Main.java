
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        
        int suma = calculadora.sumatoriaFor(2, 5);
        System.out.println("(for) Sumatoria de 2 a 5 = " + suma);
        /*
        // Usando while
        suma = calculadora.sumatoriaWhile(2, 5);
        System.out.println("(while) Sumatoria de 2 a 5 = " + suma);
        */
        // Usando while
        suma = calculadora.sumatoriaRec(2, 5);
        System.out.println("(Recursiva) Sumatoria de 2 a 5 = " + suma);
    }
}
