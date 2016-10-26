package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioVenda;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;



public class CadastroVenda {

	private RepositorioVenda repositorioVenda;
	
	public CadastroVenda(){
		this.repositorioVenda = new RepositorioVenda(1000);//array do repositório compra
	}

	public void cadastrarVenda(Venda venda){
		if(venda != null && !this.existeVenda(venda.getCodigoVenda())){
			this.repositorioVenda.cadastrar(venda);
		}
	}

	public void atualizarVenda(Venda venda){
		if(venda != null && !this.existeVenda(venda.getCodigoVenda())){
			this.repositorioVenda.atualizar(venda);
		}
	}

	public Venda procurarVenda(String codigoVenda){
		return this.repositorioVenda.procurar(codigoVenda);
	}
	
	public void listarVenda(){
		 this.repositorioVenda.listar();
	}

	
	public boolean existeVenda(String codigoVenda){
		return this.repositorioVenda.existe(codigoVenda);
	}

	
	public void descadastrarVenda(String codigoVenda){
		Venda item = this.repositorioVenda.procurar(codigoVenda);

		if (item != null) {
			this.repositorioVenda.remover(codigoVenda);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}

}