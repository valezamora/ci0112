public class EjemploVectores
{
    public int[] sumar1(int[] vectorOriginal) {
        // copio el vector para no modificar el original
        int[] copiaVector = new int[vectorOriginal.length];
        for(int i = 0; i < copiaVector.length; ++i) {
            copiaVector[i] = vectorOriginal[i];
        }
        // Sumo 1 a todos los enteros del vector copiado
        for(int i = 0; i < copiaVector.length; ++i) {
            copiaVector[i] += 1;
        }
        return copiaVector;
    }
}
