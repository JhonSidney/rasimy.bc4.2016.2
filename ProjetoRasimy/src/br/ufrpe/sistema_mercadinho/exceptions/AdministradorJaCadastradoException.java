package br.ufrpe.sistema_mercadinho.exceptions;

public class AdministradorJaCadastradoException extends Exception {

	public AdministradorJaCadastradoException() {
		super("Administrador já cadastrado!");
	}

}
