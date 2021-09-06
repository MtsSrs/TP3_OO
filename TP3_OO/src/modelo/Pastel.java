package modelo;

public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;
	
	public Pastel(String nome, int preco, int id, String sabor, String comprimento){
		nomeProduto = nome;
		precoProduto = preco;
		idProduto = id;
		saborPastel = sabor;
		comprimentoPastel = comprimento;
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

}
