package dados;

import negocios.Pessoa;


public class RepositorioPessoa {

	private Pessoa[] pessoas;
	
	public RepositorioPessoa (int banco){
		this.pessoas = new Pessoa[banco];
	
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	
		
}
