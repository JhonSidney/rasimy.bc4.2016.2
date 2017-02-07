package br.ufrpe.sistema_mercadinho.negocio.beans;


public interface ICompra {

	public String getCodigoPedido();
	public void setCodigoPedido(String codigoPedido);
	
	public String  getSerie();
	public void setSerie(String serie);
	
	
	public String getDataPedido();
	public void setDataPedido(String dataPedido);
	
	public Fornecedor getFornecedor();
	public void setFornecedor(Fornecedor fornecedor);
	
	public String getTipoPagamento();
	public void  setTipoPagamento(String tipoPagamento);
	
	public int getQuantidade();
	public void setQuantidade(int quantidade);
	
	public Item  getItem();
	public void setItem(Item item);
	
	
	
	
	
}
