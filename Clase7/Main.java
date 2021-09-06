// imports
import javax.swing.JOptionPane;
import electronicos.Televisor;

class Main {
	public static void main(String[] args) {
		// Definimos variables
		Televisor miTele = new Televisor("Sony", "1234");
		System.out.println(miTele);

		// Interaccion con usuario
		String marca = JOptionPane.showInputDialog("Digite la marca de su televisor");
		String modelo = JOptionPane.showInputDialog("Digite el modelo de su televisor");
		Televisor televisorDelUsuario = new Televisor(marca, modelo);
		System.out.println(televisorDelUsuario);

		// Comparar televisores utilizando el metodo equals
		boolean telesSonIguales = miTele.equals(televisorDelUsuario);
		System.out.println("Los teles son iguales? " + telesSonIguales);

		// OPERACIONES SOBRE TELEVISOR
		miTele.alternarEncendido();
		miTele.subirVolumen();
		miTele.setVolumen(29);
		miTele.subirVolumen();
		miTele.subirVolumen();

		miTele.bajarCanal();

		System.out.println();
		System.out.println(miTele);
		

		miTele.subirCanal();
		miTele.setCanal(200);
		System.out.println();
		System.out.println(miTele);
	}
}