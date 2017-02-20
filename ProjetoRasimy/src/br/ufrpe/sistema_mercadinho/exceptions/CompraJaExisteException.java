package br.ufrpe.sistema_mercadinho.exceptions;

public class CompraJaExisteException extends Exception {
	
	public CompraJaExisteException() {
		super("Compra já cadastrada!");
	}
	
}
