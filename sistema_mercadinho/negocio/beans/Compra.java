package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Compra {

	private String codigoPedido;
	private String serie;
	private String dataPedido;
	private Fornecedor fornecedor;
	private String tipoPagamento;
	private int quantidade;
	private Item item;

	public Compra(String codigoPedido, String serie, String dataPedido,
			Fornecedor fornecedor, String tipoPagamento, int quantidade,
			Item item) {

		this.setCodigoPedido(codigoPedido);
		this.setSerie(serie);
		this.setDataPedido(dataPedido);
		this.setFornecedor(fornecedor);
		this.setTipoPagamento(tipoPagamento);
		this.setQuantidade(quantidade);
		this.setItem(item);

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

	public boolean equals(Object o) {
		boolean igual = false;

		if (o instanceof Compra) {
			if (((Compra) o).getCodigoPedido().equals(this.getCodigoPedido())) {
				igual = true;
			}
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
