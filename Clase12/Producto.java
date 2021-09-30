
/**
 * Write a description of class Producto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Producto
{
    // Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    
    // Constructor
    public Producto(int id, String nombre, String desc, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = desc;
        this.precio = precio;
    }
    
    // Sets y gets
    public String getNombre() {
        return nombre;
    }
    // Metodos
}
