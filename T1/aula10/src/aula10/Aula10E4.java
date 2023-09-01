package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		int countBackEnd = 0;
		int countFrontEnd = 0;
		int countMobile = 0;
		int countFullStack = 0;
		
		while (true) {			
			System.out.println("Digite a idade: ");
			int idade = scanner.nextInt();
			
			System.out.println("\nQual é seu sexo? ");
			System.out.println("1 – Masculino");
			System.out.println("2 – Feminino ");
			System.out.println("3 – Outros");			
			int sexo = scanner.nextInt();
			
			System.out.println("\nQual é sua categoria? ");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");			
			int categoria = scanner.nextInt();
			
			
			if (categoria == 1) {
				countBackEnd++;
			} else if (categoria == 2 && sexo == 2) {				
				countFrontEnd++;
			} else if (categoria == 3 && sexo == 1) {
				if (idade > 40) {
					countMobile++;					
				}
			} else if (categoria == 4 && sexo == 2) {
				if (idade < 30) {
					countFullStack++;					
				}
			}
			
			System.out.println("Deseja continuar a leitura(S/N)");
			String resposta = scanner.next();
			if(resposta.equalsIgnoreCase("n")){
				break;
			}
		}
		
		System.out.println("Pessoas dev Backend: " + countBackEnd);
		System.out.println("Mulheres dev Frontend: " + countFrontEnd);
		System.out.println("Homens dev Mobile maiores de 40 anos: " + countMobile);
		System.out.println("Mulheres dev FullStack menores: " + countFullStack);
		
		scanner.close();
	}
}

/* switch (categoria) {
				case 1:
					countBackEnd++;
					break;
				case 2:countBackEnd++;
					if (sexo == 1) {
						countFrontEnd++;
						break;
					}
				case 3:
					if (sexo == 2 && idade > 40) {
						countMobile++;
						break;
					}
				case 4:
					if (sexo == 1 && idade < 30) {
						countFullStack++;
						break;
					}
			} */