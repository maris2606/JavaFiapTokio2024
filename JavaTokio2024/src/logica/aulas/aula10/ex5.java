package logica.aulas.aula10;

public class ex5 {
	
	static void temperatura(double valor, char caractere) {
		double c = 0;
		double k = 0;
		double f = 0;
		
		switch(caractere) {
			case 'C':
				c = valor;
				f = valor * 1.8 + 32;
				k = valor + 273.15;
				break;
			case 'F':
				f = valor;
				c = (valor - 32) / 1.8;
				k = (valor - 32) * 1.8 + 273.15;
				break;
			case 'K':
				k = valor;
				c = valor - 273.15;
				f = (valor - 273.15) * 1.8 + 32;
				break;	
			default:
				System.out.println("caractere inválido");
				break;
		}
		
		System.out.printf("celsius: %.2f \n", c);
		System.out.printf("farenheit: %.2f \n", f);
		System.out.printf("kelvin: %.2f \n", k);
	}
	
	public static void main(String[] args) {
		temperatura(100, 'K');
	}
}
