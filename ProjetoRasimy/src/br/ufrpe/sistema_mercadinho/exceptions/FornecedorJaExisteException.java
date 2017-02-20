package br.ufrpe.sistema_mercadinho.exceptions;

public class FornecedorJaExisteException extends Exception {
	
	public FornecedorJaExisteException() {
		super("Fornecedor já existe!");
	}
	
}
