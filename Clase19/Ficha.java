public class Ficha
{
    private char color;
    public static final char FICHA_ROJA = 'R';
    public static final char FICHA_AZUL = 'A';
    
    public Ficha(char color)
    {
        this.color = color;
    }
    
    public char getColor() {
        return color;
    }
    
    public boolean equals(Ficha otraFicha) {
        return this.color == otraFicha.color;
    }
    
    public String toString() {
        return color + "";
    }
}
