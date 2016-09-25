package negocios;

public class Fornecedor extends Pessoa{

	private String razaoSocial,nomeFantasia;
	private long cnpj;
	public Fornecedor(int id, int cpf, int cep, int dataCadastro, String nome,
			String logradouro, String telefone, String celular, String cidade,
			String bairro, String uf, String email, String razaoSocial,
			String nomeFantasia, long cnpj) {
		super(id, cpf, cep, dataCadastro, nome, logradouro, telefone, celular,
				cidade, bairro, uf, email);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
