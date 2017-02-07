package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public interface IRepositorioAdministrador {

	
public  void cadastrar(Administrador adm);

public  void atualizar(Administrador adm);

public  Administrador procurar(String id);

public  void listar();

public  void remover(String id);



}
