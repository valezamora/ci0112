package herramientas;
/**
  * Clase convertidor de unidades
  * @author Antonio Badilla
  */
public class ConvertUni{
  //atributos
  private int kilos;
  private int gramos;
  private static int GRAMOS_RATIO_KILOS=1000;

 //constructor de clase
 public ConvertUni(){
  kilos = 0;
  gramos = 0;
  }
  //set y get
  public void setKilos(int kg){
    kilos=kg;
  }

  public void setGramos(int g){
    gramos=g;
  }

  public int getKilos(){
    return kilos;
  }

  public int getGramos(){
    return gramos;
  }

  public int ConvertGtoKg(){
    return gramos/GRAMOS_RATIO_KILOS;
  }
  public int ConvertKgtoG(){
    return kilos*GRAMOS_RATIO_KILOS;
  }

}
