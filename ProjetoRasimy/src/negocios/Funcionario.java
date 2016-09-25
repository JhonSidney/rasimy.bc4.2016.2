package negocios;

public class Funcionario extends Pessoa{

	private int id,admissao,demissao;

	public Funcionario(int id, int cpf, int cep, int dataCadastro, String nome,
			String logradouro, String telefone, String celular, String cidade,
			String bairro, String uf, String email, int id2, int admissao,
			int demissao) {
		super(id, cpf, cep, dataCadastro, nome, logradouro, telefone, celular,
				cidade, bairro, uf, email);
		id = id2;
		this.admissao = admissao;
		this.demissao = demissao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdmissao() {
		return admissao;
	}

	public void setAdmissao(int admissao) {
		this.admissao = admissao;
	}

	public int getDemissao() {
		return demissao;
	}

	public void setDemissao(int demissao) {
		this.demissao = demissao;
	}
	

	
	
	
	
}
