package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public interface IRepositorioCompra {

	
	public  void cadastrar(Compra compra);
	
	public  void atualizar(Compra compra);
	
	public Compra procurar(String codigoPedido);
	
	public void listar();
	
	public void remover(String codigoPedido);
	
	
}
