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
	
	
	//construtor
	public Venda(String codigoVenda, Funcionario funcionario,String dataVenda
			,double valorCompra, double valorRecebido, double desconto,
			double troco, Item item) {
		
		this.codigoVenda = codigoVenda;
		this.funcionario = funcionario;
		this.dataVenda = dataVenda;
		this.valorCompra = valorCompra;
		this.valorRecebido = valorRecebido;
		this.desconto = desconto;
		this.troco = troco;
		this.item = item;
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
