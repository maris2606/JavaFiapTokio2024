package logica.aulas.aula06;


public class ex7 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		System.out.println(((a <= b) && (b < d)) ? "verdadeiro" : "falso");
		
		System.out.println(((a == b) || (c != b)) ? "verdadeiro" : "falso");
		
		System.out.println(((d > a) && (c >= b)) ? "verdadeiro" : "falso");
		
		System.out.println(((a <= b) || (c <= d)) ? "verdadeiro" : "falso");
		
		System.out.println((((b > c) || (c < a)) && (d <= b)) ? "verdadeiro" : "falso");
	}

}
