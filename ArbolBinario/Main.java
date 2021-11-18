
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
        arbol.agregarElemento(0);
        arbol.agregarElemento(2);

        System.out.println("preorden: " + arbol.recorridoPreorden());
        
        System.out.println("inorden: " + arbol.recorridoInorden());
        
        System.out.println("posorden: " + arbol.recorridoPosorden());
        
        System.out.println("Esta el 13? " +  arbol.buscar(13));
        
        try {
            arbol.eliminarElemento(8);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(arbol.recorridoPreorden());
    }
}
