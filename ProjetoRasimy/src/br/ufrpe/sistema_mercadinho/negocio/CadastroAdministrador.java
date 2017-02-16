package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class CadastroAdministrador {

	private IRepositorioAdministrador repositorioAdm;
	public static CadastroAdministrador instancia;

	private CadastroAdministrador() {
		this.repositorioAdm = RepositorioAdministrador.getInstance();
	}

	public static CadastroAdministrador getInstance() {
		if (instancia == null) {
			instancia = new CadastroAdministrador();
		}
		return instancia;
	}

	public void cadastrarAdministrador(Administrador adm) {
		if (adm != null && !this.existeAdministrador(adm.getCpf())) {
			this.repositorioAdm.cadastrar(adm);
		} else {
			// exceção com usuario;
		}
	}

	public void atualizarAdministrador(Administrador adm) {
		if (adm != null && this.existeAdministrador(adm.getCpf())) {
			this.repositorioAdm.atualizar(adm);
		}
	}

	public Administrador procurarAdministrador(String id) {
		return this.repositorioAdm.procurar(id);
	}

	public void listarAdministrador() {
		this.repositorioAdm.listar();
	}

	public boolean existeAdministrador(String id) {
		ArrayList<Administrador> retorno = this.repositorioAdm.listar();
		
	}

	public void descadastrarAdministrador(String id) {
		Administrador administrador = this.repositorioAdm.procurar(id);

		if (administrador != null) {
			this.repositorioAdm.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}