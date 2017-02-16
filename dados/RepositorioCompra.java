
package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public class RepositorioCompra implements IRepositorioCompra {

	private ArrayList<Compra> compras;
	public static RepositorioCompra instancia;

	private RepositorioCompra() {
		this.compras = new ArrayList<Compra>();

	}

	public static RepositorioCompra getInstance() {

		if (instancia == null) {
			instancia = new RepositorioCompra();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Compra compra) {
		this.compras.add(compra);
		return true;
	}

	@Override
	public boolean atualizar(Compra compra) {
		int i = 0;
		for (Compra c : this.compras) {
			i++;
			if (c.getCodigoPedido().equals(compra.getCodigoPedido())) {
				this.compras.add(i, compra);
				return true;
			}
		}
		return false;
	}

	@Override
	public Compra procurar(String codigoPedido) {

		for (Compra c : this.compras) {

			if (c.getCodigoPedido().equals(codigoPedido)) {
				return c;
			}

		}

		return null;
	}

	@Override
	public ArrayList<Compra> listar() {
		return this.compras;
	}

	@Override
	public boolean remover(String codigoPedido) {

		int i = 0;
		for (Compra c : this.compras) {
			i++;
			if (c.getCodigoPedido().equals(codigoPedido)) {
				this.compras.remove(i);
				return true;
			}

		}

		return false;
	}

}