package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class CadastroFuncionario {

	private RepositorioFuncionario repositorioFuncionario;

	public CadastroFuncionario(){
		this.repositorioFuncionario = new RepositorioFuncionario(1000);//tamanho array do repositório Funcionario
	}

	public void cadastrar(Funcionario funcionario){
		if(funcionario != null && !this.equals(funcionario.getId())){
			this.repositorioFuncionario.cadastrar(funcionario);
		}else{
			//interface com usuario;
		}
	}

	public void atualizar(String id){
		Funcionario funcionario = this.repositorioFuncionario.procurar(id);
		if (funcionario != null) {
			this.repositorioFuncionario.atualizar(id);
		} else {
			// interface com usuario
		}
	}

	public Funcionario procurar(String id){
		return this.repositorioFuncionario.procurar(id);
	}
	public boolean existe(String id){
		return this.repositorioFuncionario.existe(id);
	}
	
	public void listar(){
		this.repositorioFuncionario.listar();
	}

	public void descadastrar (String id){
		Funcionario funcionario = this.repositorioFuncionario.procurar(id);

		if (funcionario != null) {
			this.repositorioFuncionario.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}
}
