package logica.aulas.aula06;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento");
		
		int anoNascimento = scan.nextInt();

		int idade = 2024 - anoNascimento;
		
		if (idade < 16) {
			System.out.println("voto proibido");
		} else if (((idade>=16) && (idade < 18)) || (idade>70)) {
			System.out.println("voto opcional");
		} else {
			System.out.println("voto obrigatorio");
		}
	}

}
