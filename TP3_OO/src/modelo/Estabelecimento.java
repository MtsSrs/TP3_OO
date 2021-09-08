package modelo;

import java.util.ArrayList;

import test_application.Main;

public class Estabelecimento {

	private String enderecoEstabelecimento;
	private String cepEstabelecimento;
	private String telefoneEstabelecimento;
	
	public Estabelecimento(String enderecoEstabelecimento, String cepEstabelecimento, String telefoneEstabelecimento) {
		this.enderecoEstabelecimento = enderecoEstabelecimento;
		this.cepEstabelecimento = cepEstabelecimento;
		this.telefoneEstabelecimento = telefoneEstabelecimento;
	}
	
	public String getEnderecoEstbelecimento() {
		return enderecoEstabelecimento;
	}
	
	public void setEnderecoEstbelecimento(String enderecoEstbelecimento) {
		this.enderecoEstabelecimento = enderecoEstbelecimento;
	}
	
	public String getCepEstabelecimento() {
		return cepEstabelecimento;
	}
	
	public void setCepEstabelecimento(String cepEstabelecimento) {
		this.cepEstabelecimento = cepEstabelecimento;
	}

	public String getTelefoneEstabelecimento() {
		return telefoneEstabelecimento;
	}

	public void setTelefoneEstabelecimento(String telefoneEstabelecimento) {
		this.telefoneEstabelecimento = telefoneEstabelecimento;
	}
	
	public static void cadastrarEstabelecimento(int i) {
		System.out.println("Digite o endereço do estabelecimento: " + i + "º");
		String enderecoEstabelecimento = Main.sc.nextLine();

		System.out.println("Digite o CEP do estabelecimento: " + i + "º");
		String cepEstabelecimento = Main.sc.nextLine();

		System.out.println("Digite o telefone do estabelecimento: " + i + "º");
		String telefoneEstabelecimento = Main.sc.nextLine();

		Estabelecimento estabelecimento = new Estabelecimento(enderecoEstabelecimento, cepEstabelecimento, 
															  telefoneEstabelecimento);
		Main.estabelecimentos.add(estabelecimento);	
		
	}
	
	public static void visualizarEstabelecimentos() {
		for (int i = 0; i < Main.estabelecimentos.size(); i++) {
			System.out.print(i + "º - ");
			System.out.println(Main.estabelecimentos.get(i));
			System.out.println("____________________________________________");
		}
	}
	
	public static void editarEstabelecimento(int i, ArrayList<Estabelecimento> estabelecimentos) {
			
			System.out.println("Digite o nome do estabelecimento:");
			String nomeEstabelecimento = Main.sc.nextLine();
	
			System.out.println("Digite o endereco do cliente:");
			String enderecoEstabelecimento = Main.sc.nextLine();
	
			System.out.println("Digite o CPF do cliente:");
			String telefoneEstabelecimento = Main.sc.nextLine();
	
			Estabelecimento estabelecimento = new Estabelecimento(nomeEstabelecimento, enderecoEstabelecimento, 
																  telefoneEstabelecimento);
			estabelecimentos.set(i, estabelecimento);
			System.out.println("Estabelecimento editado\n");
			}
	
	public static void deletarEstabelecimento(int i, ArrayList<Estabelecimento> estabelecimentos) {
		estabelecimentos.remove(i);
		System.out.println("Estabelecimento totalmente removido\n");
	}

	@Override
	public String toString() {
		return "Estabelecimento [\nEndereco do estabelecimento = " + enderecoEstabelecimento + "\nCEP do estabelecimento = "
				+ cepEstabelecimento + "\nTelefone do estabelecimento=" + telefoneEstabelecimento + "\n]";
	}
	
	

}
