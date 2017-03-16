package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Venda {
	private String codigoVenda;
	private Funcionario funcionario;
	private String dataVenda;
	private double valorCompra;
	private double valorRecebido;
	private double desconto;
	private double troco;
	private Item item;

	public Venda(String codigoVenda, Funcionario funcionario, String dataVenda,
			double valorCompra, double valorRecebido, double desconto,
			double troco, Item item) {

		this.setCodigoVenda(codigoVenda);
		this.setFuncionario(funcionario);
		this.setDataVenda(dataVenda);
		this.setValorCompra(valorCompra);
		this.setValorRecebido(valorRecebido);
		this.setDesconto(desconto);
		this.setTroco(troco);
		this.setItem(item);
	}

	public String getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean equals(Object o) {
		boolean igual = false;
		if (((Venda) o).getCodigoVenda().equals(this.codigoVenda)) {
			igual = true;
		}
		return igual;
	}

	public String toString() {
		return "Vendas [codigoVenda=" + codigoVenda + ", funcionario="
				+ funcionario + ", item=" + item + ", valorRecebido="
				+ valorRecebido + ", valorCompra=" + valorCompra
				+ ", desconto=" + desconto + ", troco=" + troco
				+ ", dataVenda=" + dataVenda + "]";
	}

}
