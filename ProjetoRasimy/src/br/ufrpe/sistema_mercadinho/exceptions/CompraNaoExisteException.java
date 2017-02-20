package br.ufrpe.sistema_mercadinho.exceptions;

public class CompraNaoExisteException extends Exception {
	
	public CompraNaoExisteException() {
		super("Compra não existe!");
	}
	
}
