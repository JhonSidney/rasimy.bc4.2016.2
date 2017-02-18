package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public interface IRepositorioFornecedor {

	public boolean cadastrar(Fornecedor fornecedor);

	public boolean atualizar(Fornecedor fornecedor);

	public Fornecedor procurar(String cnpj);

	public ArrayList<Fornecedor> listar();

	public boolean remover(String cnpj);

}
