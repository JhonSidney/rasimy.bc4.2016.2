package negocios;
public class ItemEstoque {

	private String codigo;
	private Integer quantidade;

	public ItemEstoque(String codigo, Integer quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

}
