package aula15.e1;

public class PessoaJuridica extends Cliente {
	private long cnpj;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(int id, String nome, int idade, String email, String telefone, long cnpj) {
		super(id, nome, idade, email, telefone);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizarCliente() {
		super.visualizarCliente();
		System.out.println(this.cnpj);
	}
}
