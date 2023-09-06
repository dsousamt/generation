package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> myArrIntegers = new ArrayList<Integer>();
		
		myArrIntegers.add(1);
		myArrIntegers.add(3);
		myArrIntegers.add(5);
		myArrIntegers.add(6);
		myArrIntegers.add(4);
		myArrIntegers.add(2);
		myArrIntegers.add(7);
		
		System.out.println(myArrIntegers.indexOf(1));

		sc.close();
	}
}
