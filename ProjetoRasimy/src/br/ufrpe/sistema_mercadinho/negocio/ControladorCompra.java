package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioCompra;
import br.ufrpe.sistema_mercadinho.dados.RepositorioCompra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public class ControladorCompra {

	private IRepositorioCompra repositorioCompra;

	public ControladorCompra() {
		this.repositorioCompra = RepositorioCompra.getInstance();
	}

	public void cadastrar(Compra compra) {
		if (compra != null && !this.existe(compra.getCodigoPedido())) {
			this.repositorioCompra.cadastrar(compra);
		}
	}

	public void atualizar(Compra compra) {
		if (compra != null && this.existe(compra.getCodigoPedido())) {
			this.repositorioCompra.atualizar(compra);
		}
	}

	public Compra procurarCompra(String codigoPedido) {
		return this.repositorioCompra.procurar(codigoPedido);
	}

	public ArrayList<Compra> listar() {
		return this.repositorioCompra.listar();
	}

	private boolean existe(String codigoPedido) {
		ArrayList<Compra> retorno = this.repositorioCompra.listar();
		for (Compra c : retorno) {
			if (c.getCodigoPedido().equals(codigoPedido)) {
				return true;
			}
		}
		return false;
	}

	public void remover(String codigoPedido) {
		Compra compra = this.repositorioCompra.procurar(codigoPedido);
		if (compra != null) {
			this.repositorioCompra.remover(codigoPedido);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}