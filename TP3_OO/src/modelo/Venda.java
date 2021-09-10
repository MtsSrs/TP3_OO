package modelo;

import java.util.ArrayList;

import test_application.Main;

public class Venda {

    private int idVenda = 0;
    private Cliente clienteVenda;
    private float precoVenda;

    public Venda(int idVenda, Cliente clienteVenda, float precoVenda) {
        this.idVenda = idVenda;
        this.clienteVenda = clienteVenda;
        this.precoVenda = precoVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public static void vendaCliente() {

        Cliente.visualizarNomeCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int selecaoCliente = Main.sc.nextInt();

        Pastel.visualizarNomePastelId();

        System.out.println("Digite o número do pastel comprado");
        int selecaoPastel = Main.sc.nextInt();

        Bebida.visualizarNomeBebidaId();
        System.out.println("Digite o número da bebida comprada");
        int selecaoBebida = Main.sc.nextInt();

        Cliente clienteVenda = Main.clientes.get(selecaoCliente);
        //setPrecoVenda(Main.pasteis.get(selecaoPastel).getPrecoProduto() + Main.bebidas.get(selecaoBebida).getPrecoProduto());

        float preco1 = Main.pasteis.get(selecaoPastel).getPrecoProduto();
        float preco2 = Main.bebidas.get(selecaoBebida).getPrecoProduto();

        int idVenda = Main.vendas.size();

        Venda venda = new Venda(idVenda, clienteVenda, (preco1 + preco2));
Main.vendas.add(venda);

    }

    public static void visualizarVendas() {
        for (int i = 0; i < Main.vendas.size(); i++) {
            System.out.print(i + "º - ");
            System.out.println(Main.vendas.get(i));
            System.out.println("__");
        }

    }

    public static void editarVenda() {
        System.out.println("Digite o número da venda desejada");
        int i = Main.sc.nextInt();
        Main.sc.nextLine();
        while (i > Main.clientes.size()) {
            System.out.println("Não temos tantas vendas(ainda)\nDigite um novo número");
            i = Main.sc.nextInt();
            Main.sc.nextLine();
        }

        Cliente.visualizarNomeCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int selecaoCliente = Main.sc.nextInt();

        Pastel.visualizarNomePastelId();

        System.out.println("Digite o número do pastel comprado");
        int selecaoPastel = Main.sc.nextInt();

        Bebida.visualizarNomeBebidaId();
        System.out.println("Digite o número da bebida comprada");
        int selecaoBebida = Main.sc.nextInt();

        Cliente clienteVenda = Main.clientes.get(selecaoCliente);

        float preco1 = Main.pasteis.get(selecaoPastel).getPrecoProduto();
        float preco2 = Main.bebidas.get(selecaoBebida).getPrecoProduto();

        int idVenda = Main.vendas.get(i).getIdVenda();

        Venda venda = new Venda(idVenda, clienteVenda, (preco1 + preco2));
        Main.vendas.set(i, venda);
        System.out.println("Venda editada\n");
    }

    public static void deletarVenda() {
        visualizarVendas();
        System.out.println("Digite o número do cliente desejado");
        int i = Main.sc.nextInt();
        Main.sc.nextLine();
        Main.vendas.remove(i);
        System.out.println("Venda totalmente removida\n");
    }

    @Override
public String toString() {
        return "Venda [\nID da venda = " + idVenda + "\n" + Main.clientes.get(idVenda).getNomeCliente() 
                + "\nPreço total:" + precoVenda + "]";
    }

}