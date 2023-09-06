package aula12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> queue = new LinkedList<String>();
		
		while (true) {
			int addCliente = 1, listClients = 2, removeClient = 3, exit = 0;
			String divider = "\n-----------------------------";
			
			System.out.println(divider);
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.print("\nDigite uma opção: ");
			int menuOption = sc.nextInt();
			sc.skip("\\R");
			
			if (menuOption == addCliente) {
				
				System.out.print("\nDigite o nome: ");				
				queue.add(sc.nextLine());
				System.out.println("\nCliente Adicionado!");
				System.out.println(divider);
				
			}else if (menuOption == listClients) {
				
				for (String client : queue) {
					System.out.println(client);
				}
				System.out.println(divider);
				
			}else if (menuOption == removeClient) {
				
				if (queue.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					queue.poll();
					System.out.println(divider);
				}
				
			}else if (menuOption == exit){
				System.out.println("Programa Finalizado!");
				System.out.println(divider);
				break;
			}
		}

		sc.close();
	}
}
