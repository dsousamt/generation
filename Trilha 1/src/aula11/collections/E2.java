package aula11.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> myArrList = new ArrayList<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroUser = sc.nextInt();
		
		if (myArrList.contains(numeroUser)) {
			System.out.println("A posição do " + numeroUser + " é: " + myArrList.indexOf(numeroUser));
		} else {
			System.out.println("O número " + numeroUser + " não foi encontrado!");
		}

		sc.close();
	}
}
