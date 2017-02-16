package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario {

	// ATRIBUTOS
	private ArrayList<Funcionario> funcionarios;
	public static RepositorioFuncionario instancia;

	private RepositorioFuncionario() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public static RepositorioFuncionario getInstance() {

		if (instancia == null) {
			instancia = new RepositorioFuncionario();
		}
		return instancia;
	}

	@Override
	public boolean cadastrar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		return true;
	}

	@Override
	public boolean atualizar(Funcionario funcionario) {
		int i = 0;
		for (Funcionario f : this.funcionarios) {
			i++;
			if (f.getCpf().equals(funcionario.getCpf())) {
				this.funcionarios.add(i, funcionario);
				return true;
			}
		}
		return false;
	}

	@Override
	public Funcionario procurar(String cpf) {
		for (Funcionario f : this.funcionarios) {
			if (f.getCpf().equals(cpf)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Funcionario> listar() {

		return this.funcionarios;
	}

	@Override
	public boolean remover(String cpf) {
		int i = 0;
		for (Funcionario f : this.funcionarios) {
			i++;
			if (f.getCpf().equals(cpf)) {
				this.funcionarios.remove(i);
				return true;
			}
		}

		return false;
	}

}