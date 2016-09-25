package dados;

import negocios.Pessoa;


public class RepositorioCliente {

	private Pessoa[] pessoas;
	
	public RepositorioCliente (int banco){
		this.pessoas = new Pessoa[banco];
	
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	
		
}
