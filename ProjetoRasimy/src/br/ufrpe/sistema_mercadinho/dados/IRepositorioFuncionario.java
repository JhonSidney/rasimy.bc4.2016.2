

package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public interface IRepositorioFuncionario {

	public boolean cadastrar(Funcionario funcionario);

	public boolean atualizar(Funcionario funcionario);

	public Funcionario procurar(String cpf);

	public ArrayList<Funcionario> listar();

	public boolean remover(String cpf);

}
