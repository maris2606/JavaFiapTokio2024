package logica.aulas.aula07;

import java.util.ArrayList;
import java.util.List;

public class ex10 {

	public static void main(String[] args) {
		ArrayList<Integer> divisores = new ArrayList<>();
		
		for (int i=2; i<=2000; i++) {
			for(int j=1; j<=2000; j++) {
				if (i % j == 0) {
					divisores.add(j);
				}
			}
			if(divisores.size()==2) {
				if(divisores.get(0)==1 && divisores.get(1)==i) {
					System.out.print(i+", ");
				}
			}
			divisores.clear();
		}
	}

}
