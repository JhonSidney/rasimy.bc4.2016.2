package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioVenda;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class ControladorVenda {

	private RepositorioVenda repositorioVenda;

	public ControladorVenda() {
		this.repositorioVenda = RepositorioVenda.getInstance();
	}

	public void cadastrar(Venda venda) throws VendaJaExisteException {
		if (venda != null && !this.existe(venda.getCodigoVenda())) {
			this.repositorioVenda.cadastrar(venda);
		} else {
			throw new VendaJaExisteException();
		}
	}

	public void atualizar(Venda venda) throws VendaNaoExisteException {
		if (venda != null && !this.existe(venda.getCodigoVenda())) {
			this.repositorioVenda.atualizar(venda);
		} else {
			throw new VendaNaoExisteException();
		}
	}

	public Venda procurar(String codigoVenda) throws VendaNaoExisteException {
		Venda resultado = this.repositorioVenda.procurar(codigoVenda);
		if (resultado == null) {
			throw new VendaNaoExisteException();
		}
		return resultado;
	}

	public ArrayList<Venda> listar() {
		return this.repositorioVenda.listar();
	}

	private boolean existe(String codigoVenda) {
		boolean resultado = false;
		ArrayList<Venda> retorno = this.repositorioVenda.listar();
		for (Venda v : retorno) {
			if (v.getCodigoVenda().equals(codigoVenda)) {
				resultado = true;
			}
		}
		return resultado;
	}

	public void remover(String codigoVenda) throws VendaNaoExisteException {
		Venda item = this.repositorioVenda.procurar(codigoVenda);

		if (item != null) {
			this.repositorioVenda.remover(codigoVenda);
		} else {
			throw new VendaNaoExisteException();
		}
	}

}