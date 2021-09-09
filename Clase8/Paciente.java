
/**
 * La clase paciente almacena los valores correspondiente a un paciente
 *
 * @author Valeria Zamora
 * @version 9/9/2021
 */
public class Paciente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double altura;
    private double peso;
    private int edad;
    private double factorDeActividad;
    private double caloriasAConsumir;

    /**
     * Constructor para objetos de tipo Paciente con valores iniciales
     */
    public Paciente(String nombre, double altura, double peso, int edad, double factorDeActividad)
    {
        // initialise instance variables
        setNombre(nombre);
        setAltura(altura);
        setPeso(peso);
        setEdad(edad);
        setFactorDeActividad(factorDeActividad);
        setCaloriasAConsumir(0);
    }
    
    /**
     * Constructor para objetos de tipo Paciente con valores iniciales default
     */
    public Paciente()
    {
        // initialise instance variables
        nombre = "";  // es lo mismo que usar this.nombre = "";
        altura = 0;
        peso = 0;
        edad = 0;
        factorDeActividad = 0;
        caloriasAConsumir = 0;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setFactorDeActividad(double factorDeActividad) {
        this.factorDeActividad = factorDeActividad;
    }
    
    public void setCaloriasAConsumir(double caloriasAConsumir) {
        this.caloriasAConsumir = caloriasAConsumir;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public double getFactorDeActividad() {
        return this.factorDeActividad;
    }
    
    public double getCaloriasAConsumir() {
        return this.caloriasAConsumir;
    }
    
    /**
     * Este metodo sobreescribe el metodo toString de los objetos convierte el paciente en un string que se pueda imprimir
     *
     * @return String representando al paciente
     */
    public String toString()
    {
        // put your code here
        return "PACIENTE\nNombre: " + this.nombre + "\nEdad: " + edad + "\nPeso: " + this.peso + "\nAltura: " + altura + "\nFactor de actividad: " + factorDeActividad + "\nCalorias: " + caloriasAConsumir;
    }
}
