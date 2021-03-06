package modelo;

import test_application.Main;

public class Estoque {

	private Produto produto[];
	private int quantidade;

	public Estoque(Produto[] produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public static void cadastrarEstoqueProduto() {
		System.out.println("\nDigite - 1 - para cadastrar past?is \nDigite - 2 - para cadastrar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			System.out.println("Lista com nome e Id dos past?is\n");
			Pastel.visualizarNomePastelId();

			System.out.println("\nDigite o n?mero do item desejado para cadastrar uma nova\nquantidade");
			int idQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite quantas unidades ser?o adicionadas no estoque do\nitem: "
					+ Main.pasteis.get(idQuant).getNomeProduto());
			int estQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_pastel.set(idQuant, estQuant);

			System.out.println("Opera??o Conclu?da");
			return;
		}
		if (num == 2) {
			System.out.println("Lista com nome e Id das bebidas");
			Bebida.visualizarNomeBebidaId();

			System.out.println("\nDigite o n?mero do item desejado para cadastrar uma nova\nquantidade");
			int idQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite quantas unidades ser?o adicionadas no estoque do\nitem: "
					+ Main.bebidas.get(idQuant).getNomeProduto());
			int estQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_bebida.set(idQuant, estQuant);

			System.out.println("Opera??o Conclu?da");
			return;
		} else {

			System.out.println("Erro");
			return;
		}
	}

	public static void visualizarEstoqueProduto() {
		System.out.println("\nDigite - 1 - para visualizar past?is \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");

			}
			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}
			return;
		} else {
			System.out.println("Erro");
			return;
		}
	}

	public static void deletarEstoque() {
		System.out.println("\nDigite - 1 - para visualizar past?is \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");
			}

			System.out.println("Digite o n?mero do pastel desejado para zerar o estoque");
			int index = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_pastel.set(index, 0);

			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}

			System.out.println("Digite o n?mero da bebida desejada para zerar o estoque");
			int index = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_bebida.set(index, 0);

			return;
		} else {
			System.out.println("Erro");
			return;
		}

	}
	
	public static void filtrarEstoque() {
		System.out.println("\nDigite - 1 - para visualizar past?is \nDigite - 2 - para visualizar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			for (int i = 0; i < Main.pasteis.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.pasteis.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_pastel.get(i));
				System.out.println("___________________________________\n");

			}
			return;
		}
		if (num == 2) {
			for (int i = 0; i < Main.bebidas.size(); i++) {
				System.out.print(i + " - ");
				System.out.print(Main.bebidas.get(i).getNomeProduto());
				System.out.print(" - ");
				System.out.println(Main.estoque_bebida.get(i));
				System.out.println("___________________________________\n");
			}
			return;
		} else {
			System.out.println("Erro");
			return;
		}
		
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
