import java.util.Scanner;

/**
 * @author Jorman Herrera
 */
public class Conversor
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		Operaciones misOperaciones = new Operaciones();
		System.out.println("Ingrese la cantidad de gramos a convertir ");
		double gramos = entrada.nextDouble();
		double kilogramos = misOperaciones.convertirGramosaKilos(gramos);
		System.out.println(kilogramos);
		
	}
}