import misClases.*;  // Importar todas las clases del paquete misClasees (Atleta y Jurado)
import javax.swing.JOptionPane;

class Main {
	public static void main(String[] args) {
		// Llamado a metodos estaticos
		System.out.println(Atleta.getNumeroDeRounds());
		System.out.println(Atleta.getFormulaDeCalculoDePuntuacion());

		// Instancias de atleta
		Atleta usain = new Atleta("Usain", "Bolt", 30, 'M', "Atletismo");
		System.out.println(usain.toString());

		usain.setDisciplina("Natacion");
		double puntos = usain.calcularPuntuacion(5, 8);
		System.out.println("Puntos recibidos del metodo: " + puntos);

		System.out.println(usain.toString());

		// Otra instancia de atleta
		Atleta messi = new Atleta("Lionel", "Messi", 35, 'M', "Futbolista");
		System.out.println(messi.toString());

		// Atleta usando constructor por omision
		Atleta atletaVacio = new Atleta();
		System.out.println("ATLETA VACIO: \n" + atletaVacio.toString());

		// Atleta usando constructor con solo 1 parametro
		Atleta atletaNombre = new Atleta("NOMBRE");
		System.out.println("ATLETA CON NOMBRE: \n" + atletaNombre.toString());

		// JOptionPane
		// Entrada de datos del usuario
		String nombre = JOptionPane.showInputDialog("Digite el nombre del atleta");
		System.out.println("Nombre del atleta: " + nombre);
		String apellido = JOptionPane.showInputDialog("Digite el apellido del atleta");
		String disciplina = JOptionPane.showInputDialog("Digite la disciplina del atleta");

		Atleta atletaDeUsuario = new Atleta(nombre, apellido, 35, 'M', disciplina);
		System.out.println(atletaDeUsuario.toString());
		// Escribir informacion del atleta en ventana
		JOptionPane.showMessageDialog(null, atletaDeUsuario.toString(), "Informacion del atleta", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "TEXTO QUE QUIERO QUE SALGA DNTRO DE LA VENTANA\nOTRA LINA", "Informacion de mi ventana", JOptionPane.INFORMATION_MESSAGE);

		// Math
		System.out.println(Math.pow(2,10));

		// Jurado
		Jurado jurado = new Jurado("Juan", "Alfaro");
		System.out.println(jurado.toString());
	}
}