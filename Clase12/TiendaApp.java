
/**
 * Write a description of class TiendaApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TiendaApp
{
    public void run() {
        // Creo los productos disponibles en la tienda
        Producto camisa = new Producto(1, "Camisa", "Camisa blanca", 5000);
        Producto pantalon = new Producto(2, "Pantalon", "Pantalon negro", 10000);
        Producto zapatos = new Producto(3, "Zapatos", "Zapatos morados", 10200);
        Producto sombrero = new Producto(4, "Sombrero", "Sombrero para el sol", 3500);
        Producto medias = new Producto(5, "Medias", "Medias deportivas", 500);

        // Creamos una nueva tienda con 5 productos
        Tienda miTienda = new Tienda(5);
        
        // Creo una orden de 2 productos
        Orden orden1 = new Orden(1, 2);
        orden1.agregarProducto(0, camisa);
        orden1.agregarProducto(1, pantalon);
        
        System.out.println(orden1);
    }
}
