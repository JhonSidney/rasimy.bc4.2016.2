package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class RepositorioItem implements IRepositorioItem{

	private Item[] itens;
	private int qtdItens;


	public RepositorioItem(int tamanho){
		this.itens = new Item[tamanho];
		this.qtdItens = 0; 
		
	}

	public Item[] getItens(){
		return this.itens;
	}


	public int getQtdItens(){
		return this.qtdItens;
	}


	public void cadastrar(Item item){
		this.itens[qtdItens] = item;
		this.qtdItens++;
		if(this.qtdItens ==  this.itens.length){
			this.duplicaArrayItens();
		}
	}


	public void atualizar(Item item){
		int indice = this.procurarIndice(item.getCodigoProduto());
		if(indice != qtdItens){
			this.itens[indice] = item;
		}else{
			//
		}
	}


	public Item procurar(String codigoProduto){
		int indice = this.procurarIndice(codigoProduto);
		Item resultado = null;
		if(indice != this.qtdItens){
			resultado = this.itens[indice];
		}
		return resultado;
	}

	public void listar(){
		for(int i=0; i< this.qtdItens;i++){
			System.out.println(""+itens[i]);
		}
	}
	
	
	
	public void remover(String codigoProduto){
		
		int indice = this.procurarIndice(codigoProduto);
		if(indice != this.qtdItens){
			this.itens[indice] = this.itens[this.qtdItens - 1];
			this.itens[this.qtdItens - 1] = null;
			this.qtdItens = this.qtdItens - 1;
		}else{
			//
		}

	}


	private int procurarIndice(String codigoProduto) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdItens)) {
			if (codigoProduto.equals(this.itens[indice].getCodigoProduto())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayItens() {

		if (this.itens != null && this.itens.length > 0) {
			Item[] arrayDuplicado = new Item[this.itens.length * 2];

			for (int i = 0; i < this.itens.length; i++) {
				arrayDuplicado[i] = this.itens[i];
			}
			this.itens = arrayDuplicado;
		}

	}

	
	public boolean existe(String codigoProduto){
		boolean existe = false;
		int indice = this.procurarIndice(codigoProduto);
		if(indice != this.qtdItens){
			existe = true;
		}
		return existe;
	}
}