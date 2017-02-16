package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public class RepositorioFornecedor implements IRepositorioFornecedor {

	private ArrayList<Fornecedor> fornecedores;
	public static RepositorioFornecedor instancia;

	private RepositorioFornecedor() {
		this.fornecedores = new ArrayList<Fornecedor>();

	}

	public static RepositorioFornecedor getInstance() {

		if (instancia == null) {
			instancia = new RepositorioFornecedor();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
		return true;
	}

	@Override
	public boolean atualizar(Fornecedor fornecedor) {
		int i = 0;
		for (Fornecedor f : this.fornecedores) {
			i++;
			if (f.getCnpj().equals(fornecedor.getCnpj())) {
				this.fornecedores.add(i, fornecedor);
				return true;
			}

		}
		return false;
	}

	@Override
	public Fornecedor procurar(String cnpj) {

		for (Fornecedor f : this.fornecedores) {
			if (f.getCnpj().equals(cnpj)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		return this.fornecedores;
	}

	@Override
	public boolean remover(String cnpj) {

		int i = 0;
		for (Fornecedor f : this.fornecedores) {
			i++;
			if (f.getCnpj().equals(cnpj)) {
				this.fornecedores.remove(i);
				return true;
			}
		}

		return false;
	}

}