package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();		
		
		if (hora >= 18) {
			System.out.println("Bom dia, "+ nome+"!");
		} else if (hora >= 12) {
			System.out.println("Boa tarde, "+ nome+"!");
		} else if (hora >= 6) {
			System.out.println("Boa noite, "+ nome+"!");
		}
	}

}
