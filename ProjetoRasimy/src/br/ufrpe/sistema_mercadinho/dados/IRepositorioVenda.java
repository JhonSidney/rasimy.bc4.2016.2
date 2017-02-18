package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public interface IRepositorioVenda {

	public boolean cadastrar(Venda venda);

	public boolean atualizar(Venda venda);

	public Venda procurar(String codigoVenda);

	public ArrayList<Venda> listar();

	public boolean remover(String codigoVenda);

}
