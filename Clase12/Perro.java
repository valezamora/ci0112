
/**
 * Clase Perro
 *
 */
public class Perro
{
    private String nombre;
    private int edad;
    
    /**
     * Constructor for objects of class Perro
     */
    public Perro(String nombre)
    {
        this.nombre = nombre;
    }
    public Perro()
    {
        this.nombre = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Reescribimos el metodo toString para poder imprimir Perros en la interfaz (consola o GUI)
    public String toString() {
        return "Mi nombre es " + nombre + " y mi edad es " + edad;
    }
}
