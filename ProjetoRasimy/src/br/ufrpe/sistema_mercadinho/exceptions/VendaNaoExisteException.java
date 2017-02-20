package br.ufrpe.sistema_mercadinho.exceptions;

public class VendaNaoExisteException extends Exception {

	public VendaNaoExisteException() {
		super("Venda não existe!");
	}
	
}
