package negocios;
public class Produto {

	private int id;
	private String nome;
	private int quantidade;
	private float preco_custo;
	private float preco_venda;
	private String descricao;
	private String marca;
	private String categoria;

	public Produto(int id, String nome, int quantidade, float preco_custo,
			float preco_venda, String descricao, String marca, String categoria) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco_custo = preco_custo;
		this.preco_venda = preco_venda;
		this.descricao = descricao;
		this.marca = marca;
		this.categoria = categoria;
	}

	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", quantidade="
				+ quantidade + ", preco_custo=" + preco_custo
				+ ", preco_venda=" + preco_venda + ", descricao=" + descricao
				+ ", marca=" + marca + ", categoria=" + categoria + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(float preco_custo) {
		this.preco_custo = preco_custo;
	}

	public float getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}