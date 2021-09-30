
/**
 * Clase Orden
 *
 */
public class Orden
{
    // atributos
    private int id;
    private Producto productos[];
    
    // constructor
    public Orden(int id, int cantidadDeProductos) {
        this.id = id;
        this.productos = new Producto[cantidadDeProductos];
    }
    
    // sets y gets
    
    // metodos
    public void agregarProducto(int posicionDeProducto, Producto producto) {
        System.out.println(producto.getNombre());
        if (posicionDeProducto >= 0 && posicionDeProducto < productos.length) {
            productos[posicionDeProducto] = producto;
        }
        
        // manejo de errores
        /*
        try {
            // acciones que quiero ejecutar
            productos[posicionDeProducto] = producto;
        } catch(Exception e) {
            System.out.println("Hubo un error agregando su producto, por favor verifique los datos.");
            System.out.println(e);
        }
        */
    }
    
    /**
     * Sumar el precio de todos los productos de una orden
     * 
     * @return precio total de la orden
     */
    public double calcularPrecioTotal() {
        // Implementar este metodo la proxima clase
        return 0;
    }

    public String toString() {
        String resultado = "Los productos de la orden " + id + " son:";
        for (int i = 0; i < productos.length; ++i) {
            resultado += productos[i].getNombre() + "\n";
        }
        return resultado;
    }
}
