package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public interface IRepositorioFuncionario {
	
	
	public void cadastrar(Funcionario funcionario);

	public void atualizar(Funcionario funcionario);

	public Funcionario procurar(String id);

	public void listar();

	public void remover(String id);
	

}
