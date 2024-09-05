package logica.aulas.aula09;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a quantidade de alunos: ");
		int n = scan.nextInt();	
	
		double[] notas = new double[n];
		double soma = 0;
		double media = 0;
		
		int iguais=0;
		int acima=0;
		int abaixo=0;
		
		System.out.println("digite as notas do aluno: ");
		for (int i=0; i<n; i++) {
			notas[i] = scan.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			soma += notas[i];
		}
		
		media = soma/n;
	
		for (int i=0; i<n; i++) {
			if (notas[i] == media) {
				iguais +=1;
				
			} else if (notas[i] > media) {
				acima+=1;
			} else {
				abaixo+=1;
			}
		}
		
		System.out.printf("[");
		for (int i=0; i<n; i++) {
			System.out.printf("%.2f, ", notas[i]);
		}
		System.out.printf("]");
		
		System.out.println("media da turma: "+media);
		
		System.out.println("notas acima da media: "+media);
		
		System.out.println("notas abaixo media: "+abaixo);
		
		System.out.println("notas na media: "+iguais);
	}

}
