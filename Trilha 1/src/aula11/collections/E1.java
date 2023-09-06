package aula11.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> colorsArrList = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			colorsArrList.add(sc.nextLine());
		}
		
		System.out.println("\nCores adicionadas: ");
		for (String item : colorsArrList) {
			System.out.println(item);
		}		
		System.out.println("\nCores ordenadas: ");
		colorsArrList.sort(null);

		for (String item : colorsArrList) {
			System.out.println(item);
		}
		
		sc.close();
	}
}
