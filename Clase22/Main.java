public class Main
{
    public static void main(String args[]) {
        Lista lista = new Lista();
        
        for (int i = 10; i <= 20; ++i) {
            lista.agregarElemento(i);
        }
        
        System.out.println(lista);
        
        System.out.println("Vamos a borrar un elemento");
        try {
            lista.eliminarElemento(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(lista);
        System.out.println(lista.getStringInvertido());
        
        int p = lista.buscar(15);
        System.out.println("El 15 esta en la posicion " + p);
        
        try{
            int valor = lista.getValor(-3);
            System.out.println("La posicion 4 tiene " + valor);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int cantidad  = lista.getCantidadDeElementos();
        System.out.println("Cantidad de elementos: " + cantidad);
        
    }
}
