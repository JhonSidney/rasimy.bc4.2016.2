package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;



public class CadastroItem {

	private RepositorioItem repositorioitem;
	 
	 public CadastroItem(){
	  
	  this.repositorioitem = new RepositorioItem(10000);//array do repositório item
	 }

	 public void cadastrar(Item item){
	  if(item == null && this.equals(item.getCodigoProduto())&& this.equals(item.getNome())){
		  this.repositorioitem.cadastrar(item);
	   
	  }
	 }
	
public Item procurar(String codigoProduto){
	return this.repositorioitem.procurar(codigoProduto);
}
public boolean equals(String nome){
	return this.repositorioitem.equals(nome);
}


}
