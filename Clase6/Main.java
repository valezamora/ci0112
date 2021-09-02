class Main {
	public static void main(String[] args) {
		int numeroMayor = 10;
		int numeroMenor = 2;
		System.out.println("== " + (numeroMayor == numeroMenor));
		System.out.println("!= " + (numeroMayor != numeroMenor));
		System.out.println("> " + (numeroMayor > numeroMenor));
		System.out.println("< " + (numeroMayor < numeroMenor));
		System.out.println(">= " + (numeroMayor >= numeroMenor));
		System.out.println("<= " + (numeroMayor <= numeroMenor));

		boolean sonIguales = numeroMayor == numeroMenor;
		boolean esMayor = numeroMayor > numeroMenor;
		boolean esMayorOIgual = numeroMayor >= numeroMenor;

		// false && true
		// true && false
		System.out.println("&& " + (sonIguales && esMayor));
		// true && true
		System.out.println("&& " + (esMayorOIgual && esMayor));
		// false && false
		System.out.println("&& " + (sonIguales && sonIguales));

		// false || true
		// true || false
		System.out.println("false || true: " + (sonIguales || esMayor));
		// true || true
		System.out.println("true || true: " + (esMayorOIgual || esMayor));
		// false || false
		System.out.println("false || false: " + (sonIguales || sonIguales));

		// false ^ true
		// true ^ false
		System.out.println("false ^ true: " + (sonIguales ^ esMayor));
		// true ^ true
		System.out.println("true ^ true: " + (esMayorOIgual ^ esMayor));
		// false ^ false
		System.out.println("false ^ false: " + (sonIguales ^ sonIguales));

		// !true
		System.out.println("!true: " + (!true));
		// !false
		System.out.println("!false: " + (!false));

		// (8 > 6) && !false
		// true && true 
		// true
		boolean expresionLogica = ((3 + 5) > (3 * 2)) && !(10 < 8);
		System.out.println(expresionLogica);
	}
}