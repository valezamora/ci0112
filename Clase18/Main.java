

public class Main
{
    public static void main(String[] args) {
        char[][] palabras = new char[3][4];
        palabras[0][0] = 'p';
        palabras[0][1] = 'e';
        palabras[1][2] = 'r';
        palabras[0][3] = 'a';
        
        for(int i = 0; i < palabras.length; ++i) {
            for (int j = 0; j < palabras[i].length; ++j) {
                System.out.print(palabras[i][j] + "\t");
            } 
            System.out.print("\n");
        }
        
        int[][] numeros = new int[6][6];
        for(int i = 0; i < numeros.length; ++i) {
            for (int j = 0; j < numeros[i].length; ++j) {
                numeros[i][j] = i + j;
            } 
        }
        
        for(int i = 0; i < numeros.length; ++i) {
            for (int j = 0; j < numeros[i].length; ++j) {
                System.out.print(numeros[i][j] + "\t");
            } 
            System.out.print("\n");
        }
        // Esto nos daria la direccion de memoria de la fila 0 
        // System.out.print(numeros[0]);
        
        // Diagonal
        // Si la cantidad de filas es menor a la cantidad de columnas
        System.out.println("Diagonal de la matriz");
        int largoDiagonal = numeros.length <= numeros[0].length ? numeros.length : numeros[0].length;
        int c = 0;
        int f = 0; // numeros.length - 1;
        for(int i = 0; i < largoDiagonal; ++i) {
            System.out.println(numeros[f][c]);
            ++f; // --f;
            ++c;
        }
        
        // Recorrido de celdas vecinas
        System.out.println("Celdas vecinas");
        int fila = 0;
        int columna = 0;
        System.out.println("Vecinos para " + numeros[fila][columna]);
        for(int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int filaVecina = fila + i;
                int columnaVecina = columna + j;
                // Evitar que se salga de la matriz
                if (filaVecina >= 0 && columnaVecina >= 0 && filaVecina < numeros.length && columnaVecina < numeros[0].length) {
                    // Ignorar la celda actual porque solo queremos los vecinos
                    if(i != 0 || j != 0) {
                        System.out.print(numeros[filaVecina][columnaVecina] + "\t");
                    }
                }
            }
        }
        
        System.out.println();
        // Usando vectores
        int[] sumaFila = {-1,-1,-1,0,0,1,1,1};
        int[] sumaColumna = {-1,0,1,-1,1,-1,0,1};
        for (int i = 0; i < sumaFila.length; ++i) {
            int filaVecina = fila+sumaFila[i];
            int columnaVecina = columna+sumaColumna[i];
            // Evitar que se salga de la matriz
            if (filaVecina >= 0 && columnaVecina >= 0 && filaVecina < numeros.length && columnaVecina < numeros[0].length) {
                System.out.print(numeros[filaVecina][columnaVecina] + "\t");
            }
        }
    }
}
