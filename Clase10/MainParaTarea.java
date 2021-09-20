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
        
        double pi = calculadora.aproxPi(numeroTerminos);
        System.out.println("El resultado de la aproximacion de Pi usando ciclos es: " + pi); 

        double piRecursivo = calculadora.aproxPiRecursiva(numeroTerminos);   
        System.out.println("El resultado de la aproximacion de Pi usando recursividad es: " + piRecursivo); 
    }
}