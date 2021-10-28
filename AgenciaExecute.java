package agenciaViagem;

public class AgenciaExecute {

	public static void main(String[] args) {
		
		//OBJETO CLIENTE E DESTINO PASSANDO PARAMETROS PELOS METODOS SET
		
		Cliente naruto = new Cliente();
		naruto.setNome("Naruto Uzumaki");
		naruto.setCpf("777.777.77-7");
		naruto.setTelefone("1197777-7777");

		Destino clienteUm = new Destino();
		clienteUm.setData("10/04/22 a 15/04/22");
		clienteUm.setDestino("Fortaleza");
		clienteUm.setHorario("08h");
		clienteUm.setPreco(800);
		clienteUm.setCliente(naruto);

		Cliente sasuke = new Cliente();
		sasuke.setNome("Sasuke Uchiha");
		sasuke.setCpf("999.999.99-9");
		sasuke.setTelefone("1196744-5543");

		Destino clienteDois = new Destino();
		clienteDois.setData("08/02/22 a 11/08/22");
		clienteDois.setDestino("Belo horizonte");
		clienteDois.setHorario("14h");
		clienteDois.setPreco(970);
		clienteDois.setCliente(sasuke);

		Cliente sakura = new Cliente();
		sakura.setNome("Sakura Haruno");
		sakura.setCpf("10.101.01-0");
		sakura.setTelefone("1196781-9900");

		Destino clienteTres = new Destino();
		clienteTres.setData("09/12/22 a 05/01/23");
		clienteTres.setDestino("Japão");
		clienteTres.setHorario("23h");
		clienteTres.setPreco(1000);
		clienteTres.setCliente(sakura);
		
		//OBJETO CLIENTE E DESTINO PASSANDO PARAMETROS PELO METODO CONSTRUTOR
		
		Destino clienteQuatro = new Destino("Londres", "28/10/22 a 10/11/22", "16h", 800);
		Cliente choji = new Cliente("Choji Akimich", "789.898.99-9", "119090-4490");
		clienteQuatro.setCliente(choji);
		
		//EXIBINDO OS DADOS NO CONSOLE

		System.out.println("------- CONSULTA DE DADOS --------");
		clienteUm.dados();

		System.out.println("-------------------------------");
		clienteDois.dados();

		System.out.println("-------------------------------");
		clienteTres.dados();
		
		System.out.println("-------------------------------");
		clienteQuatro.dados();

	}

}
