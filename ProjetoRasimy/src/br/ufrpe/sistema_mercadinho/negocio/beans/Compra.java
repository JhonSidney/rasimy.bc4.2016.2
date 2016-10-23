package br.ufrpe.sistema_mercadinho.negocio.beans;
import java.util.Date;

public class Compra {

	private String codigoPedido;
	private String serie;
	private String dataPedido;
	private String tipoPagamento;
	private int quantidade;
	private Item item;
	
	//OBSERVAÇÃO VER O ARRAY DE ITEM CORRIGIR ESTAR ERRADO
	
	
	
	
	
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
	

}
