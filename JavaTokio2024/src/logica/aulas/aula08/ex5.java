package logica.aulas.aula08;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 5;
		int max = 50;
		int soma = 0; 
		
		for (int i=0; i<10; i++) {
			soma += min + Math.round(Math.random()) * (max - min);
			
		}
		System.out.println(soma);
		
	}

}
