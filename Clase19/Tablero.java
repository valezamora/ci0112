public class Tablero
{
    private Ficha matriz[][];
    private int filaVacia[];
    // 0=este , 1=sur-oeste, 2=sur, 3=sur-este 
    private static final int SUMA_FILA[] = {0, 1, 1, 1,};
    private static final int SUMA_COLUMNA[] = {1, -1, 0, 1};

    /**
     * Constructor for objects of class Tablero
     */
    public Tablero()
    {
        _init(6, 8);
    }
    
    public Tablero(int filas, int columnas)
    {
        _init(filas, columnas);
    }
    
    public Tablero(Tablero otroTablero) {
        copiarTablero(otroTablero);
    }
    
    public Ficha[][] getMatriz() {
        return matriz;
    }
    
    public int[] getFilaVacia() {
        return filaVacia;
    }
    
    /**
     * Poner una ficha en el tablero en la columna indicada
     * @param columna La columna donde voy a poner la ficha (entre 0 y m-1)
     * @param ficha La Ficha que se va a guardar
     */
    public void ponerFicha(int columna, Ficha ficha) {        
        // Poner la ficha en la columna y la ultima fila vacia
        // Es una columna valida?
        // Cual es mi ultima fila?
        // Opcion 1: poner recorrer la columna y buscar la primera posicion donde haya una ficha, coloco la ficha en la fila anterior
        // Opcion 2: guardar en un vector la primera posicion disponible en cada columna
        // Poner la ficha en la columna indicada
        
        if (esColumnaValida(columna) && columaTieneEspacio(columna)) {
            matriz[filaVacia[columna]][columna] = ficha;
            filaVacia[columna]--; 
        }
    }
    
    public boolean gano(Ficha ficha) {
        boolean esGanador = false;
        // Verificar si la ficha es la ganadora
        // 1. Recorrer el tablero 
        // 2. Ver si la ficha es igual a ficha (parametro)
        // 3. Moverme hacia una direccion para buscar si los vecinos son iguales y hay 4 en la misma direccion (usando el metodo contarFichas)
        for(int i = 0; !esGanador && i < matriz.length; ++i) {
            for(int j = 0; !esGanador && j < matriz[i].length; ++j) {
                // For para verificar todas las direcciones
                for (int k = 0; (k < 4 && !esGanador); ++k) {
                    int cantidadFichas = contarFichas(i, j, matriz[i][j], k);
                    if (cantidadFichas >= 4) {
                        esGanador = true;
                    }
                    // llamar a metodo contar fichas
                    // Revisar si hay 4 iguales para alguna direccion del color de mi ficha
                    // si hay 4 o mas iguales esGanador = true
                }
            }
        }
        return esGanador;
    }
    
    public boolean hayEspacioEnTablero() {
        int columnasLlenas = 0;
        for(int i = 0; i < filaVacia.length; ++i) {
            if (filaVacia[i] < 0) {
                columnasLlenas++;
            }
        }
        return columnasLlenas == filaVacia.length ? false : true;
    }
    
    // IMPLEMENTAR
    public String toString() {
        return "";
    }
    
    private void _init(int filas, int columnas) {
        matriz = new Ficha[filas][columnas];
        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = new Ficha('-');
            }
        }
        filaVacia = new int[columnas];
        for(int i = 0; i < filaVacia.length; ++i) {
            filaVacia[i] = filas-1;
        }
    }
    
    private void copiarTablero(Tablero otroTablero) {
        matriz = new Ficha[otroTablero.getMatriz().length][otroTablero.getMatriz()[0].length];
        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = new Ficha(matriz[i][j].getColor());
            }
        }
        filaVacia = new int[matriz[0].length];
        for(int i = 0; i < filaVacia.length; ++i) {
            filaVacia[i] = otroTablero.getFilaVacia()[i];
        }
    }
    
    private boolean esColumnaValida(int columna) {
        return columna >= 0 && columna < matriz[0].length;
    }
    
    private boolean columaTieneEspacio(int columna) {
        return filaVacia[columna] >= 0;
    }
    
    /**
     * Saber la cantidad de fichas iguales seguidas que hay de un color hacia una direccion especifica
     */
    private int contarFichas(int fila, int columna, Ficha ficha, int direccion) {
        int contador = 0;
        
        // IMPLEMENTAR
        
        return contador;
    }
}
