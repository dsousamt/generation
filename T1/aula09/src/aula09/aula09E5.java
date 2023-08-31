package aula09;

import java.util.Locale;
import java.util.Scanner;

public class aula09E5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int valorTotal = 0;
		
		System.out.println("Digite o código do produto desejado");
		System.out.println("1 - Cachorro Quente - R$ 10.00");
		System.out.println("2 - X-Salada - R$ 15.00");
		System.out.println("3 - X-Bacon - R$ 18.00");
		System.out.println("4 - Bauru - R$ 12.00");
		System.out.println("5 - Refrigerante - R$ 8.00");
		System.out.println("6 - Suco de laranja - R$ 13.00");
		int opcao = scanner.nextInt();		
		
		if (opcao < 1 || opcao > 6) {
			System.out.println("Opção inválida");
		} else {
			System.out.println("Quantas unidades você deseja?");
			int qtd = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				valorTotal = qtd * 10;
				break;
			case 2:
				valorTotal = qtd * 15;
				break;
			case 3:
				valorTotal = qtd * 18;
				break;
			case 4:
				valorTotal = qtd * 12;
				break;
			case 5:
				valorTotal = qtd * 8;
				break;
			case 6:
				valorTotal = qtd * 13;
				break;
			}
			System.out.println("O valor total é de R$ " + valorTotal);
		}
		
		
		
		scanner.close();
	}
}
