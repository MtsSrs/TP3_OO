package test_application;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Bebida;
import modelo.Cliente;
import modelo.Estabelecimento;
import modelo.Estoque;
import modelo.Pastel;
import modelo.Telefone;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Cliente> clientes;
	public static ArrayList<Bebida> bebidas;
	public static ArrayList<Pastel> pasteis;
	public static ArrayList<Integer> estoque_pastel;
	public static ArrayList<Integer> estoque_bebida;
	public static ArrayList<Estabelecimento> estabelecimentos;

	public static void main(String[] args) {
		int caseSelect = 0;
		clientes = new ArrayList<Cliente>();
		bebidas = new ArrayList<Bebida>();
		pasteis = new ArrayList<Pastel>();
		estoque_pastel = new ArrayList<Integer>();
		estoque_bebida = new ArrayList<Integer>();
		estabelecimentos = new ArrayList<Estabelecimento>();

		clientes.add(new Cliente("Mateus", "Brasília", "11111111111", new Telefone("61", "123456789")));
		clientes.add(new Cliente("Matheus", "Valparaíso", "22222222222", new Telefone("61", "987654321")));

		bebidas.add(new Bebida("Água", (float) 4.99, 1, "Uma garrafa de água", "0", "Água", "500"));
		bebidas.add(new Bebida("Coca-cola", (float) 7.99, 2, "Uma lata de Coca-cola", "85", "Refrigerante", "300"));

		pasteis.add(new Pastel("Pastel de queijo pequeno", (float) 13.99, 1, "Pastel recheado com queijo", "215",
				"Salgado", "10"));
		pasteis.add(new Pastel("Pastel de carne pequeno", (float) 13.99, 2, "Pastel recheado com carne", "149",
				"Salgado", "10"));

		estabelecimentos.add(new Estabelecimento("Brasília", "11111111", new Telefone("61", "111112222")));
		estabelecimentos.add(new Estabelecimento("Valparaíso", "22222222", new Telefone("61", "222221111")));
		
		estoque_pastel.add(10);
		estoque_pastel.add(20);
		estoque_bebida.add(30);
		estoque_bebida.add(40);

		do {
			menuInicial();
			caseSelect = sc.nextInt();
			sc.nextLine();
			switch (caseSelect) {
			case 1:

				System.out.println("Digite o número de clientes que serão cadastrados");
				int size = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < size; i++) {
					Cliente.cadastrarCliente(i);
				}

				break;

			case 2:

				Cliente.visualizarClientes();

				break;

			case 3:

				Cliente.visualizarClientes();
				System.out.println("Digite o número do cliente desejado");
				int i = sc.nextInt();
				sc.nextLine();
				while (i > clientes.size()) {
					System.out.println("Não temos tantos clientes(ainda)\nDigite um novo número");
					i = sc.nextInt();
					sc.nextLine();
				}
				Cliente.editarCliente(i, clientes);

				break;

			case 4:

				Cliente.visualizarClientes();
				System.out.println("Digite o número do cliente desejado");
				i = sc.nextInt();
				sc.nextLine();
				Cliente.deletarCliente(i, clientes);

				break;

			case 5:

				System.out.println("Digite o número de bebidas que serão cadastadas");
				size = sc.nextInt();
				sc.nextLine();
				for (i = 0; i < size; i++) {
					Bebida.cadastrarBebida(i);
				}

				break;

			case 6:

				Bebida.visualizarBebidas();

				break;

			case 7:

				Bebida.visualizarBebidas();
				System.out.println("Digite o número da bebida desejada");
				i = sc.nextInt();
				sc.nextLine();
				while (i > bebidas.size()) {
					System.out.println("Não temos tantas bebidas(ainda)\nDigite um novo número");
					i = sc.nextInt();
					sc.nextLine();
				}
				Bebida.editarBebida(i, bebidas);

				break;

			case 8:

				Bebida.visualizarBebidas();
				System.out.println("Digite o número da bebida desejada");
				i = sc.nextInt();
				sc.nextLine();
				Bebida.deletarBebida(i, bebidas);

				break;

			case 9:

				System.out.println("Digite o número de pasteis que serão cadastrados");
				size = sc.nextInt();
				sc.nextLine();
				for (i = 0; i < size; i++) {
					Pastel.cadastrarPastel(i);
				}

				break;

			case 10:

				Pastel.visualizarPastel();
				break;

			case 11:

				Pastel.visualizarPastel();
				System.out.println("Digite o número do pastel desejado");
				i = sc.nextInt();
				sc.nextLine();
				while (i > pasteis.size()) {
					System.out.println("Não temos tantos pastéis(ainda)\nDigite um novo número");
					i = sc.nextInt();
					sc.nextLine();
				}
				Pastel.editarPastel(i, pasteis);

				break;

			case 12:

				Pastel.visualizarPastel();
				System.out.println("Digite o número do pastel desejado");
				i = sc.nextInt();
				sc.nextLine();
				Pastel.deletarPastel(i, pasteis);

				break;

			case 13:

				System.out.println("Digite o número de estabelecimentos que serão cadastrados");
				size = sc.nextInt();
				sc.nextLine();
				for (i = 0; i < size; i++) {
					Estabelecimento.cadastrarEstabelecimento(i);
				}

				break;

			case 14:

				Estabelecimento.visualizarEstabelecimentos();
				break;

			case 15:

				Estabelecimento.visualizarEstabelecimentos();
				System.out.println("Digite o número do estabelecimento desejado");
				i = sc.nextInt();
				sc.nextLine();
				while (i > estabelecimentos.size()) {
					System.out.println("Não temos tantos estabelecimentos(ainda)\nDigite um novo número");
					i = sc.nextInt();
					sc.nextLine();
				}
				Estabelecimento.editarEstabelecimento(i, estabelecimentos);
				;

				break;

			case 16:

				Estabelecimento.visualizarEstabelecimentos();
				System.out.println("Digite o número do estabelecimento desejado");
				i = sc.nextInt();
				sc.nextLine();
				Estabelecimento.deletarEstabelecimento(i, estabelecimentos);

				break;

			case 17:

				Estoque.cadastrarEstoqueProduto();
				break;

			case 18:

				Estoque.visualizarEstoqueProduto();
				break;
				
			case 19:
				
				Estoque.deletarEstoque();
				break;
				
			default:
				System.out.println("error");
				System.exit(0);
			}
		} while (caseSelect < 30);

		sc.close();
	}

	public static void menuInicial() {
		System.out.println("Escolha uma opção\n" + "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
				+ "3.Editar um cadastro\n" + "4.Deletar um Cliente\n" + "5.Cadastro de nova bebida\n"
				+ "6.Visualizar a lista de bebidas\n" + "7.Editar uma bebida\n" + "8.Deletar uma bebida\n"
				+ "9.Cadastrar Pastel\n" + "10.Visualizar a lista de pastéis\n" + "11.Editar um pastel\n"
				+ "12.Deletar um pastel\n" + "13.Cadastrar novo estabelecimento\n" + "14.Visualizar lista de "
				+ "Estabelecimentos" + "\n15.Editar um estabelecimento" + "\n16.Deletar um estabelecimento"
				+ "\n17.Edita Estoque" + "\n18.Visualizar Estoque" + "\n19.Zerar Estoque");
	}

}