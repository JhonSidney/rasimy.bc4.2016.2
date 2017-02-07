package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public class RepositorioFornecedor implements IRepositorioFornecedor {

	private Fornecedor[] fornecedores;
	private int qtdFornecedores;


	public RepositorioFornecedor(int tamanho){
		this.fornecedores = new Fornecedor[tamanho];
		this.qtdFornecedores = 0; 

	}

	public Fornecedor[] getFornecedores() {
		return this.fornecedores;
	}

	public int getQtdFornecedores() {
		return this.qtdFornecedores;
	}

	public void cadastrar(Fornecedor fornecedor){
		this.fornecedores[qtdFornecedores] = fornecedor;
		this.qtdFornecedores++;
		if(this.qtdFornecedores ==  this.fornecedores.length){
			this.duplicaArrayFornecedores();
		}
	}


	public void atualizar(Fornecedor fornecedor){
		int indice = this.procurarIndice(fornecedor.getId());
		if(indice != qtdFornecedores){
			this.fornecedores[indice] = fornecedor;
		}else{
			//
		}
	}


	public Fornecedor procurar(String id){
		int indice = this.procurarIndice(id);
		Fornecedor resultado = null;
		if(indice != this.qtdFornecedores){
			resultado = this.fornecedores[indice];
		}
		return resultado;
	}

	public void listar(){
		for(int i=0; i< this.qtdFornecedores;i++){
			System.out.println(""+fornecedores[i]);
		}
	}

	public void remover(String id){
		
		int indice = this.procurarIndice(id);
		if(indice != this.qtdFornecedores){
			this.fornecedores[indice] = this.fornecedores[this.qtdFornecedores - 1];
			this.fornecedores[this.qtdFornecedores - 1] = null;
			this.qtdFornecedores = this.qtdFornecedores - 1;
		}else{
			//
		}

	}


	private int procurarIndice(String id) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdFornecedores)) {
			if (id.equals(this.fornecedores[indice].getId())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayFornecedores() {

		if (this.fornecedores != null && this.fornecedores.length > 0) {
			Fornecedor[] arrayDuplicado = new Fornecedor[this.fornecedores.length * 2];

			for (int i = 0; i < this.fornecedores.length; i++) {
				arrayDuplicado[i] = this.fornecedores[i];
			}
			this.fornecedores = arrayDuplicado;
		}

	}

	
	public boolean existe(String id){
		boolean existe = false;
		int indice = this.procurarIndice(id);
		if(indice != this.qtdFornecedores){
			existe = true;
		}
		return existe;
	}
}