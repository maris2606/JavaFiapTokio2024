package logica.aulas.aula04;

import java.util.Scanner;

public interface ExerciciosPrimeiraAula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.out.println();
		
		// exercicio 1
		int variavel;
		variavel = 1;
		
		System.out.println(variavel);
		
		// exercicio 2
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		System.out.println(nome);
		
		// exercicio 3
		System.out.println("Digite seu nome:");
		nome = scan.nextLine();
		System.out.printf("Olá, %s", nome);
		
		// exercicio 4
		System.out.println("Digite seu nome:");
		nome = scan.nextLine();
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.printf("Olá, %s. Você tem %d anos.", nome, idade);
		
		// exercicio 5
		System.out.println("Digite seu salario:");
		double salario = scan.nextDouble();
		System.out.printf("Salario: ", salario);
		
		// exercicio 6
		System.out.println("Digite seu nome:");
		System.out.println(scan.nextLine());
		
		
		scan.close();
		
	}

}
