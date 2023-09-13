package aula16.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();		
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Funcionário é Gerente ou Vendedor (g/v)? ");
			char type = sc.next().charAt(0);
			sc.skip("\\R");
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

			if (type == 'g') {
				System.out.print("Gerencia equipe de quantas pessoas? ");
				int qtdSubordinados = sc.nextInt();
				listaFuncionarios.add(new Gerente(pis, nome, idade, email, numero, qtdSubordinados));
			} else {
				System.out.print("Quantas vendas realizou no mês passado? ");
				int vendasUltimoMes = sc.nextInt();
				listaFuncionarios.add(new Vendedor(pis, nome, idade, email, numero, vendasUltimoMes));
			}
		}
		
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			funcionario.visualizarFuncionario();
			System.out.println();
		}
		
		sc.close();
	}
}