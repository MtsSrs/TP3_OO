package modelo;

public class Bebida extends Produto {
	private String tipoBebida;
	private String volumeBebida;
	
	public Bebida(String nome, int preco, int id, String tipo, String volume) {
		nomeProduto = nome;
		precoProduto = preco;
		idProduto = id;
		tipoBebida = tipo;
		volumeBebida = volume;
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
}
