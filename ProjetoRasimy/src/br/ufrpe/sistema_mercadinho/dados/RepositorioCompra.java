package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public class RepositorioCompra {

	private Compra[] compra;
	private int qtdCompra;
	
	
	public RepositorioCompra(int tamanho){
		this.compra = new Compra[tamanho];
		this.qtdCompra = 0; 
		
	}
	
}
