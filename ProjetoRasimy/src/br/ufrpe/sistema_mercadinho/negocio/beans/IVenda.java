package br.ufrpe.sistema_mercadinho.negocio.beans;


public interface IVenda {
	
	public String getCodigoVenda();
	public void setCodigoVenda(String codigoVenda);
	
	public Funcionario getFuncionario();
	public void setFuncionario(Funcionario funcionario);
	
	public String getDataVenda();
	public void setDataVenda(String dataVenda);
	
	public double getValorCompra();
	public void setValorCompra(double valorCompra);
	
	public double getValorRecebido();
	public void setValorRecebido(double valorRecebido);
	
	public double getDesconto();
	public void setDesconto(double Desconto);
	
	public double getTroco();
	public void setTroco(double troco );
	
	public Item getItem();
	public void setItem(Item item);
	

}
