package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public interface IRepositorioCompra {

	public boolean cadastrar(Compra compra);

	public boolean atualizar(Compra compra);

	public Compra procurar(String codigoPedido);

	public ArrayList<Compra> listar();

	public boolean remover(String codigoPedido);

}


