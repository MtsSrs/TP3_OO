package modelo;

public class Cliente {

	private String nomeCliente;
	private String enderecoCliente;
	private String cpfCliente;
	private Telefone telefoneCliente; 
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Telefone getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(Telefone telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
}