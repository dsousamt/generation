package aula11.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> myArrList = new ArrayList<Integer>(10);
		myArrList.add(2);
		myArrList.add(5);
		myArrList.add(1);
		myArrList.add(3);
		myArrList.add(4);
		myArrList.add(9);
		myArrList.add(7);
		myArrList.add(8);
		myArrList.add(10);
		myArrList.add(6);
		
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
