package logica.aulas.aula06;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario = scan.nextDouble();
		double novoSalario = 0;
		double percentual = 0;
		double aumento = 0;
		
		if (salario < 280) {
			percentual = 1.20;
			novoSalario = salario * percentual;
			aumento = salario * 0.20;
			
		} else if (salario >= 280 && salario < 700) {
			percentual = 1.15;
			novoSalario = salario * percentual;
			aumento = salario * 0.15;
			
		} else if (salario >= 700 && salario < 1500) {
			percentual = 1.10;
			novoSalario = salario * percentual;
			aumento = salario * 0.10;
			
		} else {
			percentual = 1.05;
			novoSalario = salario * percentual;
			aumento = salario * 0.05;
			
		}
		
		System.out.printf("O salário antes do reajuste: %.2f\n", salario);
		System.out.printf("O percentual de aumento aplicado: %.2f\n", percentual);
		System.out.printf("O valor do aumento: %.2f\n", aumento);
		System.out.printf("O novo salário, após o aumento: %.2f\n", novoSalario);
	}

}
