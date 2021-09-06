/**
 * @author Jorman Herrera
 */
public class Operaciones{
	private double kilogramos;
	private double gramos;
	
	public Operaciones(){
	}
	
	public Operaciones(double nuevoKilo, double nuevoGramo) {
		kilogramos = nuevoKilo;
		gramos = nuevoGramo;
	}
	
	public double getKilogramos() {
		return kilogramos;
	}
	
	public void setKilogramos(double nuevoKilo) {
		kilogramos = nuevoKilo;
	}
	
	public double getGramos() {
		return gramos;
	}
	
	public void setGramos(double nuevoGramo) {
		gramos = nuevoGramo;
	}
	
	public double convertirKilosaGramos(double kilos){
		return kilos*1000;
	}
	public double convertirGramosaKilos(double gramos){
		return gramos/1000;
	}	
}