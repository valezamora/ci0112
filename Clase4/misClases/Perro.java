package misClases;

public class Perro {
	// Atributos de la classe
	private String nombre;
	private String raza;
	private int edad;
	// Este atributo no se puede editar fuera de la clase despues de ser inicializado en el constructor
	private String fechaDeNacimiento;
	// Este atributo no se va a poder leer ni editar fuera de la clase
	private boolean vacunado;

	// Constructor
	public Perro(String nuevoNombre, String nuevaFecha) {
		// Que necesito para inicializar un perro
		edad = 0;
		nombre = nuevoNombre;
		fechaDeNacimiento = nuevaFecha;
		vacunado = false;
	}

	// Metodos set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreNuevo) {
		nombre = nombreNuevo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String razaNueva) {
		raza = razaNueva;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}

	// A este atributo no le creamos un metodo set porque no queremos que se pueda editar despues de crear el objeto
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	// Metodos
	public String toString() {
		return "Mi nombre es " + nombre + "\nNaci el " + fechaDeNacimiento + "\nEdad: " + edad + " años\nMi raza es " + raza + "\nVacunado: " + vacunado;
	}
}