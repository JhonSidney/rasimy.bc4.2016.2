package br.ufrpe.sistema_mercadinho.exceptions;

public class FuncionarioNaoExisteException extends Exception {
	
	public FuncionarioNaoExisteException() {
		super("Funcionário não existe!");
	}

}
