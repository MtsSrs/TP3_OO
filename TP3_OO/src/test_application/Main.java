package test_application;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Bebida;
import modelo.Cliente;
import modelo.Estabelecimento;
import modelo.Estoque;
import modelo.Pastel;
import modelo.Telefone;
import modelo.Venda;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Cliente> clientes;
	public static ArrayList<Bebida> bebidas;
	public static ArrayList<Pastel> pasteis;
	public static ArrayList<Integer> estoque_pastel;
	public static ArrayList<Integer> estoque_bebida;
	public static ArrayList<Estabelecimento> estabelecimentos;
	public static ArrayList<Venda> vendas;

	public static void main(String[] args) {

		// Todas as ArraysUtilizadas, Aqui estão tambem dados pré-cadastrados.

		int caseSelect = 0;
		clientes = new ArrayList<Cliente>();
		bebidas = new ArrayList<Bebida>();
		pasteis = new ArrayList<Pastel>();
		estoque_pastel = new ArrayList<Integer>();
		estoque_bebida = new ArrayList<Integer>();
		estabelecimentos = new ArrayList<Estabelecimento>();
		vendas = new ArrayList<Venda>();

		clientes.add(new Cliente("Mateus", "Brasília", "11111111111", new Telefone("61", "123456789")));
		clientes.add(new Cliente("Matheus", "Valparaíso", "22222222222", new Telefone("61", "987654321")));

		bebidas.add(new Bebida("Água", (float) 4.99, 1, "Uma garrafa de água", "0", "Água", "500"));
		bebidas.add(new Bebida("Coca-cola", (float) 7.99, 2, "Uma lata de Coca-cola", "85", "Refrigerante", "300"));
		bebidas.add(new Bebida("Coca-cola light", (float) 7.99, 3, "Uma lata de Coca-cola light", "2", "Refrigerante",
				"300"));

		pasteis.add(new Pastel("Pastel de queijo pequeno", (float) 13.99, 1, "Pastel recheado com queijo", "215",
				"Salgado", "10"));
		pasteis.add(new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
				"Salgado", "10"));
		pasteis.add(new Pastel("Pastel de chocolate médio", (float) 15.99, 3, "Pastel recheado com carne", "250",
				"Doce", "15"));

		estabelecimentos.add(new Estabelecimento("Brasília", "11111111", new Telefone("61", "111112222")));
		estabelecimentos.add(new Estabelecimento("Valparaíso", "22222222", new Telefone("61", "222221111")));

		estoque_pastel.add(10);
		estoque_pastel.add(20);
		estoque_pastel.add(30);
		estoque_bebida.add(30);
		estoque_bebida.add(40);
		estoque_bebida.add(50);


		mensagemBoasVindas();

		do {
			menuInicial();
			caseSelect = sc.nextInt();
			sc.nextLine();
			switch (caseSelect) {
			case 1: // Switch remete a função de cadastrar clientes

				Cliente.cadastrarCliente();

				break;

			case 2: // Switch remete a função de visualizar Clientes

				Cliente.visualizarClientes();

				break;

			case 3: // Switch remete a função de Editar clientes, a função visualizar é chamada para
					// auxiliar no processo.

				Cliente.visualizarClientes();
				Cliente.editarCliente(clientes);

				break;

			case 4: // Switch remete a função de Deletar clientes, a função visualizar é chamada
					// para
					// auxiliar no processo

				Cliente.visualizarClientes();
				Cliente.deletarCliente(clientes);

				break;

			case 5: // Switch remete a função de cadastrar Bebida;

				Bebida.cadastrarBebida();

				break;

			case 6: // Switch remete a função de visualizar bebida.

				Bebida.visualizarBebidas();

				break;

			case 7: // Switch remete a função de editar bebida, a função visualizar é chamada para
					// auxiliar.

				Bebida.visualizarBebidas();
				Bebida.editarBebida(bebidas);

				break;

			case 8: // Switch remete a função de deletar bebida, a função visualizar é chamada para
					// auxiliar.

				Bebida.visualizarBebidas();
				Bebida.deletarBebida(bebidas);

				break;

			case 9: // Switch remete a função cadastrar Pastel.

				Pastel.cadastrarPastel();

				break;

			case 10: // Switch remete a função visualizar Pastel.

				Pastel.visualizarPastel();
				break;

			case 11: // Switch remete a função editar Pastel, a função visualizar é chamada para
						// auxiliar.

				Pastel.visualizarPastel();
				Pastel.editarPastel(pasteis);

				break;

			case 12:  // Switch remete a função deletar pastel.

				Pastel.visualizarPastel();
				Pastel.deletarPastel(pasteis);

				break;

			case 13: //Switch remete a função cadastrar estabelecimento.

				Estabelecimento.cadastrarEstabelecimento();

				break;

			case 14:  //Switch remete a função visualizar estabelecimento.

				Estabelecimento.visualizarEstabelecimentos();
				break;

			case 15:  //Switch remete a função editar estabelecimento.

				Estabelecimento.visualizarEstabelecimentos();
				Estabelecimento.editarEstabelecimento(estabelecimentos);

				break;

			case 16: //Switch remete a função deletar estabelecimento.

				Estabelecimento.visualizarEstabelecimentos();
				Estabelecimento.deletarEstabelecimento(estabelecimentos);

				break;

			case 17: //Switch remete a função cadastrar estoque produto(De fato ela edita .... o cadastro em si é feito junto com cadastro do produto).

				Estoque.cadastrarEstoqueProduto();
				break;

			case 18: //Switch visualizar estoque produto, vem embutido um filtro de estoque

				Estoque.visualizarEstoqueProduto();
				break;

			case 19:  //Switch deletar estoque

				Estoque.deletarEstoque();
				break;

			case 20: //Switch Cadastro venda para cliente

				Venda.vendaCliente();
				break;

			case 21: //Switch de visualizar vendas

				Venda.visualizarVendas();
				break;

			case 22: //Switch editar Venda

				Venda.visualizarVendas();
				Venda.editarVenda();
				break;

			case 23: //Switch deletar venda

				Venda.deletarVenda();
				break;

			case 24: //Switch de filtro de pasteis por sabor

				Pastel.filtrarPastel(pasteis);
				break;

			case 25:  //Switch de filtro

				Estoque.filtrarEstoque();
				break;

			case 26: //Exit do programa

				System.out.println("Programa finalizado");
				break;

			default: //Error
				System.out.println("error\nRetornando ao menu!");
				Main.menuInicial();
			}
		} while (caseSelect != 26);

		sc.close();
	}

	public static void menuInicial() {
		try {
			Thread.sleep(2000);
			System.out.println("\nEscolha uma opção:\n" + "\n______________Opções Cliente______________\n\n"
					+ "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
					+ "3.Editar um cadastro de cliente\n" + "4.Deletar um Cliente\n"
					+ "__________________________________________\n\n"
					+ "\n______________Opções Bebida_______________\n\n" + "5.Cadastro de nova bebida\n"
					+ "6.Visualizar a lista de bebidas\n" + "7.Editar uma bebida\n" + "8.Deletar uma bebida\n"
					+ "__________________________________________\n\n"
					+ "\n______________Opções Pastel_______________\n\n" + "9.Cadastrar Pastel\n"
					+ "10.Visualizar a lista de pastéis\n" + "11.Editar um pastel\n" + "12.Deletar um pastel\n"
					+ "__________________________________________\n\n"
					+ "\n__________Opções Estabelecimento__________\n\n" + "13.Cadastrar novo estabelecimento\n"
					+ "14.Visualizar lista de " + "Estabelecimentos" + "\n15.Editar um estabelecimento"
					+ "\n16.Deletar um estabelecimento" + "\n__________________________________________\n\n"
					+ "\n_____________Opções Estoque_______________\n\n" + "17.Edita Estoque"
					+ "\n18.Visualizar/filtrar estoque" + "\n19.Zerar Estoque"
					+ "\n__________________________________________\n\n"
					+ "\n______________Opções Venda________________\n\n" + "20.Cadastrar venda"
					+ "\n21.Visualizar vendas" + "\n22.Editar uma venda" + "\n23.Deletar uma venda"
					+ "\n__________________________________________\n\n"
					+ "\n______________Opções Filtros______________\n\n" + "24.Filtrar Pastéis por sabor"
					+ "\n25.Filtro Estoque" + "\n26.Sair" + "\n__________________________________________\n\n");

		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void mensagemBoasVindas() {
		System.out.println("Bem Vindo, Aguarde alguns segundos...\nProcessando...");
		System.out.println("Sim... Isso é um delay programado pra ficar mais fácil de ver o menu!");
	}

}