package misClases;

/**
 * @author Jorge Sagot
 */
public class ConvertidorUnid {
    // Atributos
    private int kg ;
    private int g;
    private double conversionGKg;
    private double conversionKgG;

    // Contructores
    public ConvertidorUnid(int newGramos, int newKiloGramos) {
        kg = newKiloGramos;
        g = newGramos;
    }

    // set y get   (No hacía falta, porque era muy simple y se podía ahorrar código)

    public void setG(int newGramos) {
        g = newGramos;
    }
    public void setKg(int newKiloGramos) {
        kg = newKiloGramos;
    }
    public int getG() {
        return g;
    }
    public int getKg() {
        return kg;
    }

    // Métodos
    public String toString() {
        return "Gramos: " + g + "\nKilogramos: " + kg
                + "\nConversión de g a kg: " + conversionGKg +
                "\nConversión de kg a g: " + conversionKgG;
    }

    // Convertir de g a kg
    public void convertirGKg() {
        conversionGKg = g/1000;
    }

    // Convertir de kg a g
    public void convertirKgG(){
        conversionKgG = kg*1000;
    }

}
