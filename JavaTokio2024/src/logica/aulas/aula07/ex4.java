package logica.aulas.aula07;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double soma=0;
		
		for (int i=0; i<10; i++) {
			soma += scan.nextDouble();
		}
		
		System.out.println(soma);
	}

}
