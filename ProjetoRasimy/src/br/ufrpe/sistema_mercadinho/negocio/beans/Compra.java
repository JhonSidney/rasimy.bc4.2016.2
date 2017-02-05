package br.ufrpe.sistema_mercadinho.negocio.beans;

import br.ufrpe.sistema_mercadinho.negocio.interfaces.ICompra;


public class Compra implements ICompra {

	private String codigoPedido;
	private String serie;
	private String dataPedido;
	private Fornecedor fornecedor;
	private String tipoPagamento;
	private int quantidade;
	private Item item;
	
	
	
	public Compra(String codigoPedido, String serie, String dataPedido,
			 Fornecedor fornecedor,String tipoPagamento ,int quantidade ,
			Item item) {
	
		this.codigoPedido = codigoPedido;
		this.serie = serie;
		this.dataPedido = dataPedido;
		this.fornecedor = fornecedor;
		this.tipoPagamento = tipoPagamento;
		this.quantidade = quantidade;
		this.item = item;
	}
	
	
	public String getCodigoPedido() {
		return codigoPedido;
	}
	
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public String getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	


	public boolean equals(Compra compra){
		boolean igual = false;
		if(compra != null && codigoPedido.equals(compra.getCodigoPedido()) && serie.equals(compra.getSerie()) 
				&& dataPedido.equals(compra.getDataPedido()) && fornecedor.equals(compra.getFornecedor()) ){
			
			return true;
		}
		return igual;
	}


	public String toString() {
		return "Compra [codigoPedido=" + codigoPedido + ", serie=" + serie
				+ ", dataPedido=" + dataPedido + ", tipoPagamento="
				+ tipoPagamento + ", quantidade=" + quantidade
				+ ", fornecedor=" + fornecedor + ", item=" + item + "]";
	}







}
