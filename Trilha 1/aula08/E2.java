package aula08;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Digite a nota do 1º Bimestre: ");
		nota1 = sc.nextFloat();
		System.out.println("Digite a nota do 2º Bimestre: ");
		nota2 = sc.nextFloat();
		System.out.println("Digite a nota do 3º Bimestre: ");
		nota3 = sc.nextFloat();
		System.out.println("Digite a nota do 4º Bimestre: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println(media);
		
		sc.close();
	}
}
