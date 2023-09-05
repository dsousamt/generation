package aula11.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroUser = sc.nextInt();
		
		if (mySet.contains(numeroUser)) {
			System.out.println("O número " + numeroUser + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroUser + " não foi encontrado!");
		}

		sc.close();
	}
}
