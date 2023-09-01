package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E3 {
	 public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int count21 = 0, count50 = 0;
		
		while (true) {
			
			System.out.println("\nDigite uma idade:");
			int idade = scanner.nextInt();
			
			if (idade < 21 && idade > 0) {
				count21++;
			} else if (idade > 50) {
				count50++;
			} else {
				break;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + count21);
		System.out.println("Total de pessoas maiores de 50 anos: " + count50);
		
		scanner.close();
	}
}
