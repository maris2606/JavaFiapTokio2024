package logica.aulas.aula06;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o lado A: ");
	        double a = scanner.nextDouble();
	        System.out.print("Digite o lado B: ");
	        double b = scanner.nextDouble();
	        System.out.print("Digite o lado C: ");
	        double c = scanner.nextDouble();
	        
	        double aux;
	        while (!(a>b && b>c && a>c)) {
	        	if (a<b) {
	        		aux = b;
	        		b = a;
	        		a =aux;
	        	} 
	        	if (b<c) {
	        		aux = c;
	        		c = b;
	        		b = aux;
	        	}
	        	if (a<c) {
	        		aux = c;
	        		c = a;
	        		a = aux;
	        	}
	        }
	        
	        double A = a;
	        double B = b;
	        double C = c;
	        
	        System.out.println(a+" "+b+" "+c);
	        
	        
	        if (A >= B + C) {
	            System.out.println("NAO FORMA TRIANGULO");
	        } else {
	        	
	            if (A * A == B * B + C * C) {
	                System.out.println("TRIANGULO RETANGULO");
	            } else if (A * A > B * B + C * C) {
	                System.out.println("TRIANGULO OBTUSANGULO");
	            } else {
	                System.out.println("TRIANGULO ACUTANGULO");
	            }
	            
	            if (A == B && B == C) {
	                System.out.println("TRIANGULO EQUILATERO");
	            } else if (A == B || A == C || B == C) {
	                System.out.println("TRIANGULO ISOSCELES");
	            }
	        }
	        
	        scanner.close();
	}

}
