package br.ufrpe.sistema_mercadinho.negocio.beans;

public interface IItem {
	
	
	public String getCodigoProduto();
	public void setCodigoProduto(String codigoProduto);
	
	public String getNome();
	public void setNome(String nome);
	
	public String getDescricao();
	public void setDescricao(String descricao);
	
	public String getCategoria();
	public void setCategoria(String categoria);
	
	public double getPrecoCusto();
	public void setPrecoCusto(double precoCusto);
	
	public double getPrecoVenda();
	public void setPrecoVenda(double precoVenda);
	
	public int getQuantidade();
	public void setQuantidade(int quantidade);
	
	
}
