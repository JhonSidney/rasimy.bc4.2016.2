package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class RepositorioVenda implements IRepositorioVenda{

	private Venda[] vendas;
	private int qtdVendas;


	public RepositorioVenda(int tamanho){
		this.vendas = new Venda[tamanho];
		this.qtdVendas = 0; 
		
	}

	public Venda[] getVendas(){
		return this.vendas;
	}


	public int getQtdVendas(){
		return this.qtdVendas;
	}


	public void cadastrar(Venda venda){
		this.vendas[qtdVendas] = venda;
		this.qtdVendas++;
		if(this.qtdVendas ==  this.vendas.length){
			this.duplicaArrayVendas();
		}
	}


	public void atualizar(Venda venda){
		int indice = this.procurarIndice(venda.getCodigoVenda());
		if(indice != qtdVendas){
			this.vendas[indice] = venda;
		}else{
			//
		}
	}


	public Venda procurar(String codigoVenda){
		int indice = this.procurarIndice(codigoVenda);
		Venda resultado = null;
		if(indice != this.qtdVendas){
			resultado = this.vendas[indice];
		}
		return resultado;
	}

	public void listar(){
		for(int i=0; i< this.qtdVendas;i++){
			System.out.println(""+vendas[i]);
		}
	}
	
	
	
	public void remover(String codigoVenda){
		
		int indice = this.procurarIndice(codigoVenda);
		if(indice != this.qtdVendas){
			this.vendas[indice] = this.vendas[this.qtdVendas - 1];
			this.vendas[this.qtdVendas - 1] = null;
			this.qtdVendas = this.qtdVendas - 1;
		}else{
			//
		}

	}


	private int procurarIndice(String codigoVenda) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdVendas)) {
			if (codigoVenda.equals(this.vendas[indice].getCodigoVenda())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayVendas() {

		if (this.vendas != null && this.vendas.length > 0) {
			Venda[] arrayDuplicado = new Venda[this.vendas.length * 2];

			for (int i = 0; i < this.vendas.length; i++) {
				arrayDuplicado[i] = this.vendas[i];
			}
			this.vendas = arrayDuplicado;
		}

	}

	
	public boolean existe(String codigoProduto){
		boolean existe = false;
		int indice = this.procurarIndice(codigoProduto);
		if(indice != this.qtdVendas){
			existe = true;
		}
		return existe;
	}
}