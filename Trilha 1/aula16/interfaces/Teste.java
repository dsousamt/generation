package aula16.interfaces;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		Triatleta t1 = new Triatleta("Maria");
		
		t1.aquecer();
		t1.correr();;
		t1.pedalar();;
		t1.nadar();
		t1.cansou();

		sc.close();
	}	

}
