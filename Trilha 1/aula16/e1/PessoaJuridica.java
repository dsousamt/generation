package aula16.e1;

public class PessoaJuridica extends Cliente implements Visivel{
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
		System.out.println(super.id);
		System.out.println(super.nome);
		System.out.println(super.idade);
		System.out.println(super.email);
		System.out.println(super.telefone);
		System.out.println(this.cnpj);
	}
}