package modelo;

public abstract class Produto {
	protected String nomeProduto;
	protected float precoProduto;
	protected int idProduto;
	
	
	public Produto(String nomeProduto, float precoProduto, int idProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.idProduto = idProduto;
    }

	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public float getPrecoProduto() {
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
