import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Tablero cuatroEnLinea = new Tablero();
        Scanner entrada = new Scanner(System.in);
        
        // Jugador 1 ROJO
        Ficha jugador1 = new Ficha(Ficha.FICHA_ROJA);
        // Jugador 2 azul
        Ficha jugador2 = new Ficha(Ficha.FICHA_AZUL);
        
        boolean hayGanador = false;
        boolean juegoSigue = true;
        
        while(!hayGanador && juegoSigue) {
            System.out.println("Tablero actual:");
            System.out.println(cuatroEnLinea);
            // Pedir al usuario en que posicion quiere poner la ficha
            System.out.println("Ingrese la columna para el jugador " + jugador1);
            int posicionJugador1 = entrada.nextInt();
            cuatroEnLinea.ponerFicha(posicionJugador1, jugador1);
            
            System.out.println("Tablero actual:");
            System.out.println(cuatroEnLinea);
            
            System.out.println("Ingrese la columna para el jugador " + jugador2);
            int posicionJugador2 = entrada.nextInt();
            cuatroEnLinea.ponerFicha(posicionJugador2, jugador2);
            
            boolean ganoJugador1 = cuatroEnLinea.gano(jugador1);
            boolean ganoJugador2 = cuatroEnLinea.gano(jugador2);

            if (ganoJugador1 || ganoJugador2) {
                String s = ganoJugador1 ? "Gano Jugador 1: " + jugador1 : "Gano Jugador 2: " + jugador2;
                System.out.println(s);
                System.out.println(cuatroEnLinea);
                hayGanador = true;
            }
            
            juegoSigue = cuatroEnLinea.hayEspacioEnTablero();
        }
    }
}
