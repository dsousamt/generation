package aula11.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> mySet = new HashSet<Integer>(10);
		mySet.add(2);
		mySet.add(5);
		mySet.add(1);
		mySet.add(3);
		mySet.add(4);
		mySet.add(9);
		mySet.add(7);
		mySet.add(8);
		mySet.add(10);
		mySet.add(6);
		
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
