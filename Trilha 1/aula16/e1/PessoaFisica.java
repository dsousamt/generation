package aula16.e1;

public class PessoaFisica extends Cliente implements Visivel{
	private long cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(int id, String nome, int idade, String email, String telefone, long cpf) {
		super(id, nome, idade, email, telefone);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizarCliente() {
		System.out.println(super.id);
		System.out.println(super.nome);
		System.out.println(super.idade);
		System.out.println(super.email);
		System.out.println(super.telefone);
		System.out.println(this.cpf);
	}
}