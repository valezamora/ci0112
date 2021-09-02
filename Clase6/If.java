class If {
	public static void main(String[] args) {
		// instrucciones que siempre se ejecutan 
		System.out.println("Antes del if");
		int primerNumero = 25;
		int segundoNumero = 30;
		
		
		if(primerNumero > segundoNumero) {
			System.out.println("El primer numero es mayor.");
			// instrucciones si es verdadera la condicion
		}

		if(primerNumero < segundoNumero) {
			System.out.println("El segundo numero es mayor.");
			// instrucciones si es verdadera la condicion
		}

		if(primerNumero == segundoNumero) {
			System.out.println("Los dos numeros son iguales.");
			// instrucciones si es verdadera la condicion
		}
	
		// If else
		if (primerNumero >= segundoNumero) {
			System.out.println("El primere numero es mayor o igual.");
		} else {
			System.out.println("ELSE - El segundo numero es mayor.");
		}

		System.out.println("Despues del if");
		System.out.println("Resto del programa");
		// instrucciones que siempre se ejecutan 
	}
}