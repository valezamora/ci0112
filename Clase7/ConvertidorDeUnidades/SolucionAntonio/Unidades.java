import javax.swing.JOptionPane;
import herramientas.ConvertUni;

/**
 * Main - leer datos del usuario y convertir entre kilos y gramos utilizando clase ConvertUni
 * @author Antonio Badilla
 */
class Unidades {
  public static void main(String[] args) {
    ConvertUni convertUni1 = new ConvertUni();

    String kilosStr = JOptionPane.showInputDialog("Digite los kilos que desea pasar a gramos: ");
    String gramosStr = JOptionPane.showInputDialog("Digite los gramos que desea pasar a kilos: ");

    int kilos = Integer.parseInt(kilosStr);
    int gramos = Integer.parseInt(gramosStr);
    convertUni1.setKilos(kilos);
    convertUni1.setGramos(gramos);
    int kilosEnGramos = convertUni1.ConvertKgtoG();
    int gramosEnKilos = convertUni1.ConvertGtoKg();

    JOptionPane.showMessageDialog(null,kilos+" kilos en gramos es "+kilosEnGramos,"conversion de Kilos a Gramos", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,gramos+" gramos en kilos es "+gramosEnKilos,"conversion de Gramos a Kilos", JOptionPane.INFORMATION_MESSAGE);
  }

}
