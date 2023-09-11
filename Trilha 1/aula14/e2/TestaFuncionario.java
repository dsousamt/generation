package aula14.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();		
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Qual o PIS do Funcionário? ");
			int pis = sc.nextInt();
			sc.skip("\\R");
			System.out.print("Qual o nome do Funcionário? ");
			String nome = sc.nextLine();
			System.out.print("Qual a idade do Funcionário? ");
			int idade = sc.nextInt();
			sc.skip("\\R");
			System.out.print("Qual o email do Funcionário? ");
			String email = sc.nextLine();
			System.out.print("Qual o telefone do Funcionário? ");
			String numero = sc.nextLine();
			listaFuncionarios.add(new Funcionario(pis, nome, idade, email, numero));
		}
		
		for (Funcionario funcionario : listaFuncionarios) {
			funcionario.visualizarFuncionario();
		}
		
		sc.close();
	}
}
