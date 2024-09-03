package logica.aulas.aula07;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num;
		double maior=0;
		
		for (int i=0; i<12; i++) {
			num = scan.nextDouble();
			
			if (num>maior) {
				maior = num;
			}
			
		}
		
		System.out.println(maior);
	}

}
