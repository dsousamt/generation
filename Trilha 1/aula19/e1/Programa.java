package aula19.e1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> listaClientes = new ArrayList<>();		
		
		for (int i = 1; i <= 2; i++) {
			
				try {
					System.out.print("Qual o ID do cliente? ");
					int id = sc.nextInt();
					sc.skip("\\R");
					System.out.print("Pessoa física ou jurídica (f/j)? ");
					char type = sc.next().charAt(0);
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
					if (type == 'j'){
						System.out.print("Qual o CNPJ cliente? ");
						long cnpj = sc.nextLong();
						listaClientes.add(new PessoaJuridica(id, nome, idade, email, numero, cnpj));
					} else if (type == 'f') {
						System.out.print("Qual o CPF cliente? ");
						long cpf = sc.nextLong();
						listaClientes.add(new PessoaFisica(id, nome, idade, email, numero, cpf));
					}
				} catch (InputMismatchException e) {
					System.out.println();
					System.err.println(e);
					System.out.println("Valor digitado inválido");
				}
			
		}
		
		listaClientes.stream()
			.forEach(c -> {
				System.out.println();
				c.visualizarCliente();
		});
		
		sc.close();
	}
}
