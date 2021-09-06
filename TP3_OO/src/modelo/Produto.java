package modelo;

public abstract class Produto {
	protected String nomeProduto;
	protected int precoProduto;
	protected int idProduto;
	
	
	public Produto() {
		super();
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public int getPrecoProduto() {
		return precoProduto;
	}


	public void setPrecoProduto(int precoProduto) {
		this.precoProduto = precoProduto;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
}
