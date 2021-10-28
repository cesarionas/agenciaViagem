package agenciaViagem;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	//CONSTRUTOR VAZIO
	public Cliente() {
		
	}
	//CONSTRUTOR COM PARAMETROS
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	//METODO DE CADASTRAMENTO DO CLIENTE GUARDANDO NOME, CPF E TELEFONE
	void cadastro() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
