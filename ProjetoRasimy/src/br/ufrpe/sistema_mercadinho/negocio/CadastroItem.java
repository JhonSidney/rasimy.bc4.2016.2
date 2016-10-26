package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;



public class CadastroItem {

	private RepositorioItem repositorioItem;
	
	public CadastroItem(){
		this.repositorioItem = new RepositorioItem(1000);//array do repositório compra
	}

	public void cadastrarItem(Item item){
		if(item != null && !this.existeItem(item.getCodigoProduto())){
			this.repositorioItem.cadastrar(item);
		}
	}

	public void atualizarItem(Item item){
		if(item != null && !this.existeItem(item.getCodigoProduto())){
			this.repositorioItem.atualizar(item);
		}
	}

	public Item procurarItem(String codigoProduto){
		return this.repositorioItem.procurar(codigoProduto);
	}
	
	public void listarItem(){
		 this.repositorioItem.listar();
	}

	
	public boolean existeItem(String codigoProduto){
		return this.repositorioItem.existe(codigoProduto);
	}

	
	public void descadastrarItem (String codigoProduto){
		Item item = this.repositorioItem.procurar(codigoProduto);

		if (item != null) {
			this.repositorioItem.remover(codigoProduto);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}