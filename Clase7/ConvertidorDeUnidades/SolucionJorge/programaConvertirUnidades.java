
import misClases.ConvertidorUnid;
import javax.swing.JOptionPane;

/**
 * @author Jorge Sagot
 */
public class programaConvertirUnidades {
    public static void main(String[] args) {
        // Variables
        // Convertir de g a kg
        // Convertir de kg a g

        String g = JOptionPane.showInputDialog("Digite el número de gramos que desea convertir:");
        String kg = JOptionPane.showInputDialog("Digite el número de kilogramos que desea convetir:");
        int gramos1 = Integer.parseInt(g);
        int kilogramos1 = Integer.parseInt(kg);

        ConvertidorUnid usuario1 = new ConvertidorUnid(gramos1, kilogramos1);
        usuario1.convertirGKg();
        usuario1.convertirKgG();
        System.out.println(usuario1);


    }
}
