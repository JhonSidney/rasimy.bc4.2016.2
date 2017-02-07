package br.ufrpe.sistema_mercadinho.negocio.beans;


public interface IFornecedor {
	
	public String getId();
	public void setId(String id);
	
	public String getCnpj();
	public void setCnpj(String cnpj);
	
	public String getInscricaoEstadual();
	public void setInscricaoEstadual(String inscricaoEstadual);
	
	public String getNomeFantasia();
	public void setNomeFantasia(String NomeFantasia);
	
	public String getRazaoSocial();
	public void setRazaoSocial(String razaoSocial);
	
	public Endereco getEndereco();
	public void setEndereco(Endereco endereco);
}
