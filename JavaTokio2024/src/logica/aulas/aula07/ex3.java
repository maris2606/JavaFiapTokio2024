package logica.aulas.aula07;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for (int i=0; i<=25; i++) {
			System.out.println(n + "*" + i + "=" + n*i);
		}
	}

}
