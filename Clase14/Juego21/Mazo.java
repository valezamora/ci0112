import java.util.Random;

public class Mazo
{
    private Carta cartas[];
    private int siguienteCarta;
    
    public Mazo() {
        cartas = new Carta[52];
        inicializarCartas();
        siguienteCarta = 0;
    } 
    
    private void inicializarCartas() {
        // Inicializar valores de las cartas
        String posiblesValores[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String palos[] = {"corazones", "espada", "diamantes", "treboles"}; 
        for (int i =  0;  i < posiblesValores.length ; ++i) {
            for(int j = 0; j < palos.length; ++j) {
                int posicionDeLaCarta = i + posiblesValores.length * j;
                cartas[posicionDeLaCarta] = new Carta(posiblesValores[i], palos[j]);
            }
        }
    }
    
    public void barajarCartas() {
        Random rand = new Random();
        for (int i = 0; i < cartas.length; ++i) {
            int nuevaPosicion = rand.nextInt(52);
            
            Carta temp = cartas[i];
            cartas[i] = cartas[nuevaPosicion];
            cartas[nuevaPosicion] = temp;
        }
        siguienteCarta = 0;
    }
    
    public Carta sacarCarta() {
        Carta carta;
        if (siguienteCarta < 51) {
            carta = cartas[siguienteCarta];
            ++siguienteCarta;
        } else if (siguienteCarta == 51) {
            carta = cartas[siguienteCarta];
            siguienteCarta = 0;
        } else {
            carta = cartas[0];
            siguienteCarta = 1;
        }
        
        return carta;
    }
    
    public String toString() {
        String resultado = "";
        for (int i = 0; i < cartas.length; ++i) {
            resultado += cartas[i].getValor() + " ";
        }
        return resultado;
    }
}
