public class Main
{   
    public static void main(String[] args) {
        int[] numeros = {4, 98, 3, 10, 3, 2};
        Vector vector = new Vector(numeros);
        // Ordenamiento por seleccion
        vector.ordenamientoSeleccion();
        System.out.println("Vector resultante: " + vector);
        
        vector.busquedaSecuencial(10);
        
        boolean encontro = vector.busquedaBinaria(100);
        System.out.println("Encontro el 100? " + encontro);
    }
}
