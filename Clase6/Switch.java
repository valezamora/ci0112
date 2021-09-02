class Switch {
	public static void main(String[] args) {
		// instrucciones que siempre se ejecutan 
		System.out.println("Antes del switch");

		// Switch
		
		int edad = 50;
		switch(edad) {
			case 20:
				System.out.println("Es 20");
				break;
			case 30:
				System.out.println("Es 30");
				break;
			case 40:
				System.out.println("Es 40");
				break;
			case 50:
				System.out.println("Es 50");
				break;
			default:
				System.out.println("No es ninguno de los casos, entra en default.");
		}
		

		System.out.println("Resto del programa");
		// instrucciones que siempre se ejecutan 
	}
}