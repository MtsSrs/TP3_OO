package modelo;

public class Pastel extends Produto {
	private String saborPastel;
	private String comprimentoPastel;
	
	public Pastel(String nomeProduto, int precoProduto, int idProduto, String saborPastel, String comprimentoPastel) {
        super(nomeProduto, precoProduto, idProduto);
        this.saborPastel = saborPastel;
        this.comprimentoPastel = comprimentoPastel;
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
