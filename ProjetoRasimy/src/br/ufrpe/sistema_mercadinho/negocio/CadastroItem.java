package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;



public class CadastroItem {

	private RepositorioItem repositorioItem;
	
	public CadastroItem(){
		this.repositorioItem = new RepositorioItem(1000);//array do repositório compra
	}

	public void cadastrar(Item item){
		if(item != null && !this.existe(item.getCodigoProduto())){
			this.repositorioItem.cadastrar(item);
		}
	}

	public void atualizar(Item item){
		if(item != null && !this.existe(item.getCodigoProduto())){
			this.repositorioItem.atualizar(item);
		}
	}

	public Item procurar(String codigoProduto){
		return this.repositorioItem.procurar(codigoProduto);
	}
	
	public void listar(){
		 this.repositorioItem.listar();
	}

	
	public boolean existe(String codigoProduto){
		return this.repositorioItem.existe(codigoProduto);
	}

	
	public void descadastrar (String codigoProduto){
		Item item = this.repositorioItem.procurar(codigoProduto);

		if (item != null) {
			this.repositorioItem.remover(codigoProduto);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}