package modelo;

import java.util.ArrayList;
import java.util.Collection;

import test_application.Main;

public class Cliente {

	private String nomeCliente;
	private String enderecoCliente;
	private String cpfCliente;
	private String telefoneCliente; 


	public Cliente(String nomeCliente, String enderecoCliente, String cpfCliente, String telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	

	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	

	public String getCpfCliente() {
		return cpfCliente;
	}
	

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}


	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}


	public static void cadastrarCliente(int i) {
		System.out.println("Digite o nome do cliente: " + i + "º");
		String nomeCliente = Main.sc.nextLine();

		System.out.println("Digite o endereco do cliente: " + i + "º");
		String enderecoCliente = Main.sc.nextLine();

		System.out.println("Digite o CPF do cliente: " + i + "º");
		String cpfCliente = Main.sc.nextLine();

		System.out.println("Digite o telefone do cliente: " + i + "º");
		String telefoneCliente = Main.sc.nextLine();

		Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
		Main.clientes.add(cliente);
	}

	public static void visualizarClientes() {
		for (int i = 0; i < Main.clientes.size(); i++) {
			System.out.print(i + "º - ");
			System.out.println(Main.clientes.get(i));
			System.out.println("____________________________________________");
		}
	}

	public static void editarCliente(int i, ArrayList<Cliente> clientes) {
		
		System.out.println("Digite o nome do cliente:");
		String nomeCliente = Main.sc.nextLine();

		System.out.println("Digite o endereco do cliente:");
		String enderecoCliente = Main.sc.nextLine();

		System.out.println("Digite o CPF do cliente:");
		String cpfCliente = Main.sc.nextLine();

		System.out.println("Digite o telefone do cliente:");
		String telefoneCliente = Main.sc.nextLine();
		Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
		clientes.set(i, cliente);
		System.out.println("Cliente editado\n");
		}
		

	public static void deletarCliente(int i, ArrayList<Cliente> clientes) {
		clientes.remove(i);
		System.out.println("Cliente totalmente removido\n");
	}

	@Override
	public String toString() {
		return "Cliente [\nnomeCliente = " + nomeCliente + "\nenderecoCliente = " + enderecoCliente + "\ncpfCliente = "
				+ cpfCliente + "\ntelefoneCliente = " + telefoneCliente + "\n]";
	}
}