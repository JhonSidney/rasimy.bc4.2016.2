package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Fornecedor {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private Endereco endereco;

	public Fornecedor(String id, String nomeFantasia, String razaoSocial,
			String cnpj, String inscricaoEstadual, Endereco endereco) {
		this.setNomeFantasia(nomeFantasia);
		this.setRazaoSocial(razaoSocial);
		this.setCnpj(cnpj);
		this.setInscricaoEstadual(inscricaoEstadual);
		this.setEndereco(endereco);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean equals(Object o) {
		boolean igual = false;
		if (o instanceof Fornecedor) {
			if (((Fornecedor) o).getCnpj().equals(this.getCnpj())) {
				igual = true;
			}
		}
		return igual;
	}

	public String toString() {
		return "Fornecedor [ nomeFantasia=" + nomeFantasia + ", razaoSocial="
				+ razaoSocial + ", cnpj=" + cnpj + ", inscricaoEstadual="
				+ inscricaoEstadual + "]";
	}

}
