package logica.aulas.aula06;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua operação [ + | - | * | / ]");
		
		String op = scan.nextLine();
		
		System.out.println("Digite os dois numeros");
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		switch(op) {
			case "+":
				System.out.println(A + B);
				break;
				
			case "-":
				System.out.println(A - B);
				break;
				
			case "*":
				System.out.println(A * B);
				break;
				
			case "/":
				if (B != 0) {
					System.out.println(A / B);
				} else {
					System.out.println("impossível divisão por zero");
				}
				break;
				
			default:
				System.out.println("operador inválido");
				break;
		
		}
	}

}
