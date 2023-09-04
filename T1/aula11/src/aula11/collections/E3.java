package aula11.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			mySet.add(sc.nextInt());			
		}
		
		for (Iterator i = mySet.iterator(); i.hasNext();) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);			
		}
		
		sc.close();
	}
}
