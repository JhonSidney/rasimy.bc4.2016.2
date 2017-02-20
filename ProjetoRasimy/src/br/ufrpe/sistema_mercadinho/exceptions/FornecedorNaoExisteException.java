package br.ufrpe.sistema_mercadinho.exceptions;

public class FornecedorNaoExisteException extends Exception {
	
	public FornecedorNaoExisteException() {
		super("Fornecedor não existe!");
	}
	
}
