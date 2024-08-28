package logica.aulas.aula06;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();	
		int num2 = scan.nextInt();	
		
		
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " +num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " é menor que " +num2);
		} else {
			System.out.println(num1 + " é igual a " +num2);
		}
	}

}
