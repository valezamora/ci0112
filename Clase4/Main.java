import misClases.Perro; // Importar la clase que cree

class Main {
	public static void main(String[] args) {
		System.out.println("Voy a crear perros");
		Perro miPerrito = new Perro("miPerrito", "10/01/2021");
		System.out.println(miPerrito.getNombre());
		miPerrito.setNombre("Bolita");
		System.out.println("Mi nuevo nombre es: " + miPerrito.getNombre());
		Perro segundoPerro = new Perro("Sasha", "15/05/2021");
		System.out.println("Soy el segundo perro nombre es: " + segundoPerro.getNombre());

		Perro tercerPerro = new Perro("Jack", "20/05/2021");
		System.out.println("Soy el tercer perro nombre es: " + tercerPerro.getNombre());

		System.out.println("Mis perros son: " + miPerrito.getNombre() + " " + segundoPerro.getNombre() + " " + tercerPerro.getNombre());

		miPerrito.setRaza("Salchicha");


		System.out.println(miPerrito.toString());

		System.out.println(segundoPerro.toString());

		System.out.println(tercerPerro.toString());
	}
}