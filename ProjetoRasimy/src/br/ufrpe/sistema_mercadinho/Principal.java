package br.ufrpe.sistema_mercadinho;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class Principal {

	public static void criarDados() {
		SistemaMercadinho fachada = SistemaMercadinho.getInstance();
		Administrador admin = new Administrador("", "admin@hotmail.com", "",
				"Administrador", "admin", "", "", "", "", "", "", "", "admin");
		Fornecedor fornecedor = new Fornecedor(null, null, null, null, null,
				null);
		Compra compra = new Compra(null, null, null, fornecedor, null, 0, null);
		Funcionario funcionario = new Funcionario(null, null, null, null, null,
				null, null, null, null, null, null, null, null);
		Item item = new Item(null, null, 0, null, null, 0, 0, 0);
		Venda venda = new Venda(null, funcionario, null, 0, 0, 0, 0, item);
		try {
			fachada.cadastrarAdministrador(admin);
			fachada.cadastrarCompra(compra);
			fachada.cadastrarFornecedor(fornecedor);
			fachada.cadastrarFuncionario(funcionario);
			fachada.cadastrarItem(item);
			fachada.cadastrarVenda(venda);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		} 
	}

	public static void main(String[] args) {
		criarDados();
		SistemaMercadinho fachada = SistemaMercadinho.getInstance();
		for (Administrador a : fachada.listarAdministrador()) {
			System.out.println(a.toString());
		}
		for (Fornecedor a : fachada.listarFornecedor()) {
			System.out.println(a.toString());
		}
		for (Compra a : fachada.listarCompras()) {
			System.out.println(a.toString());
		}
		for (Item a : fachada.listarItem()) {
			System.out.println(a.toString());
		}
		for (Venda a : fachada.listarVenda()) {
			System.out.println(a.toString());
		}
		for (Funcionario a : fachada.listarFuncionario()) {
			System.out.println(a.toString());
		}
		criarDados(); // Exception's funcionando!!
	}

}
