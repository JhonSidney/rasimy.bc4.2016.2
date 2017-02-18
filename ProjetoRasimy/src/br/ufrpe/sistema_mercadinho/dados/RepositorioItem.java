package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class RepositorioItem implements IRepositorioItem {

	// ATRIBUTOS
	private ArrayList<Item> itens;
	public static RepositorioItem instancia;

	private RepositorioItem() {
		this.itens = new ArrayList<Item>();

	}

	
	
	
	public static RepositorioItem getInstance() {

		if (instancia == null) {
			instancia = new RepositorioItem();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Item item) {
		this.itens.add(item);
		return true;
	}

	@Override
	public boolean atualizar(Item item) {

		int i = 0;
		for (Item a : this.itens) {
			i++;
			if (a.getCodigoProduto().equals(item.getCodigoProduto())) {
				this.itens.add(i, item);
				return true;
			}
		}
		return false;
	}

	@Override
	public Item procurar(String codigoProduto) {
		for (Item a : this.itens) {
			if (a.getCodigoProduto().equals(codigoProduto)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Item> listar() {
		return this.itens;
	}

	@Override
	public boolean remover(String codigoProduto) {
		int i = 0;
		for (Item a : this.itens) {
			i++;
			if (a.getCodigoProduto().equals(codigoProduto)) {
				this.itens.remove(i);
				return true;
			}
		}
		return false;
	}
}