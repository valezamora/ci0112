
/**
 * Write a description of class Punto here.
 *
 * @author Grupo 08 - Edgar Casasola Valeria Zamora y Estudiantes
 * @version 1.0
 */
public class Punto {
    public static final double SALTO_X_MEDIOS = 0.001;
    public static final double SALTO_Y_MEDIOS = 0.001;
        
    private double x;
    private double y;
    /**
     * Constructor for objects of class Punto
     */
    public Punto(){
       x = Math.random()*2.0;
       y = Math.random()*2.0;
    }

    public Punto(double x, double y){
       this.x = x;
       this.y = y;
    }
    public boolean dentroCuadrado(){
       return x>=0 && x<=2.0 && y >= 0 && y <= 2.0;
    }
    public boolean dentroCirculo(){
       return Math.pow(x - 1.0,2.0) + Math.pow(y-1.0,2.0) <= 1;
    }
    public Punto saltar(){
       Punto nuevo = null;
       double saltoX = 0;
       double saltoY = 0;
       do {
          saltoX = Math.random() * 2.0 * SALTO_X_MEDIOS - SALTO_X_MEDIOS;
          saltoY = Math.random() * 2.0 * SALTO_Y_MEDIOS - SALTO_Y_MEDIOS;
          nuevo = new Punto( this.x + saltoX , this.y + saltoY);
       } while(!nuevo.dentroCuadrado());
       
       return nuevo;
    }
}
