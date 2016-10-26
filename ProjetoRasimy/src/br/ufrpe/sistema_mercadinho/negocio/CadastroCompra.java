package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioCompra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;



public class CadastroCompra {

	private RepositorioCompra repositorioCompra;
	
	public CadastroCompra(){
		this.repositorioCompra = new RepositorioCompra(1000);//array do repositório compra
	}

	public void cadastrarCompra(Compra compra){
		if(compra != null && !this.existeCompra(compra.getCodigoPedido())&& !this.existeCompra(compra.getSerie())){
			this.repositorioCompra.cadastrar(compra);
		}
	}

	public void atualizarCompra(Compra compra){
		if(compra != null && !this.existeCompra(compra.getCodigoPedido())){
			this.repositorioCompra.atualizar(compra);
		}
	}

	public Compra procurarCompra(String codigoPedido){
		return this.repositorioCompra.procurar(codigoPedido);
	}
	
	public void listarCompra(){
		 this.repositorioCompra.listar();
	}

	
	public boolean existeCompra(String codigoPedido){
		return this.repositorioCompra.existe(codigoPedido);
	}

	
	public void descadastrarCompra (String codigoPedido){
		Compra compra = this.repositorioCompra.procurar(codigoPedido);

		if (compra != null) {
			this.repositorioCompra.remover(codigoPedido);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}