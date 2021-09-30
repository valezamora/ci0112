
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        // Crea un vector de 5 celdas "vacias"
        // declaracion de un vector: tipoDeDatos nombreDeVariable[]
        int v[] = new int[5];
        v[0] = 10;
        v[1] = 11;
        v[2] = 12;
        v[3] = 13;
        v[4] = 14;
        int numeros[] = {10, 11, 12, 13, 14};
        int miVector[] = new int[numeros.length];
        
        System.out.println("El tamano del vector es " + v.length);

        System.out.println("Mi vector de numeros es:");
        for (int i = 0; i < v.length; ++i) {
            System.out.println(v[i]);
            v[i] = i;
        }
        
        System.out.println("Mi nuevo vector de numeros es:");
        for (int i = 0; i < v.length; ++i) {
            System.out.println(v[i]);
        }
        
        // para mi nuevo vector inicializar valores
        System.out.println("miVector de numeros es:");
        for (int i = 0; i < miVector.length; ++i) {
            miVector[i] = 20 + i;
            // Si hacemos += va a sumarle al valor almacenado en cada posicion (en este caso 0)
            // miVector[i] += 20; es lo mismo que miVector[i] = 20 + miVector[i];
        }
        for (int i = 0; i < miVector.length; ++i) {
            System.out.println(miVector[i]);
        }
        
        // USANDO CHAR
        char nombre[] = {'v', 'a', 'l', 'e', 'r', 'i', 'a'};
        char letras2[] = new char[7];
        
        System.out.println("El tamano del vector letras2 es " + letras2.length);
        for (int i = 0; i < letras2.length; ++i) {
            System.out.println(letras2[i]);
        }
        
        System.out.println(nombre[nombre.length - 1]);
        
        
        // Usar clase ejemplo vectores
        EjemploVectores ejemploVectores = new EjemploVectores();
        int vectorOriginal[] = {10, 11, 12, 13, 14};
        System.out.print('[');
        for (int i = 0; i < vectorOriginal.length; ++i) {
            System.out.print(vectorOriginal[i] + " ");
        }
        System.out.println(']');
        int[] vectorMas1 = ejemploVectores.sumar1(vectorOriginal);
        System.out.println("Despues de llamar sumar1");
        for (int i = 0; i < vectorMas1.length; ++i) {
            System.out.println(vectorMas1[i]);
        }
    }
}
