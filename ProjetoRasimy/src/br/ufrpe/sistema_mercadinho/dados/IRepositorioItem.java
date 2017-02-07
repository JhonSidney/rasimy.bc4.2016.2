package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public interface IRepositorioItem {


	public void cadastrar(Item item);

	public void atualizar(Item item);

	public Item procurar(String codigoProduto);
	
	public void listar();
	
	public void remover(String codigoProduto);
	
	
}
