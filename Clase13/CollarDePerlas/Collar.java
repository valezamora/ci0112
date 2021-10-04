/*
 * Represent a pearl collar
 * With Black, White, and Transparent pearls
 * Transparent pearl can be counted as White or Black pearls in sequences
 * @author    Programacion I
 * @version    2018/Oct/5
 */

import java.util.Random;

public class Collar {
   private char [] collar;

    /*
     * Default contructor
     * Create a random length collar and fill with (allowed) colored pearls
     */
   public Collar() {
      Random r = new Random();
      char p = 'T';
      this.collar = new char[ r.nextInt( 50 ) ];
      for ( int i = 0; i < this.collar.length; i++ ) {
          switch ( r.nextInt( 100 ) % 3 ) {
             case 0:
                p = 'B';
                break;
             case 1:
                p = 'T';
                break;
             case 2:
                p = 'N';
                break;
          }
          this.collar[ i ] = p;
      }
   }

    /*
     * Parameter constructor
     * @param    char    an array of chars with collar pearl's distribution
     */
   public Collar( String c ) {
      char a;
      this.collar = new char [ c.length() ];
      for (int i = 0; i < c.length(); i++ ) {
         a = c.charAt( i );
         switch ( a ) {    // The collar can only have Black, White, and Transparent pearls, any other letter is changed to Transparent
            case 'B':
            case 'N':
            case 'T':
               this.collar[ i ] = a;
               break;
            default:
               this.collar[ i ] = 'T';
               break;
         }
      }
   }

    /*
     * Reference constructor
     * @param    Punto    p the original point
     */
   public Collar( Collar p ) {
      this.collar = p.collar;
   }

    /*
     * Get the collar
     * @return    char []    the collar array
     */
   public char [] getCollar() {
      return( this.collar );
   }

    /*
     * Sets the collar from an char array
     * @param    char [] an char array with collar contents
     */
   public void setCollar( char [] c ) {
      this.collar = new char [ c.length ];
      for (int i = 0; i < c.length; i++ ) {
         this.collar[ i ] = c[ i ];
      }
   }

    /*
     * Return a String with collar composition
    */
   public String toString() {
      StringBuffer s = new StringBuffer( "" );
      for ( int i = 0; i < this.collar.length; i++ ) {
         s.append( this.collar[ i ] );
      }
      return s.toString();
   }

   public boolean same( int pos, char baseColor ) {
      if ( pos < 0 || pos >= this.collar.length ) {
         return false;
      }
      return ( ('T' == this.collar[ pos ]) || (baseColor == this.collar[ pos ]) );
   }

    /*
     * Return the next left collar position
     * @param    int    actual position
     * @return    int    next position
     */
   public int moveLeft( int pos ) {
      return ( (pos - 1 < 0) ? this.collar.length - 1 : pos - 1 );
   }

    /*
     * Return the next right collar position
     * @param    int    actual position
     * @return    int    next position
     */
   public int moveRight( int pos ) {
      return ( (pos + 1) % this.collar.length );
   }

   public int buscarPerlasIzquierda(int puntoDeCorte) {
       int cantidadPerlas = 1;
       // La primera perla hacia la izquierda es el indice anterior al punto de corte
       puntoDeCorte = moveLeft(puntoDeCorte);
       char color = collar[puntoDeCorte];
       int puntoDeCorteOriginal = puntoDeCorte;
       
       puntoDeCorte = moveLeft(puntoDeCorte);
       while (same(puntoDeCorte, color) && puntoDeCorte != puntoDeCorteOriginal) {
           puntoDeCorte = moveLeft(puntoDeCorte);
           ++cantidadPerlas;
           // Si empiezo con transparente necesito cambiar el color cuando llegue a uno no transparente
           if (color == 'T' && collar[puntoDeCorte] != 'T') {
                color = collar[puntoDeCorte];
            }
        }
       
        return cantidadPerlas;
    }
    
    public int buscarPerlasDerecha(int puntoDeCorteOriginal) {
       int cantidadPerlas = 1;
       char color = collar[puntoDeCorteOriginal];
       int puntoDeCorte = moveRight(puntoDeCorteOriginal);
        while (same(puntoDeCorte, color) && puntoDeCorte != puntoDeCorteOriginal) {
           puntoDeCorte = moveRight(puntoDeCorte);
           ++cantidadPerlas;
           // Si empiezo con transparente necesito cambiar el color cuando llegue a uno no transparente
           if (color == 'T' && collar[puntoDeCorte] != 'T') {
                color = collar[puntoDeCorte];
            }
        }
       
       return cantidadPerlas;
    }
    
    
    /*
     * Returns the cut point in collar that gives the longest pearl's sequence of the same color
     * 
     * @return    int []    a two member vector with the cut's position and the total pearls in sequence
     */
   public int[] puntoDeCorte() {
       int resultado[] = new int[2];
       int maxPerlas = 0;
       int puntoDeCorteMax = 0;
       int perlasIzq = 0;
       int perlasDerecha = 0;

       // Necesitamos probar todos los posibles cortes
       for(int i = 0; i < collar.length; ++i) {
            perlasIzq = buscarPerlasIzquierda(i);
            
            if (perlasIzq != collar.length) {
                perlasDerecha = buscarPerlasDerecha(i);
            } else {
                // Todas las perlas son iguales
                perlasDerecha = 0;
            }
            
            int totalPerlas =  perlasIzq + perlasDerecha;
            if (totalPerlas > collar.length) {
                totalPerlas = collar.length;
            }
            
            // Comparar el punto de corte actual con el mejor hasta el momento
            if (totalPerlas > maxPerlas) {
                maxPerlas = totalPerlas;
                puntoDeCorteMax = i;
            }
        } 
       
       resultado[0] = puntoDeCorteMax;
       resultado[1] = maxPerlas;
       return resultado;
   }
}

