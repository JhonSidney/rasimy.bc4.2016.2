package br.ufrpe.sistema_mercadinho.exceptions;

public class FuncionarioJaExisteException extends Exception {
	
	public FuncionarioJaExisteException() {
		super("Funcionário já existe!");
	}
	
}
