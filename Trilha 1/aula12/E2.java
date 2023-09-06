package aula12;

import java.util.Scanner;
import java.util.Stack;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();
		
		while (true) {
			int addBook = 1, listBooks = 2, removeBook = 3, exit = 0;
			String divider = "\n-----------------------------";
			
			System.out.println(divider);
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.print("\nDigite uma opção: ");
			int menuOption = sc.nextInt();
			sc.skip("\\R");
			
			if (menuOption == addBook) {
				
				System.out.print("\nDigite o nome: ");
				stack.push(sc.nextLine());
				
				System.out.println(divider);				
				for (String book : stack) {
					System.out.println(book);
				}				
				System.out.println("\nLivro Adicionado!");
				System.out.println(divider);
				
			}else if (menuOption == listBooks) {
				
				for (String book : stack) {
					System.out.println(book);
				}
				System.out.println(divider);
				
			}else if (menuOption == removeBook) {
				
				if (stack.empty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					
					stack.pop();
					
					System.out.println(divider);					
					for (String book : stack) {
						System.out.println(book);
					}					
					System.out.println("Um Livro foi retirado da pilha!");
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
