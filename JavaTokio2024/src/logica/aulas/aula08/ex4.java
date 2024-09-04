package logica.aulas.aula08;

public class ex4 {

	public static void main(String[] args) {
		double x = Math.sqrt(81);
		
		double y = ((5 * x) + (2 * Math.pow(x,2)) + (Math.cbrt(8)) - (Math.PI *x)) / (Math.pow(3, 4) + x);
		
		System.out.printf("%.3f",y);
	}

}
