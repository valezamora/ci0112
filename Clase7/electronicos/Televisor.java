package electronicos;

/**
 * Clase que representa un televisor y permite cambiar el volumen y canal
*/
public class Televisor {
	// Atributos 
	private boolean encendido;
	private String marca;
	private String modelo;
	private int canal;
	private int volumen;

	// Constantes
	private final int VOLUMEN_MAX = 30;
	private final int CANAL_MAX = 150;
	private final int CANAL_MIN = 1;
	private final int VOLUMEN_MIN = 0;


	// Constructores
	public Televisor(String nuevaMarca) {
		marca = nuevaMarca;
		modelo = "";
		encendido = false;
		canal = 1;
		volumen = 10;
	}

	public Televisor(String nuevaMarca, String nuevoModelo) {
		marca = nuevaMarca;
		modelo = nuevoModelo;
		encendido = false;
		canal = 1;
		volumen = 10;
	}

	// Set y get
	public void setEncendido(boolean estaEncendido) {
		encendido = estaEncendido;
	}

	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}

	public void setModelo(String nuevoModelo) {
		modelo = nuevoModelo;
	}

	public void setCanal(int nuevoCanal) {
		if (nuevoCanal <= CANAL_MAX && nuevoCanal >= CANAL_MIN) {
			canal = nuevoCanal;
		}	
	}

	public void setVolumen(int nuevoVolumen) {
		if (nuevoVolumen <= VOLUMEN_MAX && nuevoVolumen >= VOLUMEN_MIN) {
			volumen = nuevoVolumen;
		}
	}

	public boolean getEncendido(){
		return encendido;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCanal() {
		return canal;
	} 

	public int getVolumen() {
		return volumen;
	} 

	// Metodos
	public void subirVolumen() {
		if ((volumen + 1) < VOLUMEN_MAX) {
			volumen += 2;
		} else if (volumen < VOLUMEN_MAX) {
			volumen ++;
		} else {
			volumen = VOLUMEN_MAX;
		}
	}

	public void bajarVolumen() {
		if (volumen > VOLUMEN_MIN) {
			volumen--;
		}
	}

	public void alternarEncendido() {
		encendido = !encendido;
	}

	public void subirCanal() {
		if (canal >= CANAL_MAX) {
			canal = CANAL_MIN;
		} else {
			canal++;
		}
	}

	public void bajarCanal() {
		if (canal > CANAL_MIN) {
			canal--;
		} else {
			canal = CANAL_MAX;
		}
	}

	public String toString() {
		return "Televisor marca " + marca + " modelo " + modelo + "\nEncendido: " + encendido + "\nVolumen: " + volumen + "\nCanal: " + canal;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Televisor) {
			Televisor teleTemporal = (Televisor) obj;
			if (teleTemporal.marca.equals(marca) && teleTemporal.modelo.equals(modelo)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}