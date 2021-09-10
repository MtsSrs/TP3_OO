package modelo;

import java.util.ArrayList;

import test_application.Main;

public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;

	public Pastel(String nomeProduto, float precoProduto, int idProduto, String descricaoProduto, String caloriaProduto,
			String saborPastel, String comprimentoPastel) {
		super(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto);
		this.saborPastel = saborPastel;
		this.comprimentoPastel = comprimentoPastel;
	}

	public static void cadastrarPastel() {
		System.out.println("Digite o número de pasteis que serão cadastrados");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Digite o nome do Pastel: " + i + "º");
			String nomeProduto = Main.sc.nextLine();

			System.out.println("Digite o Preço do pastel: " + i + "º");
			float precoProduto = Main.sc.nextFloat();
			Main.sc.nextLine();

			System.out.println("Digite o id do pastel: " + i + "º");
			int idProduto = Main.sc.nextInt();
			Main.sc.nextLine();

			System.out.println("Digite a descrição do pastel: " + i);
			String descricaoProduto = Main.sc.nextLine();

			System.out.println("Digite a caloria do pastel: " + i);
			String caloriaProduto = Main.sc.nextLine();

			System.out.println("Digite o sabor do pastel: " + i);
			String saborPastel = Main.sc.nextLine();

			System.out.println("Digite o comprimento do pastel: " + i);
			String comprimentoPastel = Main.sc.nextLine();

			System.out.println("Digite a quantidade em estoque do pastel: " + i);
			int estoquePastel = Main.sc.nextInt();
			Main.sc.nextLine();

			Pastel pasteis = new Pastel(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto,
					saborPastel, comprimentoPastel);
			Main.estoque_pastel.add(estoquePastel);
			Main.pasteis.add(pasteis);
		}
	}

	public static void visualizarPastel() {
		for (int i = 0; i < Main.pasteis.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Main.pasteis.get(i));
			System.out.println("___________________________________\n");
		}
	}

	public static void editarPastel(ArrayList<Pastel> pasteis) {

		System.out.println("Digite o número do pastel desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > pasteis.size()) {
			System.out.println("Não temos tantos pastéis(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}

		System.out.println("Digite o nome do Pastel: " + i + "º");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o Preço do pastel: " + i + "º");
		float precoProduto = Main.sc.nextFloat();
		Main.sc.nextLine();

		System.out.println("Digite o id do pastel: " + i + "º");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite a descrição do pastel: " + i + "º");
		String descricaoProduto = Main.sc.nextLine();

		System.out.println("Digite a caloria do pastel: " + i + "º");
		String caloriaProduto = Main.sc.nextLine();

		System.out.println("Digite o sabor do pastel: " + i + "º");
		String saborPastel = Main.sc.nextLine();

		System.out.println("Digite o comprimento do pastel: " + i + "º");
		String comprimentoPastel = Main.sc.nextLine();

		System.out.println("Digite a quantidade em estoque do pastel: " + i);
		int estoquePastel = Main.sc.nextInt();
		Main.sc.nextLine();

		Pastel pastel = new Pastel(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto, saborPastel,
				comprimentoPastel);
		pasteis.set(i, pastel);
		Main.estoque_pastel.set(i, estoquePastel);
		System.out.println("Pastel editado\n");

	}

	public static void visualizarNomePastelId() {
		for (int i = 0; i < Main.pasteis.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Main.pasteis.get(i).getNomeProduto());
			System.out.println("___________________________________\n");
		}
	}

	public static void deletarPastel(ArrayList<Pastel> pasteis) {
		System.out.println("Digite o número do pastel desejado");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		
		pasteis.remove(i);
		Main.estoque_pastel.remove(i);
		System.out.println("Pastel totalmente removido\n");
	}
	
	public static void buscarPastelPedido(ArrayList<Pastel> pasteis) {
		System.out.println("Digite o nome do sabor");
		String nome = Main.sc.nextLine();
		try {
			for (Pastel p : pasteis) {
				if (p.getSaborPastel().toUpperCase().equals(nome.toUpperCase())) {
					System.out.println("_________________________________________");
					System.out.println(p);
					System.out.println("_________________________________________");
				}
			}
		} catch (Exception e) {
			System.out.println("Sabor não encontrado");
		}
		return;
	}

	public String getSaborPastel() {
		return saborPastel;
	}

	public void setSaborPastel(String saborPastel) {
		this.saborPastel = saborPastel;
	}

	public String getComprimentoPastel() {
		return comprimentoPastel;
	}

	public void setComprimentoPastel(String comprimentoPastel) {
		this.comprimentoPastel = comprimentoPastel;
	}

	@Override
	public String toString() {
		return "Pastel [\nsaborPastel = " + saborPastel + "\ncomprimentoPastel = " + comprimentoPastel
				+ " cm\nnomeProduto = " + nomeProduto + "\nprecoProduto = R$ " + precoProduto + "\nidProduto = "
				+ idProduto + "\ndescricaoProduto = " + descricaoProduto + "\ncaloriaProduto = " + caloriaProduto
				+ " kcal\n" + "]";
	}

}