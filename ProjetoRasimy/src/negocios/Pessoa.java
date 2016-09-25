package negocios;

public class Pessoa {

	
	private int id,cpf,cep,dataCadastro;
	private String nome, logradouro,telefone, celular, cidade, bairro,uf, email;
	
	
	public Pessoa(int id, int cpf, int cep, int dataCadastro, String nome,
			String logradouro, String telefone, String celular, String cidade,
			String bairro, String uf, String email) {
		this.id = id;
		this.cpf = cpf;
		this.cep = cep;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
		this.logradouro = logradouro;
		this.telefone = telefone;
		this.celular = celular;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}


	public int getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(int dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	


	
}
