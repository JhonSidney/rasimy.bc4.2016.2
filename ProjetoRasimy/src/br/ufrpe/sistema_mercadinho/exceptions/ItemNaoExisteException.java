package br.ufrpe.sistema_mercadinho.exceptions;

public class ItemNaoExisteException extends Exception {

	public ItemNaoExisteException() {
		super("Item não existe!");
	}
	
}
