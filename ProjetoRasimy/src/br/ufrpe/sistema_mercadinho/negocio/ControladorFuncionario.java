package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class ControladorFuncionario {

	private RepositorioFuncionario repositorioFuncionario;

	public ControladorFuncionario() {
		this.repositorioFuncionario = RepositorioFuncionario.getInstance();
	}

	public void cadastrar(Funcionario funcionario) {
		if (funcionario != null && !this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.cadastrar(funcionario);
		} else {
			// interface com usuario;
		}
	}

	public void atualizar(Funcionario funcionario) {
		if (funcionario != null && this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.atualizar(funcionario);
		}
	}

	public Funcionario procurar(String cpf) {
		return this.repositorioFuncionario.procurar(cpf);
	}

	public ArrayList<Funcionario> listar() {
		return this.repositorioFuncionario.listar();
	}

	private boolean existe(String cpf) {
		ArrayList<Funcionario> retorno = this.repositorioFuncionario.listar();
		for (Funcionario func : retorno) {
			if (func.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public void remover(String cpf) {
		Funcionario funcionario = this.repositorioFuncionario.procurar(cpf);

		if (funcionario != null) {
			this.repositorioFuncionario.remover(cpf);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}