public class ArbolBinario
{
    private Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }

    public ArbolBinario(int valor){
        this.raiz = new Nodo(valor);
    }
    
    /**
     * Metodo para guardar un elemento en el arbol
     */
    public void agregarElemento(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            raiz.insertar(valor);
        }
    }

    public void eliminarElemento(int valor) {
        
    }
    
    /**
     * Busca si un valor se encuentra en el arbol o no
     */
    public boolean buscar(int valor) {
        boolean esta = false;
        
        // Recorrer el arbol buscando el valor que queremos
        
        return esta;
    }
    
    /**
     * Preorden: raiz - hijo izquierdo - hijo derecho
     */
    public String recorridoPreorden() {
        String resultado = preorden(raiz);
        return resultado;
    }
    
    private String preorden(Nodo nodo)  {
        String s = "";
        if (nodo == null) {
            s += "";
        } else {
            s += " " + nodo.getValor() + " ";
            s += preorden(nodo.getHijoIzquierdo());
            s += preorden(nodo.getHijoDerecho());
        }
        return s;
    }
    
    /**
     * Preorden: hijo izquierdo - raiz - hijo derecho
     */
    public String recorridoInorden() {
        String resultado = "";
        
        return resultado;
    }
    
    /**
     * Preorden: hijo izquierdo - hijo derecho - raiz
     */
    public String recorridoPosorden() {
        String resultado = "";
        
        return resultado;
    }
}
