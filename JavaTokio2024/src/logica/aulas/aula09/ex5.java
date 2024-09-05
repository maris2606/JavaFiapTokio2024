package logica.aulas.aula09;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int[] dias = new int[12];
		
		for(int i=1; i<=12; i++) {
			if (i==2) {
				System.out.println("O Mês de "+meses[i-1]+" tem 28 dias ao todo.");
			} else if ((i%2 != 0 && i<6) || (i%2 == 0 && i>6) || i==7) {
				System.out.println("O Mês de "+meses[i-1]+" tem 31 dias ao todo.");
			} else {
				System.out.println("O Mês de "+meses[i-1]+" tem 30 dias ao todo.");
			}
		}
	}

}
