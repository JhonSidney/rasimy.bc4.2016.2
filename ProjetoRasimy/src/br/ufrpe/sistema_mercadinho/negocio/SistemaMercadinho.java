package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class SistemaMercadinho {

	private static SistemaMercadinho instance;
	private CadastroAdministrador administradores;
	private CadastroFuncionario funcionarios;
	private CadastroFornecedor fornecedores;
	private CadastroCompra compras;
	private CadastroItem itens;
	private CadastroVenda vendas;
	private CadastroLogin logins;


	private SistemaMercadinho(){
		this.administradores = new CadastroAdministrador();
		this.funcionarios = new CadastroFuncionario();
		this.fornecedores = new CadastroFornecedor();
		this.compras = new CadastroCompra();
		this.itens = new CadastroItem();
		this.logins = new CadastroLogin();
	}


	public static SistemaMercadinho getInstance(){
		if(instance == null){
			instance = new SistemaMercadinho();
		}
		return instance;
	}

	

	public void cadastrarAdministrador(Administrador adm){
		administradores.cadastrarAdministrador(adm);
	}

	public void atualizarAdministrador(Administrador adm){
		administradores.atualizarAdministrador(adm);
	}

	public Administrador procurarAdministrador (String id){
		return administradores.procurarAdministrador(id);
	}

	public void  listarAdministrador() {
		administradores.listarAdministrador();
	}

	public void descadastrarAdministrador(String id){
		administradores.descadastrarAdministrador(id);
	}


	

	public void cadastrarCompra(Compra compra){
		compras.cadastrarCompra(compra);
	}

	public void atualizarCompra(Compra compra){
		compras.atualizarCompra(compra);
	}

	public Compra procurarCompra(String codigoPedido){
		return compras.procurarCompra(codigoPedido);
	}

	public void listarCompra(){
		compras.listarCompra();
	}

	public void descadastrarCompra(String codigoPedido){
		compras.descadastrarCompra(codigoPedido);
	}

	
	public void cadastrarFornecedor(Fornecedor fornecedor){
		fornecedores.cadastrarFornecedor(fornecedor);;
	}

	public void atualizarFornecedor(Fornecedor fornecedor){
		fornecedores.atualizarFornecedor(fornecedor);
	}

	public Fornecedor procurarFornecedor (String id){
		return fornecedores.procurarFornecedor(id);
	}

	public void  listarFornecedor() {
		fornecedores.listarFornecedor();
	}

	public void descadastrarFornecedor(String id){
		fornecedores.descadastrarFornecedor(id);
	}


	
	public void cadastrarFuncionario(Funcionario funcionario){
		funcionarios.cadastrarFuncionario(funcionario);
	}
	
	public void atualizarFuncionario(Funcionario funcionario){
		 funcionarios.atualizarFuncionario(funcionario);
	}
	
	public Funcionario procurarFuncionario(String id){
		return funcionarios.procurarFuncionario(id);
	}
	
	public void listarFuncionario(){
		funcionarios.listarFuncionario();
	}
	
	public void descadastrarFuncionario(String id){
		funcionarios.descadastrarFuncionario(id);
	}
	
	
	
	public void cadastrarItem(Item item){
		itens.cadastrarItem(item);
	}
	
	public void atualizarItem(Item item){
		itens.atualizarItem(item);
	}
	
	public Item procurarItem(String codigoProduto){
		return itens.procurarItem(codigoProduto);
	}
	
	public void listarItem(){
		itens.listarItem();
	}
	
	public void descadastrarItem(String codigoProduto){
		itens.descadastrarItem(codigoProduto);
	}
	
	
	
	public void cadastrarVenda(Venda venda){
		vendas.cadastrarVenda(venda);
	}
	
	public void atualizarVenda(Venda venda){
		vendas.atualizarVenda(venda);
	}
	
	
	public Venda procurarVenda(String codigoVenda){
		return vendas.procurarVenda(codigoVenda);
	}
	
	
	public void listarVenda(){
		vendas.listarVenda();
	}
	
	public void descadastrarVenda(String codigoVenda){
		vendas.descadastrarVenda(codigoVenda);
	}
	
	
	public boolean efetuarLogin(String id, String senha){
		return logins.efetuarLogin(id, senha);
	}
	
	
}
