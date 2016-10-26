package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;



public class CadastroFuncionario {

	private RepositorioFuncionario repositorioFuncionario;

	public CadastroFuncionario(){
		this.repositorioFuncionario = new RepositorioFuncionario(1000);//tamanho array do repositório adm
	}

	public void cadastrarFuncionario(Funcionario funcionario){
		if(funcionario != null && !this.existeFuncionario(funcionario.getId())){
			this.repositorioFuncionario.cadastrar(funcionario);
		}else{
			//interface com usuario;
		}
	}

	public void atualizarFuncionario(Funcionario funcionario){
		if(funcionario != null && !this.existeFuncionario(funcionario.getId())){
			this.repositorioFuncionario.atualizar(funcionario);
		}
	}

	public Funcionario procurarFuncionario(String id){
		return this.repositorioFuncionario.procurar(id);
	}
	
	public void listarFuncionario(){
		this.repositorioFuncionario.listar();
	}

	public boolean existeFuncionario(String id){
		return this.repositorioFuncionario.existe(id);
	}

	public void descadastrarFuncionario (String id){
		Funcionario funcionario = this.repositorioFuncionario.procurar(id);

		if (funcionario != null) {
			this.repositorioFuncionario.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}


}