import javax.swing.JOptionPane;

class NumeroMayor {
	public static void main(String[] args) {
		String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero.");
		int primerNumeroEntero = Integer.parseInt(primerNumero);
		double primerNumeroDouble = Double.parseDouble(primerNumero);

		String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero.");
		int segundoNumeroEntero = Integer.parseInt(segundoNumero);

		if (primerNumeroEntero > segundoNumeroEntero) {
			JOptionPane.showMessageDialog(null, "El numero " + primerNumeroEntero + " es mayor que " + segundoNumero);
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + primerNumeroEntero + " es menor o igual que " + segundoNumero);
		}
	}
}
