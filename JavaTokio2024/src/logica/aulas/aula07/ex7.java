package logica.aulas.aula07;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double media=scan.nextDouble();
		double nota = 0;
		int alunosAcima = 0;
		
		for (int i=0; i<=20; i++) {
			nota = scan.nextDouble();
			if(nota>media) {
				alunosAcima ++;
			}
		}
		
		System.out.println("alunos acima da media: "+alunosAcima);
		System.out.println("alunos abaixo da media: "+(20-alunosAcima));
		
	}

}
