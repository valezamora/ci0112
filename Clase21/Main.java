import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        Isla juego = new Isla();
        System.out.println(juego);
        boolean gano = false;
        boolean perdio = false;
        boolean salir = false;
        while (!gano && !perdio && !salir) {
            // Pedir al usuario donde quiere mover el pirata
            System.out.println("Ingrese la direccion hacia donde mover el pirata, le quedan " + juego.getMovimientosDisponibles() + " movimientos.\n" + juego.getStringDirecciones());
            int direccion = entrada.nextInt();
            if(direccion == -1) {
                salir = true;
            } else {
                juego.moverPirata(direccion);
                System.out.println(juego);
                // verificar si gano
                gano = juego.getGano();
                // verificar si perdio
                perdio = juego.getPerdio();
            }
        }

        if(perdio) {
            System.out.println("Fin del juego, usted perdio.");
        }
        
        if(gano) {
            System.out.println("Fin del juego, usted gano.");
        }
        
    }
}
