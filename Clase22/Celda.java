
public class Celda
{
    private int valor;
    private Celda anterior;
    private Celda siguiente;
    
    public Celda(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public Celda(int valor, Celda anterior) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = anterior;
    }
    
    public Celda(int valor, Celda anterior, Celda siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public int getValor() {
        return valor;
    }
    
    public Celda getAnterior() {
        return anterior;
    }
    
    public Celda getSiguiente() {
        return siguiente;
    }
    
    public void setAnterior(Celda anterior) {
        this.anterior = anterior;
    }
    
    public void setSiguiente(Celda siguiente) {
        this.siguiente = siguiente;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
}
