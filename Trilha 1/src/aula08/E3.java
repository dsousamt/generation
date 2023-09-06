package aula08;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adNoturno, horaExtra, descontos, salarioLiq;
		
		System.out.println("Qual é o seu salário bruto?");
		salarioBruto = sc.nextFloat();
		System.out.println("Quanto de adicional noturno?");
		adNoturno = sc.nextFloat();
		System.out.println("Horas Extras?");
		horaExtra = sc.nextFloat();
		System.out.println("Há algum desconto? 0 para não");
		descontos = sc.nextFloat();
		
		salarioLiq = salarioBruto + adNoturno + horaExtra * 5 - descontos;
		
		System.out.println(salarioLiq);
		
		sc.close();
	}
}
