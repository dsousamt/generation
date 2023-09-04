package aula11;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class A10E11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] myVect = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int nUsuario = sc.nextInt();		
		Arrays.sort(myVect);
		
		int posicao = Arrays.binarySearch(myVect, nUsuario);		
		
		if (posicao >= 0) {
			System.out.println("O número " + nUsuario + " foi localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + nUsuario + " não foi encontrado!");
		}

		sc.close();
	}
}
