package negocios;

public class Adm extends Pessoa{

	private boolean AcessoTotal;

	public Adm(int id, int cpf, int cep, int dataCadastro, String nome,
			String logradouro, String telefone, String celular, String cidade,
			String bairro, String uf, String email, boolean acessoTotal) {
		super(id, cpf, cep, dataCadastro, nome, logradouro, telefone, celular,
				cidade, bairro, uf, email);
		AcessoTotal = acessoTotal;
	}

	public boolean isAcessoTotal() {
		return AcessoTotal;
	}

	public void setAcessoTotal(boolean acessoTotal) {
		AcessoTotal = acessoTotal;
	}

	
}
