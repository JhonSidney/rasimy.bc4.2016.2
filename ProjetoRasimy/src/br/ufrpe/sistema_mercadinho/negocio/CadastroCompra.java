package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioCompra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.*;
public class CadastroCompra {

	private RepositorioCompra repositoriocompra;
	 
	 public CadastroCompra(){
	  
	  this.repositoriocompra = new RepositorioCompra(10000);//array do repositório compra
	 }

	 public void cadastrar(Compra compra){
	  if(compra == null && this.equals(compra.getCodigoPedido())&& this.equals(compra.getSerie())){
		  this.repositoriocompra.cadastrar(compra);
	   
	  }
	 }
	
public Compra procurar(String codigoPedido){
	return this.repositoriocompra.procurar(codigoPedido);
}
public boolean equals(String serie){
	return this.repositoriocompra.equals(serie);
}


}