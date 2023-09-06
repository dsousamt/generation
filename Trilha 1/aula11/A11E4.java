package aula11;

import java.util.Locale;
import java.util.Scanner;

public class A11E4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][] notas = new double[10][4];
		
		
		double[] medias = new double[10];
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < medias.length; i++) {
			double soma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / notas[i].length;
		}
		
		System.out.println("\nVetor com as médias de cada aluno: ");
		
		for (double nota : medias) {
			System.out.printf("%.1f ", nota);
		}
		sc.close();
	}
}

/*		double[][] notas = {{4.0, 5.0, 7.0, 3.0},
							{2.5, 6.5, 4.7, 8.0},
							{10.0, 8.5, 9.5, 8.0},
							{9.0, 6.5, 7.6, 8.2},
							{5.0, 5.0, 5.0, 6.3},
							{7.0, 8.0, 9.0, 8.5,},
							{5.5, 3.5, 2.5, 1.0},
							{8.0, 9.0, 10.0, 9.5},
							{5.6, 5.8, 6.5, 7.0},
							{7.5, 8.5, 9.5, 10.0},};*/