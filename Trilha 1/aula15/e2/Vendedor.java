package aula15.e2;

public class Vendedor extends Funcionario {
	
	private int vendasUltimoMes;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(int pis, String nome, int idade, String email, String telefone, int vendasUltimoMes) {
		super(pis, nome, idade, email, telefone);
		this.vendasUltimoMes = vendasUltimoMes;
	}

	public int getVendasUltimoMes() {
		return vendasUltimoMes;
	}

	public void setVendasUltimoMes(int vendasUltimoMes) {
		this.vendasUltimoMes = vendasUltimoMes;
	}

	@Override
	public void visualizarFuncionario() {
		super.visualizarFuncionario();
		System.out.println("Vendas no último mês: " + this.vendasUltimoMes);
	}
}
