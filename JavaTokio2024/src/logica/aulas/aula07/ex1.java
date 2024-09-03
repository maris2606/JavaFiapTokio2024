package logica.aulas.aula07;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int resposta=1;
		
		while (resposta != 0) {
			for(int i=0; i<10; i++) {
				System.out.println("Olá mundo!");
			}
			
			System.out.println("deseja exibir novamente? 1- sim, 0- não");
			resposta = scan.nextInt();
		}
		System.out.println("Fim");
	}

}
