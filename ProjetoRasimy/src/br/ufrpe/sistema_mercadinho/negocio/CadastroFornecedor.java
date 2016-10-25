package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;



public class CadastroFornecedor {

	private RepositorioFornecedor repositorioFornecedor;

	public CadastroFornecedor(){
		this.repositorioFornecedor = new RepositorioFornecedor(1000);//tamanho array do repositório adm
	}

	public void cadastrar(Fornecedor fornecedor){
		if(fornecedor != null && !this.existe(fornecedor.getId())){
			this.repositorioFornecedor.cadastrar(fornecedor);
		}else{
			//interface com usuario;
		}
	}

	public void atualizar(Fornecedor fornecedor){
		if(fornecedor != null && !this.existe(fornecedor.getId())){
			this.repositorioFornecedor.atualizar(fornecedor);
		}
	}

	public Fornecedor procurar(String id){
		return this.repositorioFornecedor.procurar(id);
	}
	
	public void listar(){
		this.repositorioFornecedor.listar();
	}

	public boolean existe(String id){
		return this.repositorioFornecedor.existe(id);
	}

	public void descadastrar (String id){
		Fornecedor fornecedor = this.repositorioFornecedor.procurar(id);

		if (fornecedor != null) {
			this.repositorioFornecedor.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}


}