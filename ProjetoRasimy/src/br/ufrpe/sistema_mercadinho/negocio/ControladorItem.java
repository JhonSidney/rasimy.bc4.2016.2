package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioItem;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class ControladorItem {

	private RepositorioItem repositorioItem;

	public ControladorItem() {
		this.repositorioItem = RepositorioItem.getInstance();
	}

	public void cadastrar(Item item) {
		if (item != null && !this.existe(item.getCodigoProduto())) {
			this.repositorioItem.cadastrar(item);
		}
	}

	public void atualizar(Item item) {
		if (item != null && !this.existe(item.getCodigoProduto())) {
			this.repositorioItem.atualizar(item);
		}
	}

	public Item procurar(String codigoProduto) {
		return this.repositorioItem.procurar(codigoProduto);
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

	public void remover(String codigoProduto) {
		Item item = this.repositorioItem.procurar(codigoProduto);

		if (item != null) {
			this.repositorioItem.remover(codigoProduto);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}