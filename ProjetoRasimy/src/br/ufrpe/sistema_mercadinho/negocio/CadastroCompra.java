package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioCompra;
import br.ufrpe.sistema_mercadinho.negocio.beans.*;
public class CadastroCompra {

	private RepositorioCompra repositorioCompra;

	public CadastroCompra(){

		this.repositorioCompra = new RepositorioCompra(10000);//array do repositório compra
	}

	public void cadastrar(Compra compra){
		if(compra != null && !this.equals(compra.getCodigoPedido())&& !this.equals(compra.getSerie())){
			this.repositorioCompra.cadastrar(compra);
		}
	}

	public void atualizar(String codigoPedido){
		Compra compra = this.repositorioCompra.procurar(codigoPedido);

		if (compra != null) {
			this.repositorioCompra.atualizar(codigoPedido);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

	public Compra procurar(String codigoPedido){
		return this.repositoriocompra.procurar(codigoPedido);
	}
	public boolean existe(String codigoPedido){
		return this.repositoriocompra.existe(codigoPedido);
	}

	public void listar(){
		 this.repositorioCompra.listar();
	}
	
	public void descadastrar (String codigoPedido){
		Compra compra = this.repositorioCompra.procurar(codigoPedido);

		if (compra != null) {
			this.repositorioCompra.remover(codigoPedido);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}