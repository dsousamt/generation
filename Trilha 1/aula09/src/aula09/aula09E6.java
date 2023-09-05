package aula09;

import java.util.Locale;
import java.util.Scanner;

public class aula09E6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		String nomeColaborador = scanner.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		int cargo = scanner.nextInt();
		
		if (cargo < 1 || cargo > 6) {
			System.out.println("Opção inválida");
		} else {
		
			System.out.println("Digite o salário: ");
			float salarioColaborador = scanner.nextFloat();
			String cargoString = "";
			
			switch (cargo) {
			case 1:
				salarioColaborador += 0.1 * salarioColaborador;
				cargoString = "Gerente";
				break;
			case 2:
				salarioColaborador += 0.07 * salarioColaborador;
				cargoString = "Vendedor";
				break;
			case 3:
				salarioColaborador += 0.09 * salarioColaborador;
				cargoString = "Supervisor";
				break;
			case 4:
				salarioColaborador += 0.06 * salarioColaborador;
				cargoString = "Motorista";
				break;
			case 5:
				salarioColaborador += 0.05 * salarioColaborador;
				cargoString = "Estoquista";
				break;
			case 6:
				salarioColaborador += 0.08 * salarioColaborador;
				cargoString = "Técnico de TI";
				break;
			}
			
			System.out.println("\nNome do colaborador: " + nomeColaborador);
			System.out.println("\nCargo: " + cargoString);
			System.out.println("\nSalário: " + salarioColaborador);
		
		}
		scanner.close();
	}
}
