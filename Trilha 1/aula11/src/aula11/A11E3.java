package aula11;

import java.util.Locale;
import java.util.Scanner;

public class A11E3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] myMatriz = new int[3][3];
		
		for (int i = 0; i < myMatriz.length; i++) {
			for (int j = 0; j < myMatriz[i].length; j++) {
				myMatriz[i][j] = sc.nextInt();				
			}
		}
		
		int somaPrincipal = 0;		
		for (int i = 0; i < myMatriz.length; i++) {
			System.out.println(myMatriz[i][i]);
			somaPrincipal += myMatriz[i][i];
		}		
		System.out.println("A soma da diagonal principal é: " + somaPrincipal);
		
		
		int somaSecundaria = 0;
		for (int i = 0; i < myMatriz.length; i++) {
			System.out.println(myMatriz[i][myMatriz.length - 1 - i]);
			somaSecundaria += myMatriz[i][myMatriz.length - 1 - i];
		}		
		System.out.println("A soma da diagonal secundária é: " + somaSecundaria);

		sc.close();
	}
}
