package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class RepositorioAdministrador implements IRepositorioAdministrador {

	private ArrayList<Administrador> administradores;
	public static RepositorioAdministrador instancia;

	private RepositorioAdministrador() {
		this.administradores = new ArrayList<Administrador>();
	}

	public static RepositorioAdministrador getInstance() {

		if (instancia == null) {
			instancia = new RepositorioAdministrador();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Administrador adm) {
		this.administradores.add(adm);
		return true;
	}

	@Override
	public boolean atualizar(Administrador adm) {

		int i = 0;
		for (Administrador a : this.administradores) {
			i++;
			if (a.getCpf().equals(adm.getCpf())) {
				this.administradores.add(i, adm);
				return true;
			}
		}

		return false;
	}

	@Override
	public Administrador procurar(String cpf) {

		for (Administrador a : this.administradores) {
			if (a.getCpf().equals(cpf)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Administrador> listar() {
		return this.administradores;
	
	}

	@Override
	public boolean remover(String cpf) {

		int i = 0;
		for (Administrador a : this.administradores) {
			i++;
			if (a.getCpf().equals(cpf)) {
				this.administradores.remove(i);
				return true;
			}
		}
		return false;
	}

}