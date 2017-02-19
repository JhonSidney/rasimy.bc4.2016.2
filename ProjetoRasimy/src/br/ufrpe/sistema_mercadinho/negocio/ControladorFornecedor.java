package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public class ControladorFornecedor {

	private IRepositorioFornecedor repositorioFornecedor;

	public ControladorFornecedor() {
		this.repositorioFornecedor = RepositorioFornecedor.getInstance();
	}

	public void cadastrar(Fornecedor fornecedor) {
		if (fornecedor != null && !this.existe(fornecedor.getCnpj())) {
			this.repositorioFornecedor.cadastrar(fornecedor);
		} else {
			// interface com usuario;
		}
	}

	public void atualizar(Fornecedor fornecedor) {
		if (fornecedor != null && !this.existe(fornecedor.getCnpj())) {
			this.repositorioFornecedor.atualizar(fornecedor);
		}
	}

	public Fornecedor procurar(String cnpj) {
		return this.repositorioFornecedor.procurar(cnpj);
	}

	public ArrayList<Fornecedor> listar() {
		return this.repositorioFornecedor.listar();
	}

	private boolean existe(String cnpj) {
		ArrayList<Fornecedor> retorno = this.repositorioFornecedor.listar();
		for (Fornecedor f : retorno) {
			if (f.getCnpj().equals(cnpj)) {
				return true;
			}
		}
		return false;
	}

	public void remover(String cnpj) {
		Fornecedor fornecedor = this.repositorioFornecedor.procurar(cnpj);
		if (fornecedor != null) {
			this.repositorioFornecedor.remover(cnpj);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}