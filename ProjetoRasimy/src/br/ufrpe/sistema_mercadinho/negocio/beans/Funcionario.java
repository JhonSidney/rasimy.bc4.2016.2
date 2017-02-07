package br.ufrpe.sistema_mercadinho.negocio.beans;



public class Funcionario extends Pessoa implements ISeguranca{

	
	private String funcao;
	private String admissao;
	private String demissao;
	private String senha;
	private double salario;
	

	public Funcionario(String id, String telefone, String email,
			String endereco, String nome, String cpf, String rg,
			String dataEmissao, String orgaoEmissao, String sexo,
			String estadoCivil, String nacionalidade, String naturalidade,
			String funcao, String admissao, String demissao, String senha, double salario) {
		
		super(id, telefone, email, endereco, nome, cpf, rg, dataEmissao, orgaoEmissao,
				sexo, estadoCivil, nacionalidade, naturalidade);
		this.setFuncao(funcao);
		this.setAdmissao(admissao);
		this.setDemissao(demissao);
		this.setSenha(senha);
		this.setSalario(salario);
		
	}
	
	
	public String getFuncao(){
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public String getDemissao() {
		return demissao;
	}
	public void setDemissao(String demissao) {
		this.demissao = demissao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
public boolean equals(Funcionario funcionario){
	boolean igual = false;
	if(funcionario != null && this.funcao.equals(funcionario.getFuncao())
			&& this.admissao.equals(funcionario.getAdmissao())  
			&& this.salario == funcionario.getSalario() 
			&& this.id.equals(funcionario.getId())){		
		return true;
	}
	return igual;
}

public boolean existe(Funcionario funcionario){
	boolean igual = false;
	if(funcionario != null && this.id.equals(funcionario.getId())){		
		return true;
	}
	return igual;
}



public String toString() {
	return "Funcionario [funcao=" + funcao + ", admissao=" + admissao
			+ ", demissao=" + demissao + ", senha=" + senha + ", salario="
			+ salario + "]";
}


}