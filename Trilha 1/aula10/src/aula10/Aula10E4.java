package aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10E4 {
	public static void main(String[] args) {
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
			int masc = 1, fem = 2;			
			int sexo = scanner.nextInt();			
			
			System.out.println("\nQual é sua categoria? ");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");			
			int back = 1, front = 2, mobile = 3, full = 4;			
			int categoria = scanner.nextInt();
			
			//consulta
			if (categoria == back) {
				countBackEnd++;
			} else if (categoria == front && sexo == fem) {				
				countFrontEnd++;
			} else if ((categoria == mobile && sexo == masc) && idade > 40) {
				countMobile++;
			} else if ((categoria == full && sexo == fem) && idade < 30) {
				countFullStack++;
			}
			
			//saida
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