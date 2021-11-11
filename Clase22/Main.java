
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
    }
}
