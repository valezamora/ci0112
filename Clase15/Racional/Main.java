
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]) {
        // por omision debería de valer 0
        Racional r1 = new Racional();
        
        // recibe un numerador
        Racional r2 = new Racional(15);
        
        // recibe numerador y denominador
        Racional r3 = new Racional(5,7);
        Racional r4 = new Racional(5,9);
        
        // recibe otro racional
        Racional r5 = new Racional(r3);
        
        // Sumar 15 + 5/7
        Racional r6 = r2.mas(r3);
        System.out.println(r2 + " + " + r3 + " = " + r6);
        
        Racional r7 = r3.menos(r4);
        System.out.println(r3 + " - " + r4 + " = " + r7);
        
        Racional r8 = r2.menos(r4).mas(r1);
        System.out.println(r2 + " - " + r4 + " + " + r1 + " = " + r8);
        
        Racional r9  = r6.multiplicar(r5);
        System.out.println(r6 + " * " + r5 + " = " + r9);
        
        Racional r10 = r3.dividir(r4);
        System.out.println(r3 + " / " + r4 + " = " + r10);
        
    }
}
