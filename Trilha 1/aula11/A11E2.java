package aula11;

import java.util.Locale;
import java.util.Scanner;

public class A11E2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nÍndices ímpares");
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nNúmeros Pares");
		for (int i : numeros) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		int soma = 0;
		System.out.println("\nSoma");
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
		
		System.out.println("\nMédia");
		float media = soma / numeros.length;
		System.out.printf("%.2f", media);

		sc.close();
	}
}
