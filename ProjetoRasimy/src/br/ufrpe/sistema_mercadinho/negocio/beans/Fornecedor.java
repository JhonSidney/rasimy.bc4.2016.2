package br.ufrpe.sistema_mercadinho.negocio.beans;

import br.ufrpe.sistema_mercadinho.negocio.interfaces.IFornecedor;


public class Fornecedor implements IFornecedor {

	private String id;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private Endereco endereco;


	public Fornecedor(String id, String nomeFantasia, String razaoSocial, String cnpj,
			String inscricaoEstadual,Endereco endereco){
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public Endereco getEndereco(){
		return endereco;
	}
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	

	public boolean equals(Fornecedor fornecedor){
		boolean igual = false;
		if(fornecedor != null && this.id.equals(fornecedor.getId()) 
				&& this.nomeFantasia.equals(fornecedor.getNomeFantasia())
				&& this.razaoSocial.equals(fornecedor.getRazaoSocial()) 
				&& this.cnpj.equals(fornecedor.getCnpj()) 
				&& this.inscricaoEstadual.equals(fornecedor.getInscricaoEstadual()) ){
			return true;
		}
		return igual;
	}

	public boolean existe(Fornecedor fornecedor){
		boolean igual = false;
		if(fornecedor != null && this.cnpj.equals(fornecedor.getCnpj()) ){
			return true;
		}
		return igual;
	}


	
	public String toString() {
		return "Fornecedor [id=" + id + ", nomeFantasia=" + nomeFantasia
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj
				+ ", inscricaoEstadual=" + inscricaoEstadual + "]";
	}

}
