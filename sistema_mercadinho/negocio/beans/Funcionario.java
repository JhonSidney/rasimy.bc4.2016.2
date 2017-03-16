package br.ufrpe.sistema_mercadinho.negocio.beans;



public class Funcionario extends Pessoa {
	private String funcao;
	private String admissao;
	private String demissao;
	private double salario;

	public Funcionario(String telefone, String email, String endereco, String nome, String cpf, String rg,
			String dataEmissao, String orgaoEmissao, String sexo, String estadoCivil, String nacionalidade,
			String naturalidade, String senha) {
		super(telefone, email, endereco, nome, cpf, rg, dataEmissao, orgaoEmissao, sexo, estadoCivil, nacionalidade,
				naturalidade, senha);
		this.setFuncao(funcao);
		this.setAdmissao(admissao);
		this.setDemissao(demissao);
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean equals(Object o){
		boolean igual = false;
		if(((Funcionario)o).getCpf().equals(this.getCpf())){
			igual = true;
		}
		return igual;
	}

	public String toString() {
		return "Funcionario [funcao=" + funcao + ", admissao=" + admissao
				+ ", demissao=" + demissao + ", senha=" + senha + ", salario="
				+ salario + "]";
	}
}