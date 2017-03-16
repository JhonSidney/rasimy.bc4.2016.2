package br.ufrpe.sistema_mercadinho.negocio.beans;

public abstract class Pessoa {

	protected String telefone;
	protected String email;
	protected String endereco;
	protected String nome;
	protected String cpf;
	protected String rg;
	protected String dataEmissao;
	protected String orgaoEmissao;
	protected String sexo;
	protected String estadoCivil;
	protected String nacionalidade;
	protected String naturalidade;
	protected String senha;

	public Pessoa(String telefone, String email, String endereco, String nome,
			String cpf, String rg, String dataEmissao, String orgaoEmissao,
			String sexo, String estadoCivil, String nacionalidade,
			String naturalidade, String senha) {

		this.setTelefone(telefone);
		this.setEmail(email);
		this.setEndereco(endereco);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setRg(orgaoEmissao);
		this.setDataEmissao(dataEmissao);
		this.setOrgaoEmissao(orgaoEmissao);
		this.setSexo(sexo);
		this.setEstadoCivil(estadoCivil);
		this.setNacionalidade(nacionalidade);
		this.setNaturalidade(naturalidade);
		this.setSenha(senha);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getOrgaoEmissao() {
		return orgaoEmissao;
	}

	public void setOrgaoEmissao(String orgaoEmissao) {
		this.orgaoEmissao = orgaoEmissao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Pessoa [telefone=" + telefone + ", email=" + email
				+ ", endereco=" + endereco + ", nome=" + nome + ", cpf=" + cpf
				+ ", rg=" + rg + ", dataEmissao=" + dataEmissao
				+ ", orgaoEmissao=" + orgaoEmissao + ", sexo=" + sexo
				+ ", estadoCivil=" + estadoCivil + ", nacionalidade="
				+ nacionalidade + ", naturalidade=" + naturalidade + ", senha="
				+ senha + "]";
	}
}
