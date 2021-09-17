/**
 * Write a description of class EjemploSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calendario
{
    /**
     * EJEMPLO SWITCH
     * Obtener el nombre del mes a partir de un entero
     * si el numero es invalido devuelve "invalido"
     *
     * @param  mes  el numero del mes
     * @return    el mes en texto
     */
    public String obtenerNombreDeMes(int mes)
    {
        String nombreDelMes = "";
        switch (mes) {
            case 1:
                nombreDelMes = "Enero";
                break;
            case 2:
                nombreDelMes = "Febrero";
                break;
            case 3:
                nombreDelMes = "Marzo";
                break;
            case 4:
                nombreDelMes = "Abril";
                break;
            case 5:
                nombreDelMes = "Mayo";
                break; 
            case 6:
                nombreDelMes = "Junio";
                break; 
            case 7:
                nombreDelMes = "Julio";
                break; 
            case 8:
                nombreDelMes = "Agosto";
                break; 
            case 9:
                nombreDelMes = "Septiembre";
                break; 
            case 10:
                nombreDelMes = "Octubre";
                break; 
            case 11:
                nombreDelMes = "Noviembre";
                break; 
            case 12:
                nombreDelMes = "Diciembre";
                break; 
            default:
                nombreDelMes = "invalido";
        }
        return nombreDelMes;
    }
}
