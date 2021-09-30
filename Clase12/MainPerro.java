
/**
 * Main para probar la clase Perro
 * Crear vector de perros
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainPerro
{
    public static void main(String[] args) {
        // Metodo original de crear objetos - repaso
        Perro miPerro1 = new Perro("Bob");
        Perro miPerro2 = new Perro("Candy");
        System.out.println(miPerro1);
        System.out.println(miPerro2); 

        // Usando vectores para almacenar varios objetos del mismo tipo que tienen alguna relacion entre ellos
        Perro misPerros[] = new Perro[2];
        System.out.println("Mis perros despues de declarar vector");
        // Imprimir vector inicial tienen todas las celdas en null porque no le he creado perros a cada una
        for (int i = 0; i < misPerros.length; ++i) {
            System.out.println(misPerros[i]);
        }
        // Se crean instancias de perro en el vector
        misPerros[0] = new Perro("Bob");
        misPerros[1] = new Perro("Candy");
        System.out.println("Mis perros despues de inicializar objetos");
        for (int i  = 0; i < misPerros.length; ++i) {
            System.out.println(misPerros[i]);
        }   
        // Asigno edad al perro de la celda 1
        misPerros[1].setEdad(10);
        for (int i  = 0; i < misPerros.length; ++i) {
            System.out.println(misPerros[i]);
        } 
    }
}
