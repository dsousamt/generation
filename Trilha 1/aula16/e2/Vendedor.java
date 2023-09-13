package aula16.e2;

public class Vendedor extends Funcionario{
	
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
		System.out.println(super.pis);
		System.out.println(super.nome);
		System.out.println(super.idade);
		System.out.println(super.email);
		System.out.println(super.telefone);
		System.out.println("Vendas no último mês: " + this.vendasUltimoMes);
	}
}