

package dados;

import negocios.Produto;


public class RepositorioProduto {

	private Produto[] produtos;
	private int quantidadeProdutos;
	
	//construtor 
	public RepositorioProduto (int banco_produto){
		this.produtos = new Produto[banco_produto];// recebendo o tamanho do meu array de produtos
		this.quantidadeProdutos = 0;
	}

	//metodos Gets
	public Produto[] getProdutos() {
		return this.produtos;
	}

	public int getQuantidadeProduto(){
		return this.quantidadeProdutos;
	}
	
	//metodo Inserir 
	
	public boolean inserir(Produto prod){
		boolean igual = false;
		 if(prod != null){
			 if(this.quantidadeProdutos != this.produtos.length){
				 for(int i=0; i< this.quantidadeProdutos;i++){
					 if(produtos[i].getId() == prod.getId()){
						 return igual;
					 }
					 
					 this.produtos[quantidadeProdutos] = prod;
					 this.quantidadeProdutos++;
					 igual = true;
					 return igual;
					 
					 
				 }
			 }
		 }
		
		return igual;
	}

	
	public Produto buscar(int id){
		
		if( id >= 0 ){
			for(int i=0; i< this.quantidadeProdutos ;i++){
				if(produtos[i] != null){
					if(produtos[i].getId() == id){
						return produtos[i];
					}
				}
			}
		}
		return null;
	}

	
	public boolean remove(int id){
		boolean igual = false;
		
		if( id >= 0 ){
			for(int i=0; i< this.quantidadeProdutos ;i++){
				if(produtos[i] != null){
					if(produtos[i].getId() == id){
						this.produtos[i] = null;
						this.produtos [i]=  produtos[quantidadeProdutos];
						this.produtos[quantidadeProdutos]= null;
						quantidadeProdutos--;
						return true;
					}
				}
			}
		}
		return igual;
	}
	
	
}