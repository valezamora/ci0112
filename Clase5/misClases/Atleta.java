package misClases;

public class Atleta {
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private String disciplina;
	private char genero;
	private boolean clasificado;
	private double round1;
	private double round2;
	private double puntuacion;

	// Variable estatica
	private static final int NUMERO_ROUNDS = 2;

	// Constructores
	public Atleta(String nombreNuevo, String apellidoNuevo, int edadNueva, char generoNuevo, String disciplinaNueva) {
		nombre = nombreNuevo;
		apellido = apellidoNuevo;
		disciplina = disciplinaNueva;
		edad = edadNueva;
		genero = generoNuevo;
		puntuacion = -1;
		clasificado = false;
	}

	public Atleta(String nombreNuevo) {
		nombre = nombreNuevo;
		apellido = "";
		edad = -1;
		genero = '-';
		disciplina = "";
		puntuacion = -1;
		clasificado = false;
	}

	public Atleta() {
		nombre = "";
		apellido = "";
		edad = -1;
		genero = '-';
		disciplina = "";
		puntuacion = -1;
		clasificado = false;
	}

	// get y set 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreNuevo) {
		nombre = nombreNuevo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String nuevoApellido) {
		apellido = nuevoApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edadNueva) {
		edad - edadNueva;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String nuevaDisciplina) {
		disciplina = nuevaDisciplina;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char nuevoGenero) {
		genero = nuevoGenero;
	}

	public void setClasificado(double clasifico) {
		puntuacion = clasifico;
	}

	public boolean getClasificado() {
		return clasificado;
	}

	public void setPuntuacion(double puntos) {
		puntuacion = puntos;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setRound1(double puntos) {
		round1 = puntos;
	}

	public void setRound2(double puntos) {
		round2 = puntos;
	}

	// Metodos de la clase
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDisciplina: " + disciplina + "\nGenero: " + genero + "\nClasificado: " + clasificado + "\nPuntuacion: " + puntuacion + "\nRound 1 : " + round1 + "\nRound 2 : " + round2;
	}

	public double calcularPuntuacion(double puntos1, double puntos2) {
		round1 = puntos1;
		round2 = puntos2;
		double total = calcularPuntuacionTotal();
		puntuacion = total;
		return puntuacion;
	}

	private double calcularPuntuacionTotal() {
		return (round1 + round2) / 2;
	}

	// Metodos estaticos 
	public static int getNumeroDeRounds() {
		return NUMERO_ROUNDS;
	}

	public static String getFormulaDeCalculoDePuntuacion() {
		return "(round1 + round2) / 2";
	}

}