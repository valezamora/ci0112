
/**
 * Write a description of class Calculadora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculadora
{
    public int sumatoriaFor(int inicio, int fin) {
        int resultado = 0;
        for(int i = inicio; i <= fin; ++i) {
            resultado += i;
        }
        return resultado;
    }
    
    public int sumatoriaWhile(int inicio, int fin) {
        int resultado = 0;
        int i = inicio;
        while(i <= fin) {
            resultado += i;
            ++i;
        }
        return resultado;
    }
    
    public int sumatoriaRec(int inicio, int fin) {
        if (fin > inicio) {
            return fin + sumatoriaRec(inicio, fin-1);
        } else {
            return fin;
        }
    }
    
    public double aproxPi(int terminos) {
        return 0;
    }
    
    /**
     * Solucion usando for
     * 
     * @author Antonio Badilla
     */
    public double aproxPi1(int terminos){ 
        double piAprox = 0; 
        for (int n = 0; n <= terminos; n++){    
            piAprox += (Math.pow(-1,n)/((2*n)+1)); 
        }     
        return piAprox*4;
    }
    
    
    /**
     * Solucion usando while
     * 
     * @author Omar
     */
    public double aproxPi2(int cantTerm) {
        double fun = 0;
        while (cantTerm >= 0 ){        
            fun += 4 * (Math.pow(-1,cantTerm) / ((2 * cantTerm) + 1 ));   
            cantTerm -= 1;
        }    
        return fun;
    }
    
    /**
     * Solucion usando for y metodo privado
     */
    public double aproxPi3(int terminos) {
        double resultado = 0;
        for (int i = 0; i <= terminos; ++i) {
            resultado += calcularTermino(i);
        }
        return resultado;
    }
    
    private double calcularTermino(int termino) {
        double signo = Math.pow(-1, termino);
        double denominador = (2 * termino) + 1;
        return 4 * signo / denominador;
    }

    /**
     * @author Ethan
     */
    public double aproxPiRecursiva1(int terminos) {
        double termino = 4 * (Math.pow(-1, terminos) / ((2 * terminos) + 1));
        if (terminos > 0) {    
            return termino + aproxPiRecursiva1(terminos - 1);  
        } else {
            return termino;     
        } 
    }
    
    /**
     * @author Antonio Badilla
     */
    public double aproxPiRec(int terminos){  
        if(terminos == 0) {    
            return 4;        
        } else {           
            return (4*((Math.pow(-1,terminos))/((2*terminos)+1)) + aproxPiRec(terminos-1));   
        } 
    }
    
    /**
     * @author Yerlan
     */
    public double aproxPiRecursiva3(int terminos) {
        if ( 0 <= terminos ) {   
            return (4 * (Math.pow(-1, terminos)) / (2 * terminos + 1)) + aproxPiRecursiva3(terminos - 1);    
        } else { 
            // mi condicion de parada es -1         
            return 0;   
        }    
    }
    
    /**
     * @author Brandon Mora
     */
    public double aproximacionDePiRecur4(int terminos) {  
        if (terminos == 0){       
            return 4;     
        } else {      
            return (4)*(Math.pow(-1,terminos)/(2*terminos+1)) + aproximacionDePiRecur4(terminos-1);  
        } 
    }

    /**
     * @author Jorge Diaz
     */
    public double aproximacionDePiRecursivo5(int terminos)    {      
        if (0 < terminos){  
            return (4 * (Math.pow( (-1), terminos ) ) / ((2 * terminos) + 1)) + aproximacionDePiRecursivo5(terminos-1);     
        } else {    
            return 4; // terminos + 4;    
        }            
    }
}
