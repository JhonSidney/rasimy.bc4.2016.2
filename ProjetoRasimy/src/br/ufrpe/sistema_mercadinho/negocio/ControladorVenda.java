package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioVenda;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class ControladorVenda {

	private RepositorioVenda repositorioVenda;

	public ControladorVenda() {
		this.repositorioVenda = RepositorioVenda.getInstance();
	}

	public void cadastrar(Venda venda) {
		if (venda != null && !this.existe(venda.getCodigoVenda())) {
			this.repositorioVenda.cadastrar(venda);
		}
	}

	public void atualizar(Venda venda) {
		if (venda != null && !this.existe(venda.getCodigoVenda())) {
			this.repositorioVenda.atualizar(venda);
		}
	}

	public Venda procurar(String codigoVenda) {
		return this.repositorioVenda.procurar(codigoVenda);
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

	public void remover(String codigoVenda) {
		Venda item = this.repositorioVenda.procurar(codigoVenda);

		if (item != null) {
			this.repositorioVenda.remover(codigoVenda);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}