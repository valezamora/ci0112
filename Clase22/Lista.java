public class Lista
{
    private Celda inicio;
    private Celda fin;
    
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    /**
     * Agrega una celda nueva al final de la lista
     */
    public void agregarElemento(int valor) {
        if (inicio == null && fin == null) {
            inicio = new Celda(valor);
            fin = inicio;
        } else {
            Celda nueva = new Celda(valor, fin);
            fin.setSiguiente(nueva);
            fin = nueva;
        }
    }
    
    /**
     * Eliminar el elemento en la posicion dada
     * @param posicion Posicion que se quiere eliminar
     */
    public void eliminarElemento(int posicion) throws Exception {
        if (posicion < 0) {
            throw new Exception("La posicion del elemento debe ser mayor o igual a 0");
        }
        int contador = 0;
        Celda celdaActual = inicio;
        while(contador < posicion && celdaActual != null) {
            celdaActual = celdaActual.getSiguiente();
            contador++;
        }
        
        if (celdaActual == null) {
            throw new Exception("La celda en la posicion " + posicion + " no existe.");
        }
        
        Celda anterior = celdaActual.getAnterior();
        Celda siguiente = celdaActual.getSiguiente();
        if (anterior != null) {
            anterior.setSiguiente(siguiente);
        } else {
            inicio = siguiente;
        }
        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        } else {
            fin = anterior;
        }
    }
    
    /**
     * Busca un valor en la lista y devuelve su posicion. 
     * 
     * @return devuelve la posicion o -1 si no encuentra el valor
     */
    public int buscar(int valor) {
        int posicion = -1;
        int contador = 0;
        Celda celdaActual = inicio;
        while (celdaActual != null && posicion < 0) {
            if (celdaActual.getValor() == valor) {
                posicion = contador;
            } 
            celdaActual = celdaActual.getSiguiente();
            ++contador;
        }
        return posicion;
    }
    
    public String getStringInvertido() {
        String s = "";
        Celda celdaActual = fin;
        while(celdaActual != null) {
            s += celdaActual.getValor() + " -> ";
            celdaActual = celdaActual.getAnterior();
        }
        return s;
    }
    
    public String toString() {
        String s = "";
        Celda celdaActual = inicio;
        while(celdaActual != null) {
            s += celdaActual.getValor() + " -> ";
            celdaActual = celdaActual.getSiguiente();
        }
        return s;
    }
}   
