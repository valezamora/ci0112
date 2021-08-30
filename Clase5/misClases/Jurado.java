package misClases;

public class Jurado {
	private String nombre;
	private String apellido;

	public Jurado(String nuevoNombre, String nuevoApellido) {
		nombre = nuevoNombre;
		apellido = nuevoApellido;
	}

	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String nuevoApellido) {
		apellido = nuevoApellido;
	}

	public String getApellido() {
		return apellido;
	}

	public String toString() {
		return "JURADO\nNombre: " + nombre + "\nApellido: " + apellido;
	}
}