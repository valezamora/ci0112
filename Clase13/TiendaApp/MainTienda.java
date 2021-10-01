

public class MainTienda
{
    public static void main(String[] args) {
        if (args.length > 0 && args[0] == "gui") {
            // usar interfaz con JOptionPane
        } else {
            // usar interfaz consola
        }
        TiendaApp app = new TiendaApp();
        app.run();
    }
}