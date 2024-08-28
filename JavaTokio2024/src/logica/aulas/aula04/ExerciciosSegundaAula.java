package logica.aulas.aula04;

import java.util.Scanner;

public interface ExerciciosSegundaAula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// exercicio 1
		System.out.println("----- ex. 1 ----");
		
		String nomeCompleto = "Marisa Mayumi Morita Ouchi";		
		String endereco = "R. Valentim";
		String CEP = "02325-020";
		String telefone = "(11)99571-1124";
		
		System.out.printf(
				"nome completo: %s.\n"
				+ "endereco: %s.\n"
				+ "CEP: %s.\n"
				+ "telefone: %s.\n",
				nomeCompleto, endereco, CEP, telefone
		);
		
		// exercicio 2
		System.out.println("----- ex. 2 ----");
		int numInt = 2;
		float numFloat = 5;
		double numDouble = 10.5;
		
		System.out.println(numInt);
		System.out.println(numFloat);
		System.out.println(numDouble);
		System.out.println(Integer.toString(numInt) + " " + Float.toString(numFloat) + " " + Double.toString(numDouble) + "\n");
		
		// exercicio 3
		System.out.println("----- ex. 3 ----");
		System.out.println("Digite sua opcao:");
		char opcao = scan.next().charAt(0);
		
		System.out.printf("Olá, Alexandre! Você escolheu a seguinte opção de gênero: %c\n", opcao);
		
		
		// exercicio 4
		System.out.println("----- ex. 4 ----");
		System.out.println("Digite as duas notas do aluno:");
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		System.out.printf("A media do aluno é : %.2f.\n", (A+B)/2);
				
		// exercicio 5
		System.out.println("----- ex. 5 ----");
		System.out.println("Digite as duas notas do aluno:");
		A = scan.nextDouble();
		B = scan.nextDouble();
		System.out.printf("A media do aluno é : %.2f.\n", A*0.4 + B*0.6);
		
		// exercicio 6
		System.out.println("----- ex. 6 ----");
		
		System.out.println("Digite o nome da peça 1:");
		scan.nextLine();
		String peca1 = scan.nextLine();	
		System.out.println("Quantas peças você quer?");
		int numPeca1 = scan.nextInt();
		System.out.println("Qual o valor unitário das pecas?");
		double valorPeca1 = scan.nextDouble();
		
		System.out.println("Digite o nome da peça 2:");
		scan.nextLine();
		String peca2 = scan.nextLine();	
		System.out.println("Quantas peças você quer?");
		int numPeca2 = scan.nextInt();
		System.out.println("Qual o valor unitário das pecas?");
		double valorPeca2 = scan.nextDouble();
		
		System.out.printf("O valor a ser pago é:"
				+ "\n%s: %.2f"
				+ "\n%s: %.2f"
				+ "\nTOTAL: %.2f\n",
				peca1, numPeca1 * valorPeca1,
				peca2, numPeca2 * valorPeca2,
				numPeca2 * valorPeca2 + numPeca1 * valorPeca1
		);
		
		// System.out.println();
		// exercicio 7
		System.out.println("----- ex. 7 ----");
		System.out.println("Digite o valor do produto:");
		double valorProd = scan.nextDouble();
		System.out.println("Digite o valor pago:");
		double valorPago = scan.nextDouble();
		
		System.out.printf("O troco a ser devolvido é: R$%.2f\n", valorPago - valorProd);
		
		// exercicio 8
		System.out.println("----- ex. 8 ----");
		System.out.println("Digite o valor a ser convertido:");
		double valor = scan.nextDouble();	
		
		double dolar = valor * 5.50;
		double peso = valor * 0.0058;
		double euro = valor * 6.15;
		double libra = valor * 7.30;
		double iene = valor * 0.038;
		
		System.out.printf(
				"valor em real: %.2f\n"
				+ "valor em dolar: %.2f\n"
				+ "valor em peso argentino: %.2f\n"
				+ "valor em euro: %.2f\n"
				+ "valor em libra esterlina: %.2f\n"
				+ "valor em iene: %.2f\n",
				valor, dolar, peso, euro, libra, iene
		);
		
		// exercicio 9
		System.out.println("----- ex. 9 ----");		
		System.out.println("digite um numero:");
		int num = scan.nextInt();
		int centena =  (num/100)*100;
		int dezena = ((num-centena)/10)*10;
		int unidade = (num-centena)-dezena;
		
		System.out.printf(
				"centena = %d \ndezena = %d \nunidade = %d\n", 
				centena, dezena, unidade
		);
		
		
		// exercicio 10
		System.out.println("----- ex. 10 ----");	
		System.out.println("digite sua idade em");
		System.out.println("anos:");
		int anos = scan.nextInt();		
		System.out.println("meses:");
		int meses = scan.nextInt();	
		System.out.println("dias:");
		int dias = scan.nextInt();	
		
		System.out.println("Você já viveu: " + (anos*365+ meses*30 + dias));
		
		// exercicio extra
		System.out.println("----- ex. extra ----");		
		System.out.println("digite sua idade em dias ");
		int idade = scan.nextInt();
		
		anos = idade/365;	
		meses = (idade-(anos*365))/30;	
		dias = idade-(anos*365)-(meses*30);	
		
		System.out.printf("Parabéns, você já viveu:"
				+ "\n%d anos"
				+ "\n%d meses "
				+ "\ne %d dias ",
				anos, meses, dias
		);
		
		
		scan.close();
		
	}

}
