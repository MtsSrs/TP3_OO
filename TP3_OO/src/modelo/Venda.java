package modelo;

public class Venda {

	private int idVenda;
	private Cliente clienteVenda;
	private float precoVenda;
	
	public int getIdVenda() {
		return idVenda;
	}
	
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	
	public Cliente getClienteVenda() {
		return clienteVenda;
	}
	
	public void setClienteVenda(Cliente clienteVenda) {
		this.clienteVenda = clienteVenda;
	}
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
}
