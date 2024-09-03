package logica.aulas.aula06;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double distancia = scan.nextDouble();
		double gastoCombustivel = scan.nextDouble();
		
		double consumoMedio = distancia/gastoCombustivel;
		
		System.out.printf("o consumo médio de seu carro é: %.2fkm/L\n", consumoMedio);
	
		if (consumoMedio < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal");
		}
	}

}
