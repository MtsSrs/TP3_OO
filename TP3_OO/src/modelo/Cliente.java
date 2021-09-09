package modelo;

import java.util.ArrayList;
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
        System.out.println("Digite o nome do cliente: " + i + "�");
        String nomeCliente = Main.sc.nextLine();

        System.out.println("Digite o endereco do cliente: " + i + "�");
        String enderecoCliente = Main.sc.nextLine();

        System.out.println("Digite o CPF do cliente: " + i + "�");
        String cpfCliente = Main.sc.nextLine();

        String telefoneCliente = Telefone.cadastrarTelefone(i);

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, cpfCliente, telefoneCliente);
        Main.clientes.add(cliente);
    }

    public static void visualizarClientes() {
for (int i = 0; i < Main.clientes.size(); i++) {
            System.out.print(i + "� - ");
            System.out.println(Main.clientes.get(i));
            System.out.println("__");
        }
    }

    public static void editarCliente(int i, ArrayList<Cliente> clientes) {

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = Main.sc.nextLine();

        System.out.println("Digite o endereco do cliente:");
        String enderecoCliente = Main.sc.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpfCliente = Main.sc.nextLine();

        String telefoneCliente = Telefone.cadastrarTelefone(i);

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
        return "Cliente [\nNome do cliente = " + nomeCliente + "\nEndereco do cliente = " + enderecoCliente 
                + "\nCPF do cliente = " + cpfCliente + "\nTelefone do cliente = " + telefoneCliente + "\n]";
    }
}
