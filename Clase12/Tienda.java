
/**
 * Clase tienda
 *
 */
public class Tienda
{
    private Producto[] productos;

    /**
     * Constructor for objects of class Tienda
     */
    public Tienda(int cantidadDeProductos)
    {
        productos = new Producto[cantidadDeProductos];
    }

    /**
     * Agregar un producto
     *
     * @param   posicionDelProducto  posicion del vector donde se quiere guardar el producto
     * @param   producto    producto que se va a guardar
     */
    public void agregarProducto(int posicionDelProducto, Producto producto)
    {
        productos[posicionDelProducto] = producto;
    }
    
    /**
     * Ordena el vector por precio
     */
    public void ordenarProductosPorPrecio() {
        // Implementar este metodo la proxima clase
    }
    
    public String toString() {
        // Implementar este metodo la proxima clase
        return "";
    }
}
