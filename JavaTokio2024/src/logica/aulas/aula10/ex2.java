package logica.aulas.aula10;

import java.util.Scanner;

public class ex2 {
	
	static double calcularArea(double l, double c) {
		
		return l * c;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double largura = scan.nextDouble();
		double comprimento = scan.nextDouble();
		
		System.out.println(calcularArea(largura, comprimento));
	}
}
