package aula08;

import java.util.Scanner;

public class E1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double salario, abono, novoSalario;
			
			System.out.println("\nDigite o salário: ");
			
			salario = sc.nextDouble();
			
			System.out.println("\nDigite o abono: ");
			
			abono = sc.nextDouble();
			
			novoSalario = salario + abono;
			
			//System.out.println("R$ " + novoSalario);
			
			System.out.printf("O novo salário é: %.2f", novoSalario);			
			
			sc.close();
		}
}
