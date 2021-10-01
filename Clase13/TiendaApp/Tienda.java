
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
    public Tienda(Producto[] productos)
    {
        this.productos = productos;
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
        for (int i = 0; i < productos.length; ++i) {
            // vamos a dar vueltas
            System.out.println("\nVuelta: " + i);
            for (int j = 0; j < productos.length - i - 1; ++j) {
                // comparar valores y ordenar
                if (productos[j].getPrecio() > productos[j + 1].getPrecio()) {
                    // necesitamos intercambiar valores de lugar
                    Producto temp = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = temp;
                    // Falta caso de ordenar null/ignorar
                }
                imprimirPrecios();
            }
            imprimirPrecios();
        }
    }
    
    // No usar esto aqui es solo para imprmir el ejemplo de ordenar
    private void imprimirPrecios() {
        System.out.print("Precio productos: ");
        String precios = "";
        for (int i  = 0; i < productos.length; ++i) {
            precios += productos[i].getPrecio() + " ";
        }
        System.out.println("[" + precios + "]");
    }
    
    public double calcularPrecioPromedioDeProductos() {
        double suma = 0;
        int tamano = productos.length;
        for (int i = 0; i < tamano; ++i) {
            if(productos[i] != null) {
                suma += productos[i].getPrecio();
            }
        }
        return suma/tamano;
    }
    
    public String toString() {
        String resultado = "Nombre \t\t\tPrecio\n";
        for (int i  = 0; i < productos.length; ++i) {
            resultado += productos[i].getNombre() + "\t\t\t" +  productos[i].getPrecio() + "\n";
        }
        return resultado;
    }
}
