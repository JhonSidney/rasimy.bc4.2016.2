package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class RepositorioVenda implements IRepositorioVenda {

	private ArrayList<Venda> vendas;
	public static RepositorioVenda instancia;

	private RepositorioVenda() {
		this.vendas = new ArrayList<Venda>();
	}

	public static RepositorioVenda getInstance() {

		if (instancia == null) {
			instancia = new RepositorioVenda();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Venda venda) {
		this.vendas.add(venda);
		return true;
	}

	@Override
	public boolean atualizar(Venda venda) {
		int i = 0;
		for (Venda v : this.vendas) {
			i++;
			if (v.getCodigoVenda().equals(venda.getCodigoVenda())) {
				this.vendas.add(i, venda);
				return true;
			}
		}
		return false;
	}

	@Override
	public Venda procurar(String codigoVenda) {
		for (Venda v : this.vendas) {
			if (v.getCodigoVenda().equals(codigoVenda)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Venda> listar() {
		return this.vendas;
	}

	@Override
	public boolean remover(String codigoVenda) {
		int i = 0;
		for (Venda v : this.vendas) {
			i++;
			if (v.getCodigoVenda().equals(codigoVenda)) {
				this.vendas.remove(i);
				return true;
			}
		}
		return false;
	}

}