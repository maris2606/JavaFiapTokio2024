package logica.aulas.aula10;

import java.util.Scanner;

public class ex3 {
	static String voto(int idade) {

		if (idade < 16) {
			return "voto proibido";
		} else if (((idade>=16) && (idade < 18)) || (idade>70)) {
			return "voto opcional";
		} else {
			return "voto obrigatorio";
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento");
		
		int anoNascimento = scan.nextInt();

		int idade = 2024 - anoNascimento;
		
		System.out.println(voto(idade));
	}
}
