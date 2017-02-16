package br.ufrpe.sistema_mercadinho.negocio.beans;




public class Administrador extends Pessoa  {

	private int nivelAcesso;

	public Administrador(String telefone, String email, String endereco, String nome, String cpf, String rg,
			String dataEmissao, String orgaoEmissao, String sexo, String estadoCivil, String nacionalidade,
			String naturalidade, int senha) {
		super(telefone, email, endereco, nome, cpf, rg, dataEmissao, orgaoEmissao, sexo, estadoCivil, nacionalidade,
				naturalidade, senha);
		this.setNivelAcesso(senha);

	}

	public int getNivelAcesso() {
		return this.nivelAcesso;
	}

	public void setNivelAcesso(int nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public boolean equals(Object o){
		boolean igual = false;
		if(o instanceof Administrador){ 
			if(((Administrador) o).getCpf().equals(this.getCpf())){
				igual = true;
			}
		}
		return igual;
	}

	public String toString(){
		return "Administrador [nivelAcesso = " +this.nivelAcesso + super.toString()+" ]";
	}
}
