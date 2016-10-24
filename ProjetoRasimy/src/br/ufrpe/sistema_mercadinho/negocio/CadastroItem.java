package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;



public class CadastroItem {

	private RepositorioItem repositorioItem;

	public CadastroItem(){
		this.repositorioItem = new RepositorioItem(10000);//tamanho do array do repositório item
	}

	public void cadastrar(Item item){
		if(item != null && !this.existe(item.getCodigoProduto())&& !this.existe(item.getNome())){
			this.repositorioItem.cadastrar(item);
		}else{
			//interface com usuario
		}
	}

	public Item procurar(String codigoProduto){
		return this.repositorioItem.procurar(codigoProduto);
	}

	public boolean existe(String nome){
		return this.repositorioItem.existe(nome);
	}

	public void atualizar(String codigoProduto){
		Item item = this.repositorioitem.procurar();

		if(item !=null){
			this.repositorioItem.atualizar(codigoProduto);
		}else{
			//interface com usuario
		}
	}

	public void listar(){
		this.repositorioItem.listar();
	}

	public void descadastrar(String codigoProduto){
		Item item = this.repositorioitem.procurar();

		if(item !=null){
			this.repositorioItem.remover(codigoProduto);
		}else{
			//interface com usuario
		}
	}
}
