package logica.aulas.aula09;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
	
		int[] vetor = new int[n];
		
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			
			vetor[i] = scan.nextInt();
		}
	
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		System.out.println(soma);
	}

}
