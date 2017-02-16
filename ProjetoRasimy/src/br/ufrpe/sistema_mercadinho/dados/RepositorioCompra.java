package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public class RepositorioCompra implements IRepositorioCompra{

	private Compra[] compras;
	private int qtdCompras;
	public static RepositorioCompra instancia;


	public RepositorioCompra(int tamanho){
		this.compras = new Compra[tamanho];
		this.qtdCompras = 0; 
		
	}
	
	public  RepositorioCompra(){
		
	}
	
	
	public static RepositorioCompra getInstance() {

		if(instancia == null){
			instancia = new RepositorioCompra();
		}
	    return instancia;
	  }
	
	/*

	public Compra[] getCompras(){
		return this.compras;
	}


	public int getQtdCompras(){
		return this.qtdCompras;
	}

	*/
	public void cadastrar(Compra compra){
		this.compras[qtdCompras] = compra;
		this.qtdCompras++;
		if(this.qtdCompras ==  this.compras.length){
			this.duplicaArrayCompras();
		}
	}


	public void atualizar(Compra compra){
		int indice = this.procurarIndice(compra.getCodigoPedido());
		if(indice != qtdCompras){
			this.compras[indice] = compra;
		}else{
			//
		}
	}


	public Compra procurar(String codigoPedido){
		int indice = this.procurarIndice(codigoPedido);
		Compra resultado = null;
		if(indice != this.qtdCompras){
			resultado = this.compras[indice];
		}
		return resultado;
	}

	public void listar(){
		for(int i=0; i< this.qtdCompras;i++){
			System.out.println(""+compras[i]);
		}
	}
	
	
	
	public void remover(String codigoPedido){
		
		int indice = this.procurarIndice(codigoPedido);
		if(indice != this.qtdCompras){
			this.compras[indice] = this.compras[this.qtdCompras - 1];
			this.compras[this.qtdCompras - 1] = null;
			this.qtdCompras = this.qtdCompras - 1;
		}else{
			//
		}

	}


	private int procurarIndice(String codigoPedido) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdCompras)) {
			if (codigoPedido.equals(this.compras[indice].getCodigoPedido())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayCompras() {

		if (this.compras != null && this.compras.length > 0) {
			Compra[] arrayDuplicado = new Compra[this.compras.length * 2];

			for (int i = 0; i < this.compras.length; i++) {
				arrayDuplicado[i] = this.compras[i];
			}
			this.compras = arrayDuplicado;
		}

	}

	
	public boolean existe(String codigoPedido){
		boolean existe = false;
		int indice = this.procurarIndice(codigoPedido);
		if(indice != this.qtdCompras){
			existe = true;
		}
		return existe;
	}
}