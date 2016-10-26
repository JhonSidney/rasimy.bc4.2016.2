package br.ufrpe.sistema_mercadinho.negocio.beans;

public class Venda {
	private String codigoVenda;
	private Funcionario funcionario;
	private Item item;
	private double valorRecebido;
	private double valorCompra;
	private double desconto;
	private double troco;
	private double dataVenda;
	
	//construtor
	public Venda(String codigoVenda, Funcionario funcionario, Item item,
			double valorRecebido, double valorCompra, double desconto,
			double troco, double dataVenda) {
		
		this.codigoVenda = codigoVenda;
		this.funcionario = funcionario;
		this.item = item;
		this.valorRecebido = valorRecebido;
		this.valorCompra = valorCompra;
		this.desconto = desconto;
		this.troco = troco;
		this.dataVenda = dataVenda;
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
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
	public double getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(double dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	public boolean equals(Venda cupomFiscal){
		boolean igual = false;
		if(cupomFiscal != null && codigoVenda.equals(cupomFiscal.getCodigoVenda()) 
				&& this.dataVenda == cupomFiscal.getDataVenda()){
			return true; 
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
