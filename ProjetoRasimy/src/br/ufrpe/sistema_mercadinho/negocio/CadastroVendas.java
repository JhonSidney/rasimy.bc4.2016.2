package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioVendas;
import br.ufrpe.sistema_mercadinho.negocio.beans.Vendas;



public class CadastroVendas {

	private RepositorioVendas repositorioVendas;


	public CadastroVendas(){
		this.repositorioVendas =  new RepositorioVendas(1000);// tamanho do array do repositorio Vendas
	}


	public void cadastrar(Vendas codigoVenda){
		if(codigoVenda != null && !this.existe(codigoVenda.getCodigoVenda())){
			this.repositorioVendas.cadastrar(codigoVenda);
		}else{
			//interface com usuario
		}

	}

	public Vendas procurar(String codigoVenda){
		return this.repositorioVendas.procurar(codigoVenda);

	}

	public boolean existe(String codigoVenda){
		return this.repositorioVendas.existe(codigoVenda);

	}

	public void atualizar(String codigoVenda){

		Vendas venda = this.repositorioVendas.procurar(codigoVenda);

		if(venda != null){
			this.repositorioVendas.atualizar(codigoVenda);
		}else{ 
			//interface com usuario
		}

	}

	public void Listar(){
		this.repositorioVendas.listar();

	}

	public void descadastrar(String codigoVenda){
		Vendas venda = this.repositorioVendas.procurar(codigoVenda);

		if(venda != null){
			this.repositorioVendas.remover(codigoVenda);
		}else{
			//interface com usuario
		}

	}
}
