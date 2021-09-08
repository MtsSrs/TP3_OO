package test_application;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Bebida;
import modelo.Cliente;
import modelo.Pastel;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Cliente> clientes;
	public static ArrayList<Bebida> bebidas;
	public static ArrayList<Pastel> pasteis;

	public static void main(String[] args) {
		int caseSelect = 0;
		clientes = new ArrayList<Cliente>();
		bebidas = new ArrayList<Bebida>();
		pasteis = new ArrayList<Pastel>();

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
				
				System.out.println("Digite o número do pastel desejada");
				i = sc.nextInt();
				sc.nextLine();
				while (i > pasteis.size()) {
					System.out.println("Não temos tantas bebidas(ainda)\nDigite um novo número");
					i = sc.nextInt();
					sc.nextLine();
				}
				Pastel.editarPastel(i, pasteis);

				break;

			case 12:
				System.out.println("Digite o número do pastel desejada");
				i = sc.nextInt();
				sc.nextLine();
				Pastel.deletarPastel(i, pasteis);
				
				break;

			default:
				System.out.println("error");
				System.exit(0);
			}
		} while (caseSelect != 15);

		sc.close();
	}

	public static void menuInicial() {
		System.out.println("Escolha uma opção\n" + "1.Cadastro de novo Cliente\n" + "2.Visualizar a lista de clientes\n"
				+ "3.Editar um cadastro\n" + "4.Deletar um Cliente\n" + "5.Cadastro de nova bebida\n"
				+ "6.Visualizar a lista de bebidas\n" + "7.Editar uma bebida\n" + "8.Deletar uma bebida\n"
				+ "9.Cadastrar Pastel\n" + "10.Visualizar a lista de pastéis\n" + "11.Editar um pastel\n"
				+ "12.Deletar um pastel\n");
	}

}