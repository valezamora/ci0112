import java.util.Scanner;

/**
 * Esta clase debe de ser utilizada para la tarea corta 4
 *
 * @author Valeria Zamora
 */
public class MainParaTarea
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        // Leer numero del usuario
        System.out.println("Ingrese el numero de terminos para calcular la aproximacion de Pi");
        int numeroTerminos = entrada.nextInt();
        System.out.println();
        
        double pi1 = calculadora.aproxPi1(numeroTerminos);
        double pi2 = calculadora.aproxPi2(numeroTerminos);
        double pi3 = calculadora.aproxPi3(numeroTerminos);
        System.out.println("El resultado de la aproximacion de Pi 1 usando ciclos es: " + pi1); 
        System.out.println("El resultado de la aproximacion de Pi 2 usando ciclos es: " + pi2); 
        System.out.println("El resultado de la aproximacion de Pi 3 usando ciclos es: " + pi3); 

        double piRecursivo = calculadora.aproxPiRecursiva1(numeroTerminos);   
        System.out.println("El resultado de la aproximacion de Pi usando recursividad es: " + piRecursivo); 
        double piRec3 = calculadora.aproxPiRecursiva3(numeroTerminos);
        System.out.println("El resultado de la aproximacion de Pi usando recursividad 3 es: " + piRec3); 
    }
}