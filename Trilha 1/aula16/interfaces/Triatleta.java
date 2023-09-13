package aula16.interfaces;

public class Triatleta extends Pessoa implements Corredor, Nadador, Ciclista {
	
	public Triatleta(String nome) {
		super(nome);
	}

	@Override
	public void aquecer() {
		System.out.println("\naquecendo...");
		
	}

	@Override
	public void pedalar() {
		System.out.println("\npedalando...");
		
	}

	@Override
	public void nadar() {
		System.out.println("\nnadando...");
		
	}

	@Override
	public void correr() {
		System.out.println("\ncorrendo...");
		
	}
	
	
}
