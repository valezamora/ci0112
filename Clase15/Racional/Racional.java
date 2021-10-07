/** 
 * La clase Racional es la clase de los números de la forma a/b
 * donde a y b son de tipo int
 * Cuenta con varios tipos de método Constructor
 * Además cuenta con método para llevar a cabo las operaciones:
 * suma, resta, multiplicacion y division 
 * Un método privado importante para la validación e inicialización
 * de parámetros llamado _init( int numerador, int denominador)
 * que debe verificar que el denominador nunca sea 0 y que
 * al inicializar el Racional quede en su forma simplificada
 * Además un método privado para simplificar() el Racional
 * y un método privado llamado maximoComunDivisor(int x, int y) 
 * que puede ser útil para programar la simplificación.
 * 
 **/  
public class Racional{
    private int numerador;
    private int denominador;

    /** 
     * El primer constructor por omisión no recibe parametros
     * crea un Racional equivalente al 0 , recuerde que
     * denominador no puede ser igual a 0.
     **/
    public Racional(){
        _init(0, 1);
    }

    /** 
     * Constructor por Copia que recibe como para metro un racional
     * crea una copia del Racional que recibe como parámetro
     * @param Racional Número Racional para crear uno con los mismos valores
     **/
    public Racional(Racional otro){
        _init(otro.getNumerador(), otro.getDenominador());
    }

    /** 
     * Constructor que recibe solo el numerador entero
     * @param numerador Se usa para crear un Racional de la forma N/1
     **/
    public Racional(int numerador){
        _init(numerador, 1);
    }

    /** 
     * Constructor con parámetros recibe como parámetros dos enteros
     * @param numerador este numerador va ha ser la parte de arriba de la fracción
     * @param denominador este  denominador va ha se la parte de abajo de la fracción
     **/
    public Racional(int numerador,int denominador){
        _init(numerador, denominador);
    }

    public int getNumerador(){
        return numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    /**
     * Efectua: Crea, calcula y retorna una nueva instancia de Racional con la Suma del
     * la instancia a la que se le aplica el método y el Racional que se recibe como parámetro
     * 
     * @param Racional para sumarlo con el racional al que se le aplica el metodo
     * @return Racional producto de la suma, ya simplificado
     **/
    public Racional mas(Racional otro){
        int numerador = (this.numerador*otro.denominador)+(this.denominador*otro.numerador);
        int denominador = (this.denominador*otro.denominador);
        Racional nuevoRacional = new Racional(numerador,denominador);
        nuevoRacional.simplificar();
        return nuevoRacional;
    }

    /**
     * Efectua: Crea, calcula y retorna una nueva instancia de Racional con la Resta
     * de dos numeros racionales
     * @param Racional que se resta del Racional al que se le aplica el método 
     * @return Racional producto de la resta, en su minima expresion ya simplificado
     **/
    public Racional menos(Racional otro){
        int numerador = (this.numerador*otro.denominador)-(this.denominador*otro.numerador);
        int denominador = (this.denominador*otro.denominador);
        Racional nuevoRacional = new Racional(numerador,denominador);
        nuevoRacional.simplificar();
        return nuevoRacional;
    }

    /**
     * Efectua: Crea, calcula y retorna una nueva instancia de Racional con la multiplicación de dos números racionales
     * @param otro Segundo factor Racional de la multiplicacion para multiplicar por el Racional al que se le aplica el método
     * @return Racional producto de la multiplicacion simplificado
     **/
    public Racional multiplicar(Racional otro){
        int numerador = this.numerador*otro.numerador;
        int denominador = this.denominador*otro.denominador;
        Racional nuevoRacional = new Racional(numerador,denominador);
        nuevoRacional.simplificar();
        return nuevoRacional;
    }

    /**
     * Efectua: Crea, calcula y retorna una nueva instancia de Racional con la division dos numeros racionales
     * @param otro  Racional divisor que divide al Racional al que se le aplica el método
     * @return Racional producto de la division, debidamente simplificado
     **/

    public Racional dividir(Racional otro){        
        Racional nuevo=new Racional();

        nuevo.numerador=this.numerador*otro.denominador;
        nuevo.denominador=this.denominador*otro.numerador;
        
        nuevo.simplificar();
        return nuevo;
    }

    /**
     * Efectua: Retorna un String con una representación del a forma
     * n / d del Racional. Por ejemplo: "7/3" ( y se omite el divisor si es 1)
     * Por ejemplo, si numerador es 12 y denominador 1 será: "12"
     * @return salida la salida es un string con el formato solicitado
     **/
    public String toString(){
        String texto = "";
        if (denominador == 1) {
            texto += numerador;
        } else {
            texto += numerador + "/" + denominador;
        }
        return texto;
    }
    
    // METODOS  PRIVADOS
    /**
     * Método utilitario que calcula el maximo común divisor de dos
     * números y returna su valor
     * @param x Primer número entero
     * @param y Segundo número entero
     * @return int máximo común divisor de los valores: x y
     * UN EJERCICIO INTERESANTE ESTÁ EN EN LIBRO Y ES PROGRAMAR ESTE
     * MÉTODO EN FORMA RECURSIVA
     * 
     * @author Antonio Badilla
     */
    private int maximoComunDivisor(int x, int y){
        int r = 0;
        int a = (x >= y) ? x : y;
        int b = (x < y) ? x : y; 
        r = b; 
        while(a % b != 0) { 
            r = a % b; 
            a = b;   
            b = r;   
        }     
        return r; //r seria el maximo comun divisor 
    }

    /**
     * Método privado para inicializar los valores de numerador y denominador
     * Esto se hace en varios métodos por lo que es mejor programarlo aparte
     * e invocarlo para "modularizar" el código, es como sacar el código
     * común para no repetirlo a lo largo del código.
     * Note que la asignación del numerador y denominador no es independiente
     * ya que si los valores se pueden simplificar hay que hacerlo y se debe
     * controlar que el denominador nunca sea 0 al inicalizar un Racional.
     */
    private void _init(int numerador, int denominador){
        this.numerador = numerador;
        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }
    
    /**
     * Método privado para simplificar un Racional
     */
    private void simplificar(){
        // Cual es el numero mayor que divide numerador y denominador
        int mcd = maximoComunDivisor(numerador, denominador);
        // Dividir numerador y denominador por mcd
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }

}
