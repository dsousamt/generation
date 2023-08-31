package aula09;

import java.util.Locale;
import java.util.Scanner;

public class aula09E1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite 3 numeros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}		
		
		
		scanner.close();
	}

}
