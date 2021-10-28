package agenciaViagem;

public class Destino {
	private String destino;
	private String data;
	private String horario;
	private double preco;
	private Cliente cliente;

	//CONSTRUTOR VAZIO
	public Destino() {

	}

	//CONSTRUTOR COM PARAMETROS
	public Destino(String destino, String data, String horario, double preco) {

		this.destino = destino;
		this.data = data;
		this.horario = horario;
		this.preco = preco;
		
	}

	//METODO DADOS DA AGENCIA DE VIAGENS GUARDANDO DESTINO, DATA, HORARIO E PREÇO
	//UTILIZANDO TAMBEM O METODO DE CADASTRAMENTO DA CLASSE CLIENTE UNINDDO TODOS OS DADOS
	void dados() {
		cliente.cadastro();
		System.out.println("Destino: " + this.destino);
		System.out.println("Data: " + this.data);
		System.out.println("Horario: " + this.horario);
		System.out.println("Preço: " + this.preco);

	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preço) {
		this.preco = preço;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
