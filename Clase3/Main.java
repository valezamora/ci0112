class Main {
	public static void main(String[] args) {
		int a = 500;
		double edad = 3.7; // (double) a;
		int anos = (int) edad;
		char inicialNombre = 'V';
		float cantidadDeCreditos = 4.5f;
		double creditos = 4.5;
		System.out.print("Inicial del nombre: ");
		System.out.println(inicialNombre);
		System.out.print("Edad: ");
		System.out.println(edad);
		System.out.print("Años: ");
		System.out.println(anos);
		System.out.print("Creditos: ");
		System.out.println(creditos);
		System.out.print("cantidad de creditos: ");
		System.out.println(cantidadDeCreditos);

		// Operaciones aritmeticas
		int cantidadDeProductos = 5;
		int nuevosProductos = 10;
		int total = cantidadDeProductos + nuevosProductos; // es lo mismo que hacer 5 + 10
		System.out.println(total);
		cantidadDeProductos = cantidadDeProductos + 1;
		System.out.println(cantidadDeProductos);
		System.out.println(total/nuevosProductos);

		float fraccion = 1f / 2f;
		System.out.println(fraccion);

		int resta = (int)(total - 2.5);
		System.out.println(resta);

		double operacion = (3 + 4) * 2;
		System.out.println(operacion);
		double operacion2 = 3 + 4 * 2;
		System.out.println(operacion2);

		double residuo = 5%7;
		System.out.println(residuo);

		// Operador unarios
		System.out.println("Incremento");
		int contador = 3;
		System.out.println(contador++);
		System.out.println(contador);
		contador = 3;
		System.out.println(++contador);
		System.out.println(contador);

		System.out.println("Decremento");
		int contador2 = 3;
		System.out.println(contador2--);
		System.out.println(contador2);
		contador2 = 3;
		System.out.println(--contador2);
		System.out.println(contador2);

		// Operadores de asignación directa
		System.out.println("Operadores de asignacion directa");
		int meses = 1;
		meses = meses + 3;
		System.out.println(meses);
		meses /= 2;
		System.out.println(meses);
	}
}