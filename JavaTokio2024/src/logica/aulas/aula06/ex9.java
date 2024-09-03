package logica.aulas.aula06;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("digite a quantidade de horas:");
		int horas = scan.nextInt();	
		
		System.out.println("digite seu tipo de cliente:");
		int tipo = scan.nextInt();	
		
		System.out.println("O valor da sua conta é:");
		
		if (tipo == 1) {
			System.out.println(horas * 0.6);
		} else if (tipo == 2) {
			System.out.println(horas * 0.48);
		} else {
			System.out.println(horas * 1.29);
		}
	}

}
