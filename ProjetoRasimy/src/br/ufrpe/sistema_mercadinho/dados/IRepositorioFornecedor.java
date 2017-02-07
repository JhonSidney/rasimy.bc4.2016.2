package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public interface IRepositorioFornecedor {

	public void cadastrar(Fornecedor fornecedor);

	public void atualizar(Fornecedor fornecedor);

	public Fornecedor procurar(String id);

	public void listar();

	public void remover(String id);
	
	
	
	
	
}
