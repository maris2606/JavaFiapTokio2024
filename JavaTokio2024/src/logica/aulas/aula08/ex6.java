package logica.aulas.aula08;

import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 0;
		int max = 100;
		double num = 0;
		
		int impares = 0;
		int pares = 0;
		int primos = 0;
		
		ArrayList<Integer> divisores = new ArrayList<>();
	
		
		for (int i=0; i<100; i++) {
			num = Math.round(min +Math.random() * (max - min));
			
			if (num % 2 == 0) {
				pares+=1;
			} else {
				impares+=1;
			}
			
			for(int j=1; j<=num; j++) {
				if (num % j == 0) {
					divisores.add(j);
				}
			}
			if(divisores.size()==2) {
				if(divisores.get(0)==1 && divisores.get(1)==num) {
					primos+=1;
				}
			}
			divisores.clear();
		
		}
		
		System.out.println("pares: "+ pares);
		System.out.println("impares: "+ impares);
		System.out.println("primos: "+ primos);
	}

}
