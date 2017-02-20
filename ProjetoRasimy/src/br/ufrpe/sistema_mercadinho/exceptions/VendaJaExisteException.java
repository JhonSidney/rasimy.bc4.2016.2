package br.ufrpe.sistema_mercadinho.exceptions;

public class VendaJaExisteException extends Exception {
	
	public VendaJaExisteException() {
		super("Venda já existe!");
	}

}
