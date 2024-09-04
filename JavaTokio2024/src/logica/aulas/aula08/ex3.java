package logica.aulas.aula08;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String s = scan.nextLine();	
		int ctmaius = 0;
		int ctminus = 0;
		int ctnum = 0;
		int ctbranco = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
				ctmaius += 1;
			} 
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
				ctminus += 1;
			} 
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')){
				ctnum += 1;
			}
			if (s.charAt(i) == ' '){
				ctbranco += 1;
			}
		}
		
		System.out.println("maiusculas: "+ ctmaius);
		System.out.println("minusculas: "+ ctminus);
		System.out.println("numericas: "+ ctnum);
		System.out.println("branco: "+ ctbranco);
		
	}

}
