package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class ControladorItem {

	private RepositorioItem repositorioItem;

	public ControladorItem() {
		this.repositorioItem = RepositorioItem.getInstance();
	}

	public void cadastrar(Item item) throws ErroDeNegocioException {
		if (item != null && !this.existe(item.getCodigoProduto())) {
			this.repositorioItem.cadastrar(item);
		} else {
			throw new ErroDeNegocioException("Produto Ja Existe !");
		}
	}

	public void atualizar(Item item) throws ErroDeNegocioException {
		if (item != null && !this.existe(item.getCodigoProduto())) {
			this.repositorioItem.atualizar(item);
		} else {
			throw new ErroDeNegocioException("Produto Não Existe !");
		}
	}

	public Item procurar(String codigoProduto) throws ErroDeNegocioException {
		Item resultado = this.repositorioItem.procurar(codigoProduto);
		if (resultado == null) {
			throw new ErroDeNegocioException("Produto Não Existe !");
		}
		return resultado;
	}

	public ArrayList<Item> listar() {
		return this.repositorioItem.listar();
	}

	private boolean existe(String codigoProduto) {
		ArrayList<Item> retorno = this.repositorioItem.listar();
		for (Item i : retorno) {
			if (i.getCodigoProduto().equals(codigoProduto)) {
				return true;
			}
		}
		return false;
	}

	public void remover(String codigoProduto) throws ErroDeNegocioException {
		Item item = this.repositorioItem.procurar(codigoProduto);
		if (item != null) {
			this.repositorioItem.remover(codigoProduto);
		} else {
			throw new ErroDeNegocioException("Produto Não Existe !");
		}
	}

}