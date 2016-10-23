package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
public class RepositorioAdministrador {

	private Administrador[] adm;
	private int qtdAdministrador;
	
	
	public RepositorioAdministrador(int tamanho){
		this.adm = new Administrador[tamanho];
		this.qtdAdministrador = 0; 
		
	}
	
	
	
	
	
	
}
