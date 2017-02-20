package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class ControladorAdministrador {
	private IRepositorioAdministrador repositorioAdm;

	public ControladorAdministrador() {
		this.repositorioAdm = RepositorioAdministrador.getInstance();
	}

	public void cadastrar(Administrador adm)
			throws AdministradorJaCadastradoException {
		if (adm != null && !this.existe(adm.getCpf())) {
			this.repositorioAdm.cadastrar(adm);
		} else {
			throw new AdministradorJaCadastradoException();
		}
	}

	public void atualizar(Administrador adm)
			throws AdministradorNaoExisteException {
		if (adm != null && this.existe(adm.getCpf())) {
			this.repositorioAdm.atualizar(adm);
		} else {
			throw new AdministradorNaoExisteException();
		}
	}

	public Administrador procurar(String cpf)
			throws AdministradorNaoExisteException {
		Administrador resultado = this.repositorioAdm.procurar(cpf);
		if (resultado == null) {
			throw new AdministradorNaoExisteException();
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

	public void remover(String cpf) throws AdministradorNaoExisteException {
		Administrador administrador = this.repositorioAdm.procurar(cpf);
		if (administrador != null) {
			this.repositorioAdm.remover(cpf);
		} else {
			throw new AdministradorNaoExisteException();
		}
	}
}