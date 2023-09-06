package aula11;

import java.util.Locale;
import java.util.Scanner;

public class A11E1v2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] myVect = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int nUsuario = sc.nextInt();
		boolean naoFoiEncontrado = true;
		
		for (int i = 0; i < myVect.length; i++) {
			if (myVect[i] == nUsuario) {
				System.out.println("número " + nUsuario + " está localizado na posição " + i);
				naoFoiEncontrado = false;
			}
		}
		
		if (naoFoiEncontrado) {
			System.out.println("O número " + nUsuario + " não foi encontrado!");
		}

		sc.close();
	}
}
