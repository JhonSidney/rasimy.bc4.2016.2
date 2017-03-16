package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFornecedor;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public class ControladorFornecedor {

	private IRepositorioFornecedor repositorioFornecedor;

	public ControladorFornecedor() {
		this.repositorioFornecedor = RepositorioFornecedor.getInstance();
	}

	public void cadastrar(Fornecedor fornecedor) throws ErroDeNegocioException {
		if (fornecedor != null && !this.existe(fornecedor.getCnpj())) {
			this.repositorioFornecedor.cadastrar(fornecedor);
		} else {
			throw new ErroDeNegocioException("Fornecedor Ja Existe !");
		}
	}

	public void atualizar(Fornecedor fornecedor) throws ErroDeNegocioException {
		if (fornecedor != null && !this.existe(fornecedor.getCnpj())) {
			this.repositorioFornecedor.atualizar(fornecedor);
		} else {
			throw new ErroDeNegocioException("Fornecedor Não Existe !");
		}
	}

	public Fornecedor procurar(String cnpj) throws ErroDeNegocioException {
		Fornecedor resultado = this.repositorioFornecedor.procurar(cnpj);
		if (resultado == null) {
			throw new ErroDeNegocioException("Fornecedor Não Existe !");
		}
		return resultado;
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

	public void remover(String cnpj) throws ErroDeNegocioException {
		Fornecedor fornecedor = this.repositorioFornecedor.procurar(cnpj);
		if (fornecedor != null) {
			this.repositorioFornecedor.remover(cnpj);
		} else {
			throw new ErroDeNegocioException("Fornecedor Não Existe !");
		}
	}

}