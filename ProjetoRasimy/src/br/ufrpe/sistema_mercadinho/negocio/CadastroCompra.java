package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioCompra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;



public class CadastroCompra {

	private RepositorioCompra repositorioCompra;
	
	public CadastroCompra(){
		this.repositorioCompra = new RepositorioCompra(1000);//array do repositório compra
	}

	public void cadastrar(Compra compra){
		if(compra != null && !this.existe(compra.getCodigoPedido())&& !this.existe(compra.getSerie())){
			this.repositorioCompra.cadastrar(compra);
		}
	}

	public void atualizar(Compra compra){
		if(compra != null && !this.existe(compra.getCodigoPedido())){
			this.repositorioCompra.atualizar(compra);
		}
	}

	public Compra procurar(String codigoPedido){
		return this.repositorioCompra.procurar(codigoPedido);
	}
	
	public void listar(){
		 this.repositorioCompra.listar();
	}

	
	public boolean existe(String codigoPedido){
		return this.repositorioCompra.existe(codigoPedido);
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