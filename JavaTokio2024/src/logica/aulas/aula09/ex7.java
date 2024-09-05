package logica.aulas.aula09;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] aux;
		int cont = 1;
		String entrada;
		String[] nomes;
		
		do {
			entrada = scan.nextLine();
			aux = new String[cont];
			
			aux[cont-1] = entrada;
			System.out.println(aux[0]);
			nomes = aux;
			
			
			cont ++;
		} while (entrada!="fim");
		
		
		String[] nomesInverso = new String[9];
		
		for (int i = nomes.length - 1; i >= 0; i--) {
			nomesInverso[i] = nomes[i];
		}
		for (String nome: nomes) {
			System.out.print(nome);
		}
	}

}
