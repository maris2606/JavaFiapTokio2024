package logica.aulas.aula06;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	
	}

}
