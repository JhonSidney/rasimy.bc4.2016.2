package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;



public class CadastroFornecedor {

	private RepositorioFornecedor repositorioFornecedor;

	public CadastroFornecedor(){
		this.repositorioFornecedor = new RepositorioFornecedor(1000);//tamanho array do repositório adm
	}

	public void cadastrarFornecedor(Fornecedor fornecedor){
		if(fornecedor != null && !this.existeFornecedor(fornecedor.getId())){
			this.repositorioFornecedor.cadastrar(fornecedor);
		}else{
			//interface com usuario;
		}
	}

	public void atualizarFornecedor(Fornecedor fornecedor){
		if(fornecedor != null && !this.existeFornecedor(fornecedor.getId())){
			this.repositorioFornecedor.atualizar(fornecedor);
		}
	}

	public Fornecedor procurarFornecedor(String id){
		return this.repositorioFornecedor.procurar(id);
	}
	
	public void listarFornecedor(){
		this.repositorioFornecedor.listar();
	}

	public boolean existeFornecedor(String id){
		return this.repositorioFornecedor.existe(id);
	}

	public void descadastrarFornecedor(String id){
		Fornecedor fornecedor = this.repositorioFornecedor.procurar(id);

		if (fornecedor != null) {
			this.repositorioFornecedor.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}


}