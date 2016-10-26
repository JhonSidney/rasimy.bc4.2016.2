package br.ufrpe.sistema_mercadinho.negocio.beans;



public class Administrador extends Pessoa {

	private String senha;

	public Administrador(String id, String telefone, String email,
			String endereco, String nome, String cpf, String rg,
			String dataEmissao, String orgaoEmissao, String sexo,
			String estadoCivil, String nacionalidade, String naturalidade) {
		super(id, telefone, email, endereco, nome, cpf, rg, dataEmissao, orgaoEmissao,
				sexo, estadoCivil, nacionalidade, naturalidade);
		// TODO Auto-generated constructor stub
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean equals(Administrador adm){
		boolean igual = false;
		if(adm != null && senha.equals(adm.getSenha())&& id.equals(adm.getId())){
			return true;
		}
		return igual;
	}
	
   public String toString(){
	   return "Administrador [senha = " +senha +" ]";
   }
	
	
}
