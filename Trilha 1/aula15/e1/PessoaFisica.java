package aula15.e1;

public class PessoaFisica extends Cliente{
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
		super.visualizarCliente();
		System.out.println(this.cpf);
	}
}
