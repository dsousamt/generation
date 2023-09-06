/*
Escreva um algoritmo em Java, que leia um número inteiro via
teclado e mostre na tela uma mensagem indicando se este número
é par ou ímpar e se o número é positivo ou negativo.
 * */

package aula09;

import java.util.Locale;
import java.util.Scanner;

public class aula09E2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {			
			if (numero < 0) {
				System.out.println(numero + " é par e negativo!");				
			} else {
				System.out.println(numero + " é par e positivo!");	
			}
		} else {
			if (numero < 0) {
				System.out.println(numero + " é ímpar e negativo!");				
			} else {
				System.out.println(numero + " é ímpar e positivo!");	
			}
		}
		
		scanner.close();
	}

}