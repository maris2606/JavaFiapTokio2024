package logica.aulas.aula06;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int codigoOrigem = scan.nextInt();
		int carga = scan.nextInt();
		int codigoCarga = scan.nextInt();
		
		double pesoCarga = carga * 1000;
		double precoCarga = 0;
		double imposto = 0;
		
		double valorCaminhao = 0;
		
		if (codigoCarga>=10 && codigoCarga<=20) {
			precoCarga = 100 * pesoCarga;
		} else if (codigoCarga>=21 && codigoCarga<=30) {
			precoCarga = 250 * pesoCarga;
		} else {
			precoCarga = 340 * pesoCarga;
		}
		
		switch (codigoOrigem) {
			case 1:
				imposto = 0.35 * precoCarga;
				valorCaminhao = precoCarga - imposto;				
				break;
				
			case 2:
				imposto = 0.25 * precoCarga;
				valorCaminhao = precoCarga - imposto;
				break;
				
			case 3:
				imposto = 0.15 * precoCarga;
				valorCaminhao = precoCarga - imposto;
				break;
				
			case 4:
				imposto = 0.05 * precoCarga;
				valorCaminhao = precoCarga - imposto;
				break;
				
			default:
				imposto = 0;
				valorCaminhao = precoCarga;
				break;
		}
		
		System.out.println("peso caminhao em kg: "+ pesoCarga);
		System.out.println("preco da carga: " + precoCarga);
		System.out.println("valor imposto: "+ imposto);
		System.out.println("valor transportado pelo caminhao: "+ valorCaminhao);
		
		
	}

}
