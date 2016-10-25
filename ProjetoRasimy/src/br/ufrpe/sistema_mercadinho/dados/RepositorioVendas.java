package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Vendas;

public class RepositorioVendas {

	private Vendas[] venda;
	private int quantidadeVendas;
	
	public RepositorioVendas (int tamanho){
		this.venda = new Vendas[tamanho];
		this.quantidadeVendas = 0;
	}

	public Vendas[] getVenda() {
		return venda;
	}

	public int getQuantidadeVendas() {
		return this.quantidadeVendas;
	}

}
