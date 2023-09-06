package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int countImpar = 0, countPar = 0;
		
		for (int count = 1; count <= 10; count++) {
			System.out.println("Digite o " + count + "º número: ");
			int nDigitado = scanner.nextInt();
			if (nDigitado % 2 == 0) {
				countPar++;
			} else {
				countImpar++;
			}			
		}
		
		System.out.println("Total de números pares: " + countPar);
		System.out.println("Total de números ímpares: " + countImpar);
		
		scanner.close();
	}
}
