package aula16.e2;

public class Gerente extends Funcionario{
	
	private int qtdSubordinados;
	
	public Gerente() {
		super();
	}
	
	public Gerente(int pis, String nome, int idade, String email, String telefone, int qtdSubordinados) {
		super(pis, nome, idade, email, telefone);
		this.qtdSubordinados = qtdSubordinados;
	}

	public int getQtdSubordinados() {
		return qtdSubordinados;
	}

	public void setQtdSubordinados(int qtdSubordinados) {
		this.qtdSubordinados = qtdSubordinados;
	}

	@Override
	public void visualizarFuncionario() {
		System.out.println(super.pis);
		System.out.println(super.nome);
		System.out.println(super.idade);
		System.out.println(super.email);
		System.out.println(super.telefone);
		System.out.println("Quantidade de subordinados: " + this.qtdSubordinados);
	}
}