package logica.aulas.aula07;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i=num1; i<=num2; i++) {
			
			if (i%2 ==0) {
				System.out.println(i);
			}
			
		}
	}

}
