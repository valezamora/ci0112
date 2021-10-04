
/**
 * Write a description of class JuegoApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuegoApp
{
    public void run() {
        InterfazConsola interfaz = new InterfazConsola();
        Juego21 juego21 = new Juego21();
        interfaz.mostrarMensaje("Bienvenido Juegos.");
        juego21.jugarPartida(interfaz);
    }
}
