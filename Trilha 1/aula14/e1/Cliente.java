package aula14.e1;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private String telefone;
	
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
	
	public void visualizarCliente() {
		System.out.println(this.id);
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.email);
		System.out.println(this.telefone);
	}	
}
