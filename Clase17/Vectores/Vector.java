
public class Vector
{
    int[] vector;
    
    public Vector(int[] vector) {
        this.vector = vector;
    }
    
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    public void ordenamientoSeleccion() {
        for (int i = 0; i < vector.length - 1; ++i) {
            int menor = vector[i];
            int posicionMenor = i;
            
            // Busco el menor
            for (int j = i + 1; j < vector.length; ++j) {
                if (vector[j] < menor) {
                    menor = vector[j];
                    posicionMenor = j;
                }
            }
            System.out.println(this);
            
            // Intercambiar el numero menor al principio del resto del vector
            if (posicionMenor != i) {
                int temp = vector[i];
                vector[i] = vector[posicionMenor];
                vector[posicionMenor] = temp;
            }
        }
    }
    
    public int busquedaSecuencial(int valorAEncontrar) {
        int indice = -1;
        
        for (int i = 0; i < vector.length; ++i) {
           if (vector[i] == valorAEncontrar) {
               indice = i;
               i = vector.length;
            } 
           System.out.println("Indice = " + indice); 
        }
        
        // Otra opcion
        /*
        int j = 0;
        while(indice == -1 && j < vector.length) {
            if (vector[j] == valorAEncontrar) {
               indice = j;
            }
            ++j;
           System.out.println("Indice = " + indice); 
        }
        */
        return indice;
    }
    
    public boolean busquedaBinaria(int valorAEncontrar) {
        return busquedaBinaria(valorAEncontrar, vector);
    }
    
    public boolean busquedaBinaria(int valorAEncontrar, int[] numeros) {
        int mitad = numeros.length/2;
                
        if (numeros[mitad] == valorAEncontrar) {
            // encontre el valor
            return true;
        } else if(numeros.length == 1) { // mitad es cero
            return false;
        } else if (numeros[mitad] > valorAEncontrar) {
            // mi numero esta antes de la mitad del vector
            int[] nuevoVector = new int[mitad];
            for (int i = 0; i < nuevoVector.length; ++i ) {
                nuevoVector[i] = numeros[i];
            }
            System.out.println(getVectorString(nuevoVector));
            return busquedaBinaria(valorAEncontrar, nuevoVector);
        } else {
            // mi numero esta despues de la mitad
            int tamanoVector = numeros.length % 2 == 0 ? (numeros.length - mitad) : (numeros.length - mitad - 1);
            int[] nuevoVector = new int[tamanoVector];
            int sumar = numeros.length % 2 == 0 ? 0 : 1;
            for (int i = 0; i < nuevoVector.length; ++i ) {
                nuevoVector[i] = numeros[mitad + sumar + i];
            }
            System.out.println(getVectorString(nuevoVector));
            return busquedaBinaria(valorAEncontrar, nuevoVector);
        }
    }
    
    private String getVectorString(int[] v) {
        String resp = "";
        for (int j = 0; j < v.length; ++j) {
            resp += v[j] + " ";
        }
        return resp;
    }
    
    public String toString() {
        return getVectorString(vector);
    }
}
