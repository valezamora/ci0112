
public class Main
{
    public static void main(String args[]){
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.agregarElemento(8);
        arbol.agregarElemento(3);
        arbol.agregarElemento(10);
        arbol.agregarElemento(1);
        arbol.agregarElemento(6);
        arbol.agregarElemento(4);
        arbol.agregarElemento(7);
        arbol.agregarElemento(14);
        arbol.agregarElemento(13);
        arbol.agregarElemento(9);
        System.out.println(arbol.recorridoPreorden());
    }
}
