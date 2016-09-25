package negocios;

public class Cliente extends Pessoa {

	private String sexo, nacionalidade,naturalidade,estadoCivil,escolaridade,mae,pai,rg;

	public Cliente(int id, int cpf, int cep, int dataCadastro, String nome,
			String logradouro, String telefone, String celular, String cidade,
			String bairro, String uf, String email, String sexo,
			String nacionalidade, String naturalidade, String estadoCivil,
			String escolaridade, String mae, String pai, String rg) {
		super(id, cpf, cep, dataCadastro, nome, logradouro, telefone, celular,
				cidade, bairro, uf, email);
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.mae = mae;
		this.pai = pai;
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	
}
