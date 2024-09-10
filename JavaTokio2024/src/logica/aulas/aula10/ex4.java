package logica.aulas.aula10;

import java.util.Scanner;

public class ex4 {
	
	static String calculadora(double A, double B, String op) {
		
		switch(op) {
			case "+":
				return A + B +"";
				
				
			case "-":
				return A - B +"";
				
				
			case "*":
				return A * B +"";
				
				
			case "/":
				if (B != 0) {
					return A / B +"";
				} else {
					return "impossível divisão por zero";
				}
				
		}
		return "operador inválido";
				
				
				
	}
	
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua operação [ + | - | * | / ]");
		
		String op = scan.nextLine();
		
		System.out.println("Digite os dois numeros");
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(calculadora(A, B, op));
	}
}
