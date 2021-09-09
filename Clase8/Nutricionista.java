
/**
 * La clase nutricionista puede calcular datos para un paciente.
 *
 * @author Valeria Zamora
 * @version 9/9/2021
 */
public class Nutricionista
{
    /**
     * Calcula las calorias a consumir por una persona en un día usando la formula
     * Calorias = [655 + (9,6 × peso en kg) ] + [ (1,8 × altura en cm) – (4,7 × edad)] × Factor actividad.
     * 
     * @param  pesoEnKg  Peso de la persona en kilogramos
     * @param  alturaEnCm  Altura de la persona en cm
     * @param  edad  Edad de la persona (años)
     * @param  factorDeActividad    Factor de actividad de la persona (1.2 para personas sedentarias y 1.55 para personas con actividad moderada)

     * @return  Cantidad de calorías de debe consumir la persona en un día
     */
    public double calcularCaloriasAConsumir(double pesoEnKg, double alturaEnCm, int edad, double factorDeActividad)
    {
        return 655 + (9.6 * pesoEnKg) + ((1.8 * alturaEnCm) - (4.7 * edad)) * factorDeActividad;
    }
    
    /**
     * Calcula el Índice de Masa Corporal (IMC) de una persona
     * 
     * @param   pesoEnKg    Peso en kilogramos de la persona
     * @param   alturaEnCm  Altura en cm de la persona
     * 
     * @return  El índice de masa corporal de la persona
     */
    public double calcularImc(double pesoEnKg, double alturaEnCm) {
        double alturaEnMetros = alturaEnCm / 100;
        return pesoEnKg / (alturaEnMetros * alturaEnMetros);
    }
}
