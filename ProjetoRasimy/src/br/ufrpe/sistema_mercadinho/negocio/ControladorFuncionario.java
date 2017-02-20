package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class ControladorFuncionario {

	private RepositorioFuncionario repositorioFuncionario;

	public ControladorFuncionario() {
		this.repositorioFuncionario = RepositorioFuncionario.getInstance();
	}

	public void cadastrar(Funcionario funcionario) throws FuncionarioJaExisteException {
		if (funcionario != null && !this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.cadastrar(funcionario);
		} else {
			throw new FuncionarioJaExisteException();
		}
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoExisteException {
		if (funcionario != null && this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.atualizar(funcionario);
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

	public Funcionario procurar(String cpf) throws FuncionarioNaoExisteException {
		Funcionario resultado = this.repositorioFuncionario.procurar(cpf);
		if (resultado == null) {
			throw new FuncionarioNaoExisteException();
		}
		return resultado;
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

	public void remover(String cpf) throws FuncionarioNaoExisteException {
		Funcionario funcionario = this.repositorioFuncionario.procurar(cpf);

		if (funcionario != null) {
			this.repositorioFuncionario.remover(cpf);
		} else {
			throw new FuncionarioNaoExisteException();
		}
	}

}