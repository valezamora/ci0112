public class Nodo
{
    private int valor;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;
    
    public Nodo(int valor) {
        this.valor = valor;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
    
    public int getValor() {
        return valor;
    }
    
    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }
    
    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    public void insertar(int valorAInsertar) {
        if (valorAInsertar < this.valor) {
            // Insertar al lado izquierdo
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = new Nodo(valorAInsertar);
            } else {
                this.hijoIzquierdo.insertar(valorAInsertar);
            } 
        } else if (valorAInsertar > this.valor) {
            //Insertar al lado derecho
            if (this.hijoDerecho == null) {
                this.hijoDerecho = new Nodo(valorAInsertar);
            } else {
                this.hijoDerecho.insertar(valorAInsertar);
            }
        }
    }
}
