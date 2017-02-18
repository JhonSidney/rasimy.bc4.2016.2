package br.ufrpe.sistema_mercadinho.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public interface IRepositorioAdministrador {

	public boolean cadastrar(Administrador adm);

	public boolean atualizar(Administrador adm);

	public Administrador procurar(String cpf);

	public ArrayList<Administrador> listar();

	public boolean remover(String cpf);




}
