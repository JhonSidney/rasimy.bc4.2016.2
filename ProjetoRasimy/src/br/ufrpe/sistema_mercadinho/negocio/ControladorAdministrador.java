package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class ControladorAdministrador {
	private IRepositorioAdministrador repositorioAdm;

	public ControladorAdministrador() {
		this.repositorioAdm = RepositorioAdministrador.getInstance();
	}

	public void cadastrar(Administrador adm)
			throws ErroDeNegocioException {
		if (adm != null && !this.existe(adm.getCpf())) {
			this.repositorioAdm.cadastrar(adm);
		} else {
			throw new ErroDeNegocioException("Administrador já Existe !");
		}
	}

	public void atualizar(Administrador adm)
			throws ErroDeNegocioException {
		if (adm != null && this.existe(adm.getCpf())) {
			this.repositorioAdm.atualizar(adm);
		} else {
			throw new ErroDeNegocioException("Administrador não Existe !");
		}
	}

	public Administrador procurar(String cpf)
			throws ErroDeNegocioException {
		Administrador resultado = this.repositorioAdm.procurar(cpf);
		if (resultado == null) {
			throw new ErroDeNegocioException("Administrador Não Existe !");
		}
		return resultado;
	}

	public ArrayList<Administrador> listar() {
		return this.repositorioAdm.listar();
	}

	private boolean existe(String cpf) {
		boolean resultado = false;
		ArrayList<Administrador> retorno = this.repositorioAdm.listar();
		for (Administrador a : retorno) {
			if (a.getCpf().equals(cpf)) {
				resultado = true;
			}
		}
		return resultado;
	}

	public void remover(String cpf) throws ErroDeNegocioException {
		Administrador administrador = this.repositorioAdm.procurar(cpf);
		if (administrador != null) {
			this.repositorioAdm.remover(cpf);
		} else {
			throw new ErroDeNegocioException("Administrador Não Existe !");
		}
	}
}