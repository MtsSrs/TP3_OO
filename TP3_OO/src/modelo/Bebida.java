package modelo;

import java.util.ArrayList;

import test_application.Main;

public class Bebida extends Produto {
	private String tipoBebida;
	private String volumeBebida;

	public Bebida(String nomeProduto, float precoProduto, int idProduto, String descricaoProduto, String caloriaProduto,
			String tipoBebida, String volumeBebida) {
		super(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto);
		this.tipoBebida = tipoBebida;
		this.volumeBebida = volumeBebida;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public String getVolumeBebida() {
		return volumeBebida;
	}

	public void setVolumeBebida(String volumeBebida) {
		this.volumeBebida = volumeBebida;
	}

	public static void cadastrarBebida() {
		System.out.println("Digite o número de bebidas que serão cadastadas");
		int size = Main.sc.nextInt();
		Main.sc.nextLine();
		for (int i = 0; i < size; i++) {
		System.out.println("Digite o nome da bebida: " + i + "º");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o preço da bebida: " + i + "º");
		float precoProduto = Main.sc.nextFloat();

		System.out.println("Digite o ID da bebida: " + i + "º");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite a descrição da bebida: " + i + "º");
		String descricaoProduto = Main.sc.nextLine();

		System.out.println("Digite as calorias da bebida: " + i + "º");
		String caloriaProduto = Main.sc.nextLine();

		System.out.println("Digite o tipo da bebida: " + i + "º");
		String tipoBebida = Main.sc.nextLine();

		System.out.println("Digite o volume da bebida: " + i + "º");
		String volumeBebida = Main.sc.nextLine();
		
		System.out.println("Digite a quantidade em estoque da bebida: " + i );
		int estoqueBebida = Main.sc.nextInt();
		Main.sc.nextLine();
		
		Bebida bebida = new Bebida(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto, tipoBebida,
				volumeBebida);
		Main.estoque_bebida.add(estoqueBebida);
		Main.bebidas.add(bebida);
		}
	}

	public static void visualizarBebidas() {
		for (int i = 0; i < Main.bebidas.size(); i++) {
			System.out.print(i + "º - ");
			System.out.println(Main.bebidas.get(i));
			System.out.println("__");
		}
	}
	
	public static void visualizarNomeBebidaId() {
		for (int i = 0; i < Main.bebidas.size(); i++) {
			System.out.print(i + " - ");
			System.out.println(Main.bebidas.get(i).getNomeProduto());
			System.out.println("___________________________________");
		}
	}

	public static void editarBebida(ArrayList<Bebida> bebidas) {
		System.out.println("Digite o número da bebida desejada");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		while (i > bebidas.size()) {
			System.out.println("Não temos tantas bebidas(ainda)\nDigite um novo número");
			i = Main.sc.nextInt();
			Main.sc.nextLine();
		}

		System.out.println("Digite o nome da bebida: " + i + "º");
		String nomeProduto = Main.sc.nextLine();

		System.out.println("Digite o preço da bebida: " + i + "º");
		float precoProduto = Main.sc.nextFloat();

		System.out.println("Digite o ID da bebida: " + i + "º");
		int idProduto = Main.sc.nextInt();
		Main.sc.nextLine();

		System.out.println("Digite a descrição da bebida: " + i + "º");
		String descricaoProduto = Main.sc.nextLine();

		System.out.println("Digite as calorias da bebida: " + i + "º");
		String caloriaProduto = Main.sc.nextLine();

		System.out.println("Digite o tipo da bebida: " + i + "º");
		String tipoBebida = Main.sc.nextLine();

		System.out.println("Digite o volume da bebida: " + i + "º");
		String volumeBebida = Main.sc.nextLine();
		
		System.out.println("Digite a quantidade em estoque da bebida: " + i );
		int estoqueBebida = Main.sc.nextInt();
		Main.sc.nextLine();

		Bebida bebida = new Bebida(nomeProduto, precoProduto, idProduto, descricaoProduto, caloriaProduto, tipoBebida,
				volumeBebida);
		
		bebidas.set(i, bebida);
		Main.estoque_bebida.set(i, estoqueBebida);
		System.out.println("Bebida editada\n");
	}

	public static void deletarBebida(ArrayList<Bebida> bebidas) {
		System.out.println("Digite o número da bebida desejada");
		int i = Main.sc.nextInt();
		Main.sc.nextLine();
		
		bebidas.remove(i);
		Main.estoque_bebida.remove(i);
		System.out.println("Bebida totalmente removida\n");
	}

	@Override
	public String toString() {
		return "Bebida [\nNome = " + nomeProduto + "\nPreço = " + precoProduto + "\nID = " + +idProduto
				+ "\nDescrição = " + descricaoProduto + "\nCalorias = " + caloriaProduto + "\nTipo = " + tipoBebida
				+ "\nVolume = " + volumeBebida + "ml\n]";
	}

}
