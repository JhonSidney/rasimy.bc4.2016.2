package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public interface IRepositorioItem {

	public boolean cadastrar(Item item);

	public boolean atualizar(Item item);

	public Item procurar(String codigoProduto);

	public ArrayList<Item> listar();

	public boolean remover(String codigoProduto);

	
	
}
