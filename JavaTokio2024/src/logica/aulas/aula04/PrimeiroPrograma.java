package logica.aulas.aula04;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Hello World!!");
//		
//		System.out.println("Olá Mundo!!");
		
		int anoDeNascimento;
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade =  scan.nextInt();		
		
		anoDeNascimento = 2024-idade;
		
		System.out.println("Seu ano de nascimento é:" + anoDeNascimento);
		
		double salario = 1530.24;
		
		System.out.printf("Parabéns você ganhou um aumento de 15%%, seu novo salário é: %.2f", salario * 1.15);
		
		
	}

}
