package logica.aulas.aula07;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.printf("%d, ", i);
			}
		}
		
	}

}
