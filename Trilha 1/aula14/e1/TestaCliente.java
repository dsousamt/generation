package aula14.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> listaClientes = new ArrayList<>();		
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Qual o ID do cliente? ");
			int id = sc.nextInt();
			sc.skip("\\R");
			System.out.print("Qual o nome do cliente? ");
			String nome = sc.nextLine();
			System.out.print("Qual a idade do cliente? ");
			int idade = sc.nextInt();
			sc.skip("\\R");
			System.out.print("Qual o email do cliente? ");
			String email = sc.nextLine();
			System.out.print("Qual o telefone do cliente? ");
			String numero = sc.nextLine();
			listaClientes.add(new Cliente(id, nome, idade, email, numero));
		}
		
		for (Cliente cliente : listaClientes) {
			cliente.visualizarCliente();
		}
		
		sc.close();
	}
}
