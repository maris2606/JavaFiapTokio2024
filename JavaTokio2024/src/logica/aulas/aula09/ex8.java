package logica.aulas.aula09;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] vetor = new int[n];
		int aux;
		
		for (int i = 0; i < n; i++) {
			vetor[i] = i;
		}
		
		int voltas = n/2;
		
		for (int i = 1; i <= voltas; i ++) {
			aux = vetor[i-1];
			
			vetor[i-1] = vetor[vetor.length - i];
			
			vetor[vetor.length - i] = aux;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
