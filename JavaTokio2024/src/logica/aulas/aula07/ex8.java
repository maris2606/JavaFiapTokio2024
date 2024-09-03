package logica.aulas.aula07;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n =scan.nextInt();
		int soma = 0;
		
		if (n>0) {
			for (int i=1; i<=n; i++) {
				soma += i;
			}
			System.out.println("a soma de 1 ate " + n+ " é: " +soma);
		} else {
			System.out.println("valor inválido");
		}
		
		
	}

}
