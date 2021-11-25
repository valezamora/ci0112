public class TrabajoEnClase
{
    public static void main(String[] args) {
        Integer[] unVector = {2, 7, 6, 5, 11, 9, 12};
        ArbolBinario unArbol = new ArbolBinario (unVector);
        System.out.println("Un árbol en orden:");
        System.out.println(""+unArbol);
        System.out.println();
        System.out.println();
        Integer[] otroVector = {2, 1, 3};
        ArbolBinario otroArbol = new ArbolBinario (otroVector);
        System.out.println("Otro árbol en orden:");
        System.out.println(""+otroArbol);
        System.out.println();
        System.out.println();
        Integer[] unUltimoVector = {11, 9, 12};
        ArbolBinario unUltimoArbol = new ArbolBinario (unUltimoVector);
        System.out.println("Un último árbol en orden:");
        System.out.println(""+unUltimoArbol);
        System.out.println();
        System.out.println();
        if (unArbol.esSubarbol(otroArbol)) {
            System.out.println("Otro árbol es un subárbol de un árbol.");
        }
        else {
            System.out.println("Otro árbol no es un subárbol de un árbol.");
        }
        if (unArbol.esSubarbol(unUltimoArbol)) {
            System.out.println("Un último árbol es un subárbol de un árbol.");
        }
        else {
            System.out.println("Un último árbol no es un subárbol de un árbol.");
        }
    }
}
