public class Main
{
    public static void main(String args[]) {
        String nombreArchivo = "miniFacil.gif";
        Imagen imagen = new Imagen(nombreArchivo);
        
        int m[][] = imagen.getMatriz();
        
        for(int i = 0; i < m.length;++i) {
            for(int j = 0; j < m[i].length; ++j) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        
        Imagen imagenSalida = new Imagen(m);
        imagenSalida.dibujar();
    }
}
