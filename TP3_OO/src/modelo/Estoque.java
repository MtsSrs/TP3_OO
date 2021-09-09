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
		System.out.println("Digite - 1 - para cadastrar pastéis \nDigite - 2 - para cadastrar bebidas\n");
		int num = Main.sc.nextInt();
		Main.sc.nextLine();
		if (num == 1) {
			System.out.println("Lista com nome e Id dos pastéis");
			Pastel.visualizarNomePastelId();

			System.out.println("\nDigite o número do item desejado para cadastrar uma nova quantidade");
			int idQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite quantas unidades serão adicionadas no estoque do item: "
					+ Main.pasteis.get(idQuant).getNomeProduto());
			int estQuant = Main.sc.nextInt();
			Main.sc.nextLine();

			Main.estoque_pastel.set(idQuant, estQuant);

			System.out.println("Operação Concluida");
			return;
		}
		if (num == 2) {

			int index = 1;

			System.out.println(Main.bebidas.get(index).getNomeProduto());
		} else {

			System.out.println("Erro");
			return;
		}
	}

	public static void visualizarEstoqueProduto() {
		System.out.println("Digite - 1 - para visualizar pastéis \nDigite - 2 - para visualizar bebidas\n");
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
