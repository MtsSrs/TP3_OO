package modelo;

import java.util.ArrayList;
import test_application.Main;

public class Cliente {

    private String nomeCliente;
    private String enderecoCliente;
    private String cpfCliente;
    private Telefone telefoneCliente; 


    public Cliente(String nomeCliente, String enderecoCliente, String cpfCliente, Telefone telefoneCliente) {
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


    public Telefone getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(Telefone telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }


    public static void cadastrarCliente() {
    	
    	System.out.println("Digite o número de clientes que serão cadastrados");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		
		for (int i = 0; i < size; i++) {
        System.out.println("Digite o nome do cliente: " + i + "º");
        String nomeCliente = Main.sc.nextLine();

        System.out.println("Digite o endereco do cliente: " + i + "º");
        String enderecoCliente = Main.sc.nextLine();

        System.out.println("Digite o CPF do cliente: " + i + "º");
        String cpfCliente = Main.sc.nextLine();

        Telefone telefoneCliente = Telefone.cadastrarTelefone(i);

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
        Main.clientes.add(cliente);
		}
    }

    public static void visualizarClientes() {
for (int i = 0; i < Main.clientes.size(); i++) {
            System.out.print(i + "º - ");
            System.out.println(Main.clientes.get(i));
            System.out.println("__");
        }
    }

    public static void editarCliente(ArrayList<Cliente> clientes) {
    	
    	System.out.println("Digite o número do cliente desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > clientes.size()) {
			System.out.println("Não temos tantos clientes(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}
    	
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = Main.sc.nextLine();

        System.out.println("Digite o endereco do cliente:");
        String enderecoCliente = Main.sc.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpfCliente = Main.sc.nextLine();

        Telefone telefoneCliente = Telefone.cadastrarTelefone(i);

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
        clientes.set(i, cliente);
        System.out.println("Cliente editado\n");
        }
    
    public static void visualizarNomeCliente() {
        for (int i = 0; i < Main.clientes.size(); i++) {
            System.out.print(i + " - ");
            System.out.println(Main.clientes.get(i).getNomeCliente());
            System.out.println("___");
        }
    }

    public static void deletarCliente(ArrayList<Cliente> clientes) {
    	
    	System.out.println("Digite o número do cliente desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
    	
    	clientes.remove(i);
        System.out.println("Cliente totalmente removido\n");
        
    }

    @Override
    public String toString() {
        return "Cliente [\n Nome do cliente = " + nomeCliente + "\nEndereco do cliente = " + enderecoCliente 
                + "\nCPF do cliente = " + cpfCliente + "\nTelefone do cliente = " + telefoneCliente + "\n]";
    }
}