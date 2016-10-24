package br.ufrpe.sistema_mercadinho.negocio.beans;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Fornecedor {
	
	private String id;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	
	
	public Fornecedor(String id, String nomeFantasia, String razaoSocial, String cnpj, String inscricaoEstadual){
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
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

	public boolean equals(Fornecedor fornecedor){
		boolean igual = false;
		if(fornecedor != null && this.id.equals(fornecedor.getId()) 
				&& this.nomeFantasia.equals(fornecedor.getNomeFantasia())
				&& this.razaoSocial.equals(fornecedor.getRazaoSocial()) 
				&& this.cnpj.equals(fornecedor.getCnpj()) 
				&& this.inscricaoEstadual.equals(fornecedor.getInscricaoEstadual()) ){
			return true;
		}
		return false;
	}
	
	public boolean existe(Fornecedor fornecedor){
		boolean igual = false;
		if(fornecedor != null && this.cnpj.equals(fornecedor.getCnpj()) ){
			return true;
		}
		return false;
	}

	
	public String toString() {
		return "Fornecedor [id=" + id + ", nomeFantasia=" + nomeFantasia
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj
				+ ", inscricaoEstadual=" + inscricaoEstadual + "]";
	}
	
	
	
	
}
