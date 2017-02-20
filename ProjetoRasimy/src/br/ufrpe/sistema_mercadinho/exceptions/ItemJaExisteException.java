package br.ufrpe.sistema_mercadinho.exceptions;

public class ItemJaExisteException extends Exception {

	public ItemJaExisteException() {
		super("Item já existe!");
	}
	
}
