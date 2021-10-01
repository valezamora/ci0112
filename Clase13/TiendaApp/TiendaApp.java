
/**
 * Write a description of class TiendaApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TiendaApp
{
    public void run() {
        // InterfazGUI interfaz = new InterfazGUI();
        // int cantidadProductosTienda = interfaz.leerEntero("Ingrese la cantidad de productos de la tienda");
        // Creamos una nueva tienda con la cantidad de productos que indica el usuario
        // Tienda miTienda = new Tienda(cantidadProductosTienda);
        
        // Creo los productos disponibles en la tienda
        Producto camisa = new Producto(1, "Camisa", "Camisa blanca", 5000);
        Producto pantalon = new Producto(2, "Pantalon", "Pantalon negro", 10000);
        Producto zapatos = new Producto(3, "Zapatos", "Zapatos morados", 10200);
        Producto sombrero = new Producto(4, "Sombrero", "Sombrero para el sol", 3500);
        Producto medias = new Producto(5, "Medias", "Medias deportivas", 500);
        
        Producto[] productosTienda = {camisa, pantalon, zapatos, sombrero, medias};
        Tienda miTienda = new Tienda(productosTienda);
        double promedio = miTienda.calcularPrecioPromedioDeProductos();
        System.out.println("El promedio es: " + promedio);
        
        miTienda.ordenarProductosPorPrecio();
        System.out.println(miTienda);
        // Creo una orden de 2 productos
        Orden orden1 = new Orden(1, 2);
        orden1.agregarProducto(0, camisa);
        orden1.agregarProducto(1, pantalon);
        
        System.out.println(orden1);
    }
}
