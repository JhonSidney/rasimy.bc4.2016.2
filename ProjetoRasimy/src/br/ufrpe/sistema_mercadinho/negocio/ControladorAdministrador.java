package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class ControladorAdministrador {
	private IRepositorioAdministrador repositorioAdm;

	public ControladorAdministrador() {
		this.repositorioAdm = RepositorioAdministrador.getInstance();
	}

	public void cadastrar(Administrador adm) {
		if (adm != null && !this.existe(adm.getCpf())) {
			this.repositorioAdm.cadastrar(adm);
		} else {
			// exceção com usuario;
		}
	}

	public void atualizar(Administrador adm) {
		if (adm != null && this.existe(adm.getCpf())) {
			this.repositorioAdm.atualizar(adm);
		} else {
			// exceção
		}
	}

	public Administrador procurar(String cpf) {
		return this.repositorioAdm.procurar(cpf);
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

	public void remover(String cpf) {
		Administrador administrador = this.repositorioAdm.procurar(cpf);
		if (administrador != null) {
			this.repositorioAdm.remover(cpf);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}
}