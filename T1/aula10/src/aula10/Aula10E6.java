package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		boolean executa = true;
		float count = 0;
		float soma = 0;
		float media = 0;
		
		do {			
			System.out.println("Digite um número: ");
			float nDigitado = scanner.nextFloat();
			
			if (nDigitado > 0 && nDigitado % 3 == 0) {
				count++;
				soma += nDigitado;
			}
			
			if(nDigitado == 0) {
				executa = false;
			}
			media = soma / count;
			
		} while (executa);
		
		System.out.println(media);
		System.out.println("Média dos múltiplos de 3: " + media);
		
		scanner.close();
	}
}
