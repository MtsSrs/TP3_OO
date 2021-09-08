package modelo;

import java.util.ArrayList;

import test_application.Main;

public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;

	public Pastel(String nomeProduto, float precoProduto, int idProduto, String saborPastel, String comprimentoPastel) {
		super(nomeProduto, precoProduto, idProduto);
		this.saborPastel = saborPastel;
		this.comprimentoPastel = comprimentoPastel;
	}

	public static void cadastrarPastel(int i) {
		System.out.println("Digite o nome do Pastel: " + i + "º");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o Preço do pastel: " + i + "º");
		float precoProduto = Main.sc.nextFloat();
		Main.sc.nextLine();

		System.out.println("Digite o id do pastel: " + i + "º");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite o sabor do pastel: " + i + "º");
		String saborPastel = Main.sc.nextLine();

		System.out.println("Digite o comprimento do pastel: " + i + "º");
		String comprimentoPastel = Main.sc.nextLine();

		Pastel pasteis = new Pastel(nomeProduto, precoProduto, idProduto, saborPastel, comprimentoPastel);
		Main.pasteis.add(pasteis);
	}

	public static void visualizarPastel() {
		for (int i = 0; i < Main.pasteis.size(); i++) {
			System.out.print(i + "º - ");
			System.out.println(Main.pasteis.get(i));
			System.out.println("___________________________________");
		}
	}

	public static void editarPastel(int i, ArrayList<Pastel> pasteis) {

		System.out.println("Digite o nome do Pastel: " + i + "º");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o Preço do pastel: " + i + "º");
		float precoProduto = Main.sc.nextFloat();
		Main.sc.nextLine();

		System.out.println("Digite o id do pastel: " + i + "º");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite o sabor do pastel: " + i + "º");
		String saborPastel = Main.sc.nextLine();

		System.out.println("Digite o comprimento do pastel: " + i + "º");
		String comprimentoPastel = Main.sc.nextLine();

		Pastel pastel = new Pastel(nomeProduto, precoProduto, idProduto, saborPastel, comprimentoPastel);
		pasteis.set(i, pastel);
		System.out.println("Pastel editado\n");
		
	}
	
	public static void deletarPastel(int i, ArrayList<Pastel> pasteis) {
		pasteis.remove(i);
		System.out.println("Pastel totalmente removido\n");
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
				+ "\nnomeProduto = " + nomeProduto + "\nprecoProduto = " + precoProduto + "\nidProduto = " + idProduto
				+ "]";
	}

}