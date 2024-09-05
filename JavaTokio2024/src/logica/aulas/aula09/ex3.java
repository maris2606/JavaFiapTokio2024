package logica.aulas.aula09;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
	
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			
			vetor[i] = (int) Math.round(0 +Math.random() * (100 - 0));
		}
	
		System.out.printf("[");
		for (int i=0; i<n; i++) {
			System.out.printf("%d, ",vetor[i]);
		}
		System.out.printf("]");
	}

}
