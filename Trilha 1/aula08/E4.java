package aula08;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, result;
		
		System.out.println("Digite o número 1: ");
		n1 = sc.nextFloat();
		System.out.println("Digite o número 2: ");
		n2 = sc.nextFloat();
		System.out.println("Digite o número 3: ");
		n3 = sc.nextFloat();
		System.out.println("Digite o número 4: ");
		n4 = sc.nextFloat();
		
		result = n1 * n2 - n3 * n4;
		
		System.out.printf("O resultado da sua conta é: %.0f", result);
		
		sc.close();
	}
}
