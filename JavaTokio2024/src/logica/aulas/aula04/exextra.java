package logica.aulas.aula04;

import java.util.Scanner;

public class exextra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----- ex. 10 ----");	
		System.out.println("digite sua idade em dias");
		int idade = scan.nextInt();
		
		System.out.println("anos:");
		int anos = idade/365;	
		System.out.println("meses:");
		int meses = (idade-(anos*365))/30;
		System.out.println("dias:");
		int dias = idade-(anos*365)-(meses*30);	
		
		System.out.printf("Parabéns, você já viveu:"
				+ "\n%d anos"
				+ "\n%d meses"
				+ "\ne %d dias",
				anos, meses, dias
		);
	}

}
