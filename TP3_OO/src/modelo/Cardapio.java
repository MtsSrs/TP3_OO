package modelo;

public class Cardapio {
	
	private Pastel pastelCardapio;
	private Bebida bebidaCardapio;
	private boolean disponibilidade;
	private String descricao;
	
	
	
	
	public Pastel getPastelCardapio() {
		return pastelCardapio;
	}
	public void setPastelCardapio(Pastel pastelCardapio) {
		this.pastelCardapio = pastelCardapio;
	}
	public Bebida getBebidaCardapio() {
		return bebidaCardapio;
	}
	public void setBebidaCardapio(Bebida bebidaCardapio) {
		this.bebidaCardapio = bebidaCardapio;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
