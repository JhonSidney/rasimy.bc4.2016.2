package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Item {

	private String codigoProduto;
	private String nome;
	private int quantidade;
	private String descricao;
	private String categoria;
	private double precoCusto;
	private double precoVenda;
	private double pesoProduto;



	public Item(String codigoProduto, String nome, int quantidade,
			String descricao, String categoria, double precoCusto,
			double precoVenda, double pesoProduto) {

		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.categoria = categoria;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.pesoProduto = pesoProduto;
	}


	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getPesoProduto() {
		return pesoProduto;
	}
	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}


	public boolean equals(Item item){
		boolean igual = false;
		if(item != null && this.codigoProduto.equals(item.getCodigoProduto()) && this.nome.equals(item.getNome())
				&& this.descricao.equals(item.getDescricao()) && this.categoria.equals(item.getCategoria())
				&& this.precoVenda ==  item.precoVenda && this.pesoProduto == item.pesoProduto){
			return true;
		}
		return false;
	}

	public String toString() {
		return "Item [codigoProduto=" + codigoProduto + ", nome=" + nome
				+ ", quantidade=" + quantidade + ", descricao=" + descricao
				+ ", categoria=" + categoria + ", precoCusto=" + precoCusto
				+ ", precoVenda=" + precoVenda + ", pesoProduto=" + pesoProduto
				+ "]";
	}


	
	


}