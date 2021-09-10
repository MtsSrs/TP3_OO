package modelo;

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
    	int aux = 0;
    	float preco1 = 0;
    	float preco2 = 0;
        Cliente.visualizarNomeCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int selecaoCliente = Main.sc.nextInt();

        Pastel.visualizarNomePastelId();
        
        do {
	        System.out.println("Digite o número do pastel comprado");
	        int selecaoPastel = Main.sc.nextInt();
	        
	        System.out.println("Digite a quantidade comprada");
	        int quantidadePastel = Main.sc.nextInt();
	        
	        preco1 = preco1+quantidadePastel*Main.pasteis.get(selecaoPastel).getPrecoProduto();
	        
	        System.out.println("Deseja cadastrar outro pastel na compra? 1-Sim/2-Não");
	        aux = Main.sc.nextInt();
        } while (aux != 2);
        

        Bebida.visualizarNomeBebidaId();
	        do {
	        	System.out.println("Digite o número da bebida comprada");
	        int selecaoBebida = Main.sc.nextInt();
	        
	        System.out.println("Digite a quantidade comprada");
	        int quantidadeBebida = Main.sc.nextInt();
	        
	        preco2 = preco2+quantidadeBebida*Main.bebidas.get(selecaoBebida).getPrecoProduto();
	        
	        System.out.println("Deseja cadastrar outra bebida na compra? 1-Sim/2-Não");
	        aux = Main.sc.nextInt();
        } while (aux !=2);
        

        Cliente clienteVenda = Main.clientes.get(selecaoCliente);
        //setPrecoVenda(Main.pasteis.get(selecaoPastel).getPrecoProduto() + Main.bebidas.get(selecaoBebida).getPrecoProduto());

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

        int aux = 0;
    	float preco1 = 0;
    	float preco2 = 0;
        Cliente.visualizarNomeCliente();

        System.out.println("Digite o número do cliente que realizou a compra");
        int selecaoCliente = Main.sc.nextInt();

        Pastel.visualizarNomePastelId();
        
        do {
	        System.out.println("Digite o número do pastel comprado");
	        int selecaoPastel = Main.sc.nextInt();
	        
	        System.out.println("Digite a quantidade comprada");
	        int quantidadePastel = Main.sc.nextInt();
	        
	        preco1 = preco1+quantidadePastel*Main.pasteis.get(selecaoPastel).getPrecoProduto();
	        
	        System.out.println("Deseja cadastrar outro pastel na compra? 1-Sim/2-Não");
	        aux = Main.sc.nextInt();
        } while (aux != 2);
        

        Bebida.visualizarNomeBebidaId();
	        do {
	        	System.out.println("Digite o número da bebida comprada");
	        int selecaoBebida = Main.sc.nextInt();
	        
	        System.out.println("Digite a quantidade comprada");
	        int quantidadeBebida = Main.sc.nextInt();
	        
	        preco2 = preco2+quantidadeBebida*Main.bebidas.get(selecaoBebida).getPrecoProduto();
	        
	        System.out.println("Deseja cadastrar outra bebida na compra? 1-Sim/2-Não");
	        aux = Main.sc.nextInt();
        } while (aux !=2);
        

        Cliente clienteVenda = Main.clientes.get(selecaoCliente);
        //setPrecoVenda(Main.pasteis.get(selecaoPastel).getPrecoProduto() + Main.bebidas.get(selecaoBebida).getPrecoProduto());

        int idVenda = Main.vendas.get(i).getIdVenda();

        Venda venda = new Venda(idVenda, clienteVenda, (preco1 + preco2));
        Main.vendas.set(i, venda);
    }

    public static void deletarVenda() {
        visualizarVendas();
        System.out.println("Digite o número da venda desejado");
        int i = Main.sc.nextInt();
        Main.sc.nextLine();
        Main.vendas.remove(i);
        System.out.println("Venda totalmente removida\n");
    }

    @Override
public String toString() {
        return "Venda [\nID da venda = " + idVenda + "\n" + Main.clientes.get(idVenda).getNomeCliente() 
                + "\nPreço total:" + precoVenda + " reais]";
    }

}