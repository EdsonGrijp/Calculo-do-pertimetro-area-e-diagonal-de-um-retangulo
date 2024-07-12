package entites;

public class Area {
	
	public double lado;
	public double altura;
	
	public double arearetangulo() {
		return lado * altura;
	}
	
	public double perimetro(){
		return ((2 * lado)+(2 * altura));
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + lado * lado);
	}
}
