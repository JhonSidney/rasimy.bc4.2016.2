package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class RepositorioItem {

	private Item[] item;
	private int quantidadeItem;
		
	public RepositorioItem (int tamanho){
		this.item = new Item[tamanho];
		this.quantidadeItem = 0;
	}
	
	public Item[] getItem() {
		return this.item;
	}

	public int getQuantidadeItem(){
		return this.quantidadeItem;
	}
			
}