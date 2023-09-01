package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int soma = 0;
		int saida = 1;
		
		do {
			System.out.println("Digite um número:");
			int nDigitado = scanner.nextInt();
			
			if (nDigitado > 0) {
				soma += nDigitado;
			}
			
			// (nDigitado > 0) ? soma += nDigitado: soma;
			
			saida = nDigitado;
			
		} while (saida != 0);
		
		System.out.println("A soma dos números positivos é:" + soma);
		
		scanner.close();
	}

}
