package aula16.e1;

public abstract class Cliente implements Visivel{
	protected int id;
	protected String nome;
	protected int idade;
	protected String email;
	protected String telefone;
	
	public Cliente() {}
	
	public Cliente(int id, String nome, int idade, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return telefone;
	}

	public void setNumero(String telefone) {
		this.telefone = telefone;
	}	
}
