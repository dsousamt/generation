package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		boolean executa = true;
		float divisor = 0, soma = 0, media = 0;
		
		do {			
			System.out.println("Digite um número: ");
			float nDigitado = scanner.nextFloat();
			
			if (nDigitado != 0 && nDigitado % 3 == 0) {
				divisor++;
				soma += nDigitado;
			} else if(nDigitado == 0) {
				executa = false;
			}
			
		} while (executa);
		
		media = soma / divisor;
		
		System.out.println("Média dos múltiplos de 3: " + media);
		
		scanner.close();
	}
}
