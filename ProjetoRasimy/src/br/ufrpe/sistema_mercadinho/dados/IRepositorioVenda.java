package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public interface IRepositorioVenda {
	
	
	public void cadastrar(Venda venda);

	public void atualizar(Venda venda);

	public Venda procurar(String codigoVenda);
	
	public void listar();
	
	public void remover(String codigoVenda);

}
