
/**
 * Suponga que quiere romper el collar en algún momento,
 * desplegarlo en una línea recta, luego comenzar a recolectar cuentas del mismo color desde un extremo hasta que encuentre una cuenta de un color diferente,
 * haga lo mismo en el otro extremo (el color puede ser diferente al recogido anteriormente).
 * Determine dónde romper el collar para recolectar el número máximo de perlas.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]) {
      Collar b = new Collar( "TTBBNNTT" );
      Collar c = new Collar( "BBBNTTNNBNNBT" );
      Collar d = new Collar( "TTTTTTTTT" );
      Collar e = new Collar();
      int [] x = new int[ 2 ];
      int n = 0;

      x = b.puntoDeCorte();
      System.out.println( "Para el collar <" + b + ">" );
      System.out.println( "El corte que da la secuencia más larga de perlas es en " + x[0] + " y tiene " + x[1] + " perlas" );

      x = c.puntoDeCorte();
      System.out.println( "Para el collar <" + c + ">" );
      System.out.println( "El corte que da la secuencia más larga de perlas es en " + x[0] + " y tiene " + x[1] + " perlas" );

      x = d.puntoDeCorte();
      System.out.println( "Para el collar <" + d + ">" );
      System.out.println( "El corte que da la secuencia más larga de perlas es en " + x[0] + " y tiene " + x[1] + " perlas" );

      System.out.println( e );
   }
}
