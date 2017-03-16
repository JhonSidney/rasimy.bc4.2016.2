package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class SistemaMercadinho {

	private static SistemaMercadinho instance;
	private ControladorAdministrador administradores;
	private ControladorFuncionario funcionarios;
	private ControladorFornecedor fornecedores;
	private ControladorCompra compras;
	private ControladorItem itens;
	private ControladorVenda vendas;
	private ControladorLogin logins;

	private SistemaMercadinho() {
		this.administradores = new ControladorAdministrador();
		this.funcionarios = new ControladorFuncionario();
		this.fornecedores = new ControladorFornecedor();
		this.compras = new ControladorCompra();
		this.itens = new ControladorItem();
		this.vendas = new ControladorVenda();
		this.logins = new ControladorLogin();
	}

	public static SistemaMercadinho getInstance() {
		if (instance == null) {
			instance = new SistemaMercadinho();
		}
		return instance;
	}

	public void cadastrarAdministrador(Administrador adm) throws ErroDeNegocioException {
		this.administradores.cadastrar(adm);
	}

	public void atualizarAdministrador(Administrador adm) throws ErroDeNegocioException {
		this.administradores.atualizar(adm);
	}

	public Administrador procurarAdministrador(String cpf) throws ErroDeNegocioException {
		return administradores.procurar(cpf);

	}

	public ArrayList<Administrador> listarAdministrador() {
		return this.administradores.listar();
	}

	public void removerAdministrador(String cpf) throws ErroDeNegocioException {
		this.administradores.remover(cpf);
	}

	public void cadastrarCompra(Compra compra) throws ErroDeNegocioException {
		this.compras.cadastrar(compra);
	}

	public void atualizarCompra(Compra compra) throws ErroDeNegocioException {
		this.compras.atualizar(compra);
	}

	public Compra procurarCompra(String codigoPedido) {
		return this.procurarCompra(codigoPedido);
	}

	public ArrayList<Compra> listarCompras() {
		return this.compras.listar();
	}

	public void removerCompras(String codigoPedido) throws ErroDeNegocioException {
		this.compras.remover(codigoPedido);
	}

	public void cadastrarFornecedor(Fornecedor fornecedor) throws ErroDeNegocioException {
		this.fornecedores.cadastrar(fornecedor);
	}

	public void atualizarFornecedor(Fornecedor fornecedor) throws ErroDeNegocioException {
		this.fornecedores.atualizar(fornecedor);
	}

	public Fornecedor procurarFornecedor(String cnpj) throws ErroDeNegocioException {
		return this.fornecedores.procurar(cnpj);
	}

	public ArrayList<Fornecedor> listarFornecedor() {
		return this.fornecedores.listar();
	}

	public void removerFornecedor(String cnpj) throws ErroDeNegocioException {
		this.fornecedores.remover(cnpj);
	}

	public void cadastrarFuncionario(Funcionario funcionario) throws ErroDeNegocioException {
		this.funcionarios.cadastrar(funcionario);
	}

	public void atualizarFunciona(Funcionario funcionario) throws ErroDeNegocioException {
		this.funcionarios.atualizar(funcionario);
	}

	public Funcionario procurarFuncionario(String cpf) throws ErroDeNegocioException {
		return this.funcionarios.procurar(cpf);
	}

	public ArrayList<Funcionario> listarFuncionario() {
		return this.funcionarios.listar();
	}

	public void removerFuncionario(String cpf) throws ErroDeNegocioException {
		this.funcionarios.remover(cpf);
	}

	public void cadastrarItem(Item item) throws ErroDeNegocioException {
		this.itens.cadastrar(item);
	}

	public void atualizarItem(Item item) throws ErroDeNegocioException {
		this.itens.atualizar(item);
	}

	public Item procurarItem(String codigoProduto) throws ErroDeNegocioException {
		return this.itens.procurar(codigoProduto);

	}

	public ArrayList<Item> listarItem() {
		return this.itens.listar();
	}

	public void removerItem(String codigoProduto) throws ErroDeNegocioException {
		this.itens.remover(codigoProduto);
	}
	
	
	public void cadastrarVenda(Venda venda) throws ErroDeNegocioException {
		this.vendas.cadastrar(venda);
	}

	public void atualizarVenda(Venda venda) throws ErroDeNegocioException {
		this.vendas.atualizar(venda);
	}

	public Venda procurarVenda(String codigoVenda) throws ErroDeNegocioException {
		return this.vendas.procurar(codigoVenda);
	}

	public ArrayList<Venda> listarVenda() {
		return this.vendas.listar();
	}

	public void removerVenda(String codigoVenda) throws ErroDeNegocioException {
		this.vendas.remover(codigoVenda);
	}
	
	public boolean efetuarLogin(String cpf, String senha) {
		return this.logins.efetuarLogin(cpf, senha);
	}
	
}
