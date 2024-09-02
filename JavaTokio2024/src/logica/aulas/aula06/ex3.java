package logica.aulas.aula06;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double notafim = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (notafim >= 7) {
			System.out.println("aprovado");
		} else if (notafim < 7 && notafim >=5) {
			System.out.println("em recuperação");
		} else {
			System.out.println("reprovado");
		}
	}

}
