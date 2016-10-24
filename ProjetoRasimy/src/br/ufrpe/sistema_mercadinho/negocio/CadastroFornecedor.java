package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFornecedor;

public class CadastroFornecedor {

	private RepositorioFornecedor repositorioFornecedor;

	public CadastroFornecedor(){
		this.repositorioFornecedor = new RepositorioFornecedor(1000);//tamanho array do repositório Fornecedor
	}

	public void cadastrar(Fornecedor fornecedor){
		if(fornecedor != null && !this.equals(fornecedor.getCnpj())){
			this.repositorioFornecedor.cadastrar(fornecedor);
		}else{
			//interface com usuario;
		}
	}

	public void atualizar(String id){
		Fornecedor fornecedor = this.repositorioFornecedor.procurar(id);
		if (fornecedor != null) {
			this.repositorioFornecedor.atualizar(id);
		} else {
			// interface com usuario
		}
	}

	public Fornecedor procurar(String id){
		return this.repositorioFornecedor.procurar(id);
	}
	public boolean existe(String id){
		return this.repositorioFornecedor.existe(id);
	}
	
	public void listar(){
		this.repositorioFornecedor.listar();
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
