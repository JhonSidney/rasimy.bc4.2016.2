package br.ufrpe.sistema_mercadinho.dados;

import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class RepositorioFuncionario {

	private Funcionario[] func;
	private int qtdFuncionario;
	
	
	public RepositorioFuncionario(int tamanho){
		this.func = new Funcionario[tamanho];
		this.qtdFuncionario = 0; 
		
	}
	
}
