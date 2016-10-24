package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String  estado;

	public Endereco(String logradouro, String bairro, String cep, String numero, String complemento, String cidade, String estado) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean equals(Endereco endereco){
		boolean igual = false;
		if( endereco != null && this.logradouro.equals(endereco.getLogradouro()) && this.bairro.equals(endereco.getBairro()) 
				&& this.cep.equals(endereco.getCep()) && this.numero.equals(endereco.getNumero()) && this.complemento.equals(endereco.getComplemento()) 
				&& this.cidade.equals(endereco.getCidade()) && this.estado.equals(endereco.getEstado())){
			return true;
		}
		return false;
	}

	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro
				+ ", cep=" + cep + ", numero=" + numero + ", complemento="
				+ complemento + ", cidade=" + cidade + ", estado=" + estado
				+ "]";
	}

	
}
