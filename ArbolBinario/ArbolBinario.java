public class ArbolBinario
{
    private Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }

    public ArbolBinario(int valor){
        this.raiz = new Nodo(valor);
    }
    
    public ArbolBinario(Integer[] valores) {
        for (int i = 0; i < valores.length; ++i) {
            agregarElemento(valores[i]);
        }
    }
    
    public Nodo getRaiz() {
        return this.raiz;
    }
    
    /**
     * Dos arboles son subarbol si son iguales, es igual al hijo izq, es igual al hijo derecho
     */
    public boolean esSubarbol(ArbolBinario otroArbol) {
        // Buscar raiz de otroArbol en this arbol
        Nodo nodoArbol = this.buscarNodo(otroArbol.getRaiz().getValor(), this.raiz);
        
        if (nodoArbol == null) {
            return false;
        }
        // Si encuentro la raiz, los recorro y comparo que cada nodo sea igual y si todos son iguales es subarbol
        return esSubarbolRec(nodoArbol, otroArbol.getRaiz(), false);
    }
    
    public boolean esSubarbolRec(Nodo arbol, Nodo otroArbol, boolean esSubarbol){
        if (arbol == null && otroArbol == null) {
            esSubarbol = true;  
        } else if (arbol != null && (arbol.getValor() == otroArbol.getValor() || otroArbol == null)) {
            esSubarbol = true;
            if (otroArbol != null) {
                esSubarbol = esSubarbolRec(arbol.getHijoIzquierdo(), otroArbol.getHijoIzquierdo(), esSubarbol);
                esSubarbol = esSubarbolRec(arbol.getHijoDerecho(), otroArbol.getHijoDerecho(), esSubarbol);
            }
        } else {
            esSubarbol = false;
        }
        return esSubarbol;
    }
    
    public boolean esIgual(ArbolBinario otroArbol) {
        return esSubarbolRec(this.raiz, otroArbol.getRaiz(), false);
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

    public void eliminarElemento(int valor) throws Exception {
        Nodo padre = null;
        Nodo eliminar = null;
        if (raiz.getValor() == valor) {
            eliminar = raiz;
        } else {
            // Busco el padre del nodo que tienen mi valor
            padre = buscarPadre(valor, raiz);
            // Guardo nodo que voy a borrar        
            if (padre != null) {
                eliminar = valor > padre.getValor() ? padre.getHijoDerecho() : padre.getHijoIzquierdo();
            }
        }
        
        if (eliminar == null) {
            // No encontre el valor que quiero eliminar
            throw new Exception("El valor que desea eliminar no esta en el arbol.");
        }
        
        System.out.println("Voy a borrar " + eliminar.getValor());
        // Guardo el subarbol que voy a pasar de lugar
        Nodo subarbolIzq = eliminar.getHijoIzquierdo();
        
        // Buscar el la hoja izquierda del hijo derecho 
        Nodo subarbol = eliminar.getHijoDerecho();
        Nodo hoja = null;
        while (hoja == null && subarbol != null) {
            if (subarbol.getHijoIzquierdo() == null) {
                hoja = subarbol;
            }
            subarbol = subarbol.getHijoIzquierdo();
        }
        
        // Asigno el subarbol izquierdo al hijo izquierdo de la hoja
        if (hoja != null) {
            hoja.setHijoIzquierdo(subarbolIzq);
        }
        
        Nodo sustitucion = eliminar.getHijoDerecho() != null ? eliminar.getHijoDerecho() : subarbolIzq;
        
        // Cambio la referencia del padre al hijo derecho del nodo a borrar
        if (padre == null) {
            raiz = sustitucion;
        } else {
            if (valor > padre.getValor()) {
                padre.setHijoDerecho(sustitucion);
            } else {
                padre.setHijoIzquierdo(sustitucion);
            }
        }
    }
    
    /**
     * Devuelve el padre nodo que contiene el valor 
     */
    private Nodo buscarPadre(int valor, Nodo nodo) {
        if (nodo == null) {
            return null;
        } else {
            if (nodo.getHijoIzquierdo().getValor() == valor || nodo.getHijoDerecho().getValor() == valor) {
                return nodo;
            } else {
                if (valor < nodo.getValor()) {
                    return buscarPadre(valor, nodo.getHijoIzquierdo());
                }
                if (valor > nodo.getValor()) {
                    return buscarPadre(valor, nodo.getHijoDerecho());
                }
                return null;
            }
        }
    }
    
    /**
     * Devuelve el nodo que contiene el valor 
     */
    private Nodo buscarNodo(int valor, Nodo nodo) {
        if (nodo == null) {
            return null;
        } else {
            if (nodo.getValor() == valor) {
                return nodo;
            } else {
                if (valor < nodo.getValor()) {
                    return buscarNodo(valor, nodo.getHijoIzquierdo());
                }
                if (valor > nodo.getValor()) {
                    return buscarNodo(valor, nodo.getHijoDerecho());
                }
                return null;
            }
        }
    }
    
    /**
     * Busca si un valor se encuentra en el arbol o no
     */
    public boolean buscar(int valor) {
        // Recorremos en preorden
        return buscarPreorden(valor, raiz, false);
    }
    
    private boolean buscarPreorden(int valor, Nodo nodo, boolean esta) {
        if (nodo == null) {
            return esta;
        } else {
            if (nodo.getValor() == valor) {
                esta = true;
            } else if (!esta) {
                if (valor < nodo.getValor()) {
                    esta = buscarPreorden(valor, nodo.getHijoIzquierdo(), esta);
                }
                if (valor > nodo.getValor()) {
                    esta = buscarPreorden(valor, nodo.getHijoDerecho(), esta);
                }
            }
        }
        return esta;
    }
    
    /**
     * Preorden: raiz - hijo izquierdo - hijo derecho
     */
    public String recorridoPreorden() {
        String resultado = preordenString(raiz);
        return resultado;
    }
    
    private String preordenString(Nodo nodo)  {
        String s = "";
        if (nodo == null) {
            s += "";
        } else {
            s += " " + nodo.getValor() + " ";
            s += preordenString(nodo.getHijoIzquierdo());
            s += preordenString(nodo.getHijoDerecho());
        }
        return s;
    }
    
    /**
     * Inorden: hijo izquierdo - raiz - hijo derecho
     */
    public String recorridoInorden() {
        return inorden(raiz);
    }
    
    private String inorden(Nodo nodo) {
        String s = "";
        if (nodo == null) {
            s += "";
        } else {
            s += inorden(nodo.getHijoIzquierdo());
            s += " " + nodo.getValor() + " ";
            s += inorden(nodo.getHijoDerecho());
        }
        return s;
    }
    
    /**
     * Posrorden: hijo izquierdo - hijo derecho - raiz
     */
    public String recorridoPosorden() {
        return posorden(raiz);
    }
    
    private String posorden(Nodo nodo) {
        String s = "";
        if (nodo == null) {
            s += "";
        } else {
            s += posorden(nodo.getHijoIzquierdo());
            s += posorden(nodo.getHijoDerecho());
            s += " " + nodo.getValor() + " ";
        }
        return s;
    }
    
    public String toString() {
        return recorridoPreorden();
    }
}
