
/**
 * Write a description of class Juego21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Juego21
{
    private Mazo mazo;
    
    public Juego21() {
        mazo = new Mazo();
    }
    
    public void jugarPartida(InterfazConsola interfaz) {
        // Barajar naipe
        interfaz.mostrarMensaje("El mazo es: " + mazo);
        mazo.barajarCartas();
        interfaz.mostrarMensaje("El mazo barajado es: " + mazo);
        
        int puntajeJugador = 0;
        int puntajeCasa = 0;
        
        // Repartir cartas
        int cantidadCartasJugador = 2;
        for (int i = 0; i < cantidadCartasJugador; ++i) {
            puntajeJugador += repartirCarta(interfaz);
        }
        
        puntajeCasa += repartirCarta(interfaz);
        
        interfaz.mostrarMensaje("Puntaje inicial del jugador = " + puntajeJugador);
        interfaz.mostrarMensaje("Puntaje inicial de la casa = " + puntajeCasa);
        
        // Completar cartas casa
        while (puntajeCasa <= 16) {
            puntajeCasa += repartirCarta(interfaz);
        }
        
        interfaz.mostrarMensaje("Puntaje final de la casa = " + puntajeCasa);
        
        // Completar cartas del jugador
        boolean sacarOtraCarta = interfaz.leerBooleano("Quiere sacar otra carta?");
        while (sacarOtraCarta) {
            puntajeJugador += repartirCarta(interfaz);
            if (puntajeJugador >= 21) {
                sacarOtraCarta = false;
                interfaz.mostrarMensaje("Su puntaje es mayor a 21. Puntaje final = " + puntajeJugador);
            } else {
                sacarOtraCarta = interfaz.leerBooleano("Su puntaje actual es "+ puntajeJugador +  "Quiere sacar otra carta?");
            }
        }
        
        // Ganador
        String ganador;
        if (puntajeCasa > 21) {
            if (puntajeJugador <= 21) {
                ganador = "Jugador";
            } else {
                ganador = "Ninguno";
            }
        } else if (puntajeJugador > 21) {
            if (puntajeCasa <= 21) {
                ganador = "Casa";
            } else {
                ganador = "Ninguno";
            }
        } else {
            if (puntajeJugador >= puntajeCasa ) {
                ganador = "Jugador";
            } else {
                ganador = "Casa";
            }
        }
        
        interfaz.mostrarMensaje("El ganador es  " + ganador);
    }
    
    private int obtenerValorCarta(Carta carta) {
        int valor = 0;
        switch(carta.getValor()) {
            case "A":
                valor = 1;
                break;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                valor = Integer.parseInt(carta.getValor());
                break;
            case "J":
            case "Q":
            case "K":
                valor = 10;
                break;
        }
        return valor;  
    }
    
    private int repartirCarta(InterfazConsola interfaz) {
        Carta nuevaCarta = mazo.sacarCarta();
        interfaz.mostrarMensaje("Saco la carta: " + nuevaCarta);
        return obtenerValorCarta(nuevaCarta);
    }
}
