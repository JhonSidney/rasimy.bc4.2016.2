package negocios;
import java.util.Date;

public class Compra {

	private int id, quantidade;
	private Date data;
	private double ValorTotal;
	private Produto[] produtos = new Produto[1000];

	public Compra(int id, int quantidade, Date data, double valorTotal,
			Produto[] produtos) {

		this.id = id;
		this.quantidade = quantidade;
		this.data = data;
		ValorTotal = valorTotal;
		this.produtos = produtos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

}
