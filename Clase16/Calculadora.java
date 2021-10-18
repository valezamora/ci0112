public class Calculadora {

    
    private double signo(long t ){
       return Math.pow(-1,t+1);
    }
    
    private double denominador( long t){
       return 2.0 * t - 1.0;
    }
    public double pi00(long t){
       double aproximacionDePi = 0;
       for(long i = 1; i <= t; ++i){
          aproximacionDePi+= signo( i ) * 4.0 / denominador( i ); 
       } 
       
       return aproximacionDePi;
    }

    public double pi01(long t){
       double aproximacionDePi = 0;
       double termino = 0;
       double denominador = 1.0;
       boolean suma = true;
       for( long i = 0; i < t; ++i){
          termino = 4.0 / denominador;
          if(suma){
             aproximacionDePi+= termino;  
          }
          else {
             aproximacionDePi-= termino;  
          }
          suma = !suma;
          denominador+=2.0;
       }
       return aproximacionDePi;
    } 
    
    public double pi02(long t){
       double aproximacionDePi = 0;
       Punto punto = new Punto();
       long puntosEnCuadrado = 1;
       long puntosEnCirculo = 1;
       
       for(long i = 0; i< t; ++i){
          punto = punto.saltar();
          puntosEnCuadrado++;
          if(punto.dentroCirculo()){
            puntosEnCirculo++;  
          }
       }
       aproximacionDePi = 4.0 * puntosEnCirculo / puntosEnCuadrado;
       return aproximacionDePi;
    }    
}
