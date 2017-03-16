package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, String bairro, String cep,
			String numero, String complemento, String cidade, String estado) {

		this.setLogradouro(logradouro);
		this.setBairro(bairro);
		this.setCep(cep);
		this.setNumero(numero);
		this.setComplemento(complemento);
		this.setCidade(cidade);
		this.setEstado(estado);

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

	public boolean equals(Object o) {
		boolean igual = false;

		if (o instanceof Endereco) {
			if (((Endereco) o).getCep().equals(this.getCep())
					&& ((Endereco) o).getNumero().equals(this.getNumero()))
				igual = true;
		}
		return igual;
	}

	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro
				+ ", cep=" + cep + ", numero=" + numero + ", complemento="
				+ complemento + ", cidade=" + cidade + ", estado=" + estado
				+ "]";
	}

}
