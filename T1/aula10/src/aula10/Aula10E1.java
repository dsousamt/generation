package aula10;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Aula10E1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite num1");
		num1 = scanner.nextInt();		
		System.out.println("Digite num2");
		num2 = scanner.nextInt();
		
		if ( num1 < num2) {
			
			for (int cont = num1; cont <= num2; cont++ ) {
				if (cont % 3 == 0 && cont % 5 == 0) {
					System.out.println(cont + " é múltiplo de 3 e 5.");
				}
			}
			
		} else {
			System.out.println("Número inválido");
		}
		
		
		scanner.close();
	}

}
