import java.util.Random;

public class Isla
{
    private char tablero[][];
    private int posicionPirata[];
    private int posicionTesoro[];
    private boolean perdio;
    private boolean gano;
    private boolean tieneTesoro;
    private int cantidadDeMovimientosRealizados;
    private final char AGUA = 'A';
    private final char PIRATA = 'P';
    private final char TESORO = 'T';
    private final char SALIDA = 'S';
    private final int CANT_MOVIMIENTOS = 20;
    private final int SUMA_FILA[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    private final int SUMA_COLUMNA[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static final String DIRECCIONES[] = {"arriba-izq", "arriba", "arriba-der", "izq", "derecha", "abajo-izq", "abajo", "abajo-der"};

    public Isla()
    {
        init(10, 10);
    }
    
    private void init(int filas, int columnas) {
        this.perdio = false;
        this.gano = false;
        this.tieneTesoro = false;
        this.cantidadDeMovimientosRealizados = 0;
        this.tablero = new char[filas][columnas];
        // poner agua
        for(int i = 0; i < filas; ++i) {
            tablero[i][0] = AGUA;
            tablero[i][columnas-1] = AGUA;
        }
        for(int i = 0; i < columnas; ++i) {
            tablero[0][i] = AGUA;
            tablero[filas-1][i] = AGUA;
        }
        // poner salidas
        tablero[0][tablero[0].length-1] = SALIDA;
        tablero[tablero.length-1][0] = SALIDA;
        
        Random r = new Random();
        int f = r.nextInt(filas - 2 - 1 + 1);
        int c = r.nextInt(columnas - 2 - 1 + 1);
        // poner tesoro
        tablero[f][c] = TESORO;
        this.posicionTesoro = new int[2];
        this.posicionTesoro[0] = f;
        this.posicionTesoro[1] = c;
        
        // poner pirata
        do {
            f = r.nextInt(filas - 2) + 1;
            c = r.nextInt(columnas - 2) + 1;
        } while (f == posicionTesoro[0] || c == posicionTesoro[1]);
        tablero[f][c] = PIRATA;
        this.posicionPirata = new int[2];
        this.posicionPirata[0] = f;
        this.posicionPirata[1] = c;
    }
    
    public void moverPirata(int direccion) {
        if (direccion < 0 || direccion >= DIRECCIONES.length) {
            return;
        }
        // quitamos pirata
        tablero[posicionPirata[0]][posicionPirata[1]] = '-';
        // movemos pirata
        int nuevaFila = posicionPirata[0] + SUMA_FILA[direccion];
        int nuevaColumna = posicionPirata[1] + SUMA_COLUMNA[direccion];
        if (nuevaFila < 0 || nuevaFila >= tablero.length || nuevaColumna < 0 || nuevaColumna >= tablero[0].length) {
            return;
        }
        if (tablero[nuevaFila][nuevaColumna] == TESORO) {
            this.tieneTesoro = true;
        }
        this.cantidadDeMovimientosRealizados++;
        if (tablero[nuevaFila][nuevaColumna] == AGUA || this.cantidadDeMovimientosRealizados > this.CANT_MOVIMIENTOS) {
            this.perdio = true;
        }
        if (tieneTesoro && tablero[nuevaFila][nuevaColumna] == SALIDA && this.cantidadDeMovimientosRealizados <= this.CANT_MOVIMIENTOS) {
            this.gano = true;
        }
        posicionPirata[0] = nuevaFila;
        posicionPirata[1] = nuevaColumna;
        tablero[posicionPirata[0]][posicionPirata[1]] = PIRATA;
    }
    
    public boolean pista() {
        boolean estaCerca = false;
        for (int i = 0; i < SUMA_FILA.length && !estaCerca; ++i) {
            if (tablero[posicionPirata[0] + SUMA_FILA[i]][posicionPirata[1] + SUMA_COLUMNA[i]] == TESORO) {
                estaCerca = true;
            }
        }
        return estaCerca;
    }
    
    public boolean getPerdio() {
        return perdio;
    }
    
    public boolean getGano() {
        return gano;
    }
    
    public int getMovimientosDisponibles() {
        return CANT_MOVIMIENTOS - cantidadDeMovimientosRealizados;
    }
    
    public String getStringDirecciones() {
        String res = "";
        for(int i = 0; i < DIRECCIONES.length; ++i) {
            res += i + ": " + DIRECCIONES[i] + "\n";
        }
        return res;
    }
    
    public String toString() {
        String res = "";
        for(int i = 0; i < tablero.length; ++i) {
            for (int j = 0; j < tablero[i].length; ++j) {
                res += tablero[i][j] + "\t";
            }
            res += "\n";
        }
        return res;
    }
}
