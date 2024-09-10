package logica.aulas.aula09;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 1;
		String entrada = "";
		String[] nomes = new String[5];
		
		
		for (int i = 0; i < 10; i++) {
			nomes[i] = scan.nextLine();
		}
		
		System.out.print(nomes);
		
		String[] nomesInverso = new String[5];
		
		for (int i = (nomes.length - 1); i >= 0; i--) {
			for (int j = 0; j<5; j++) {
				nomesInverso[j] = nomes[i];
			}
		}
		for (String nome: nomes) {
			System.out.print(nome);
		}
	}

}
