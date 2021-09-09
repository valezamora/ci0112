import javax.swing.JOptionPane;

/**
 * Clase que contiene la lógica de la aplicacion de nutricionistas
 *
 * @author Valeria Zamora
 * @version 9/9/2021 
*/
public class NutricionistaApp
{
    private Interfaz interfaz;
    private Paciente paciente;
    private Nutricionista nutricionista;

    /**
     * Constructor for objects of class NutricionistaApp
     */
    public NutricionistaApp()
    {
        nutricionista = new Nutricionista();
        interfaz = new Interfaz();
    }

    /**
     * Metodo que contiene la logica para correr la aplicación
     */
    public void run() {
        String nombre = null;
        int edad = 0;
        double peso = 0;
        double altura = 0;
        double factorDeActividad = 0;
        
        // Aqui el usuario podria elegir el tipo de interfaz que usa
        // Por defecto se usa la consola
        
        nombre = interfaz.leerString("Ingrese el nombre del paciente");
        edad = interfaz.leerEntero("Ingrese la edad del paciente");

        peso = interfaz.leerDouble("Ingrese el peso en kg del paciente");
        altura = interfaz.leerDouble("Ingrese el altura en cm del paciente");
        factorDeActividad = interfaz.leerDouble("Ingrese el factor de actividad del paciente. \nEl factor de actividad puede ser:\n1.2 para una persona sedentaria\n 1.55 para una persona con actividad moderada");
        
        paciente = new Paciente(nombre, altura, peso, edad, factorDeActividad);
        
        interfaz.mostrarMensaje("Informacion del paciente", ""+paciente);
        
        interfaz.mostrarMensaje("Cargando", "Calculando Calorias...");
        
        double calorias = nutricionista.calcularCaloriasAConsumir(paciente.getPeso(), paciente.getAltura(), paciente.getEdad(), paciente.getFactorDeActividad());
        
        paciente.setCaloriasAConsumir(calorias);
        
        interfaz.mostrarMensaje("Informacion del paciente actualizada", ""+paciente);
    }
}
