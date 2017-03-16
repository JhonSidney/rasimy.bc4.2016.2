package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.IRepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class ControladorLogin {

	private IRepositorioAdministrador administrador;
	private IRepositorioFuncionario funcionario;

    public ControladorLogin() {
		this.administrador = RepositorioAdministrador.getInstance();
		this.funcionario = RepositorioFuncionario.getInstance();
	}

	 
	public boolean efetuarLogin(String cpf, String senha) {
		boolean igual = false;
		Administrador a = this.administrador.procurar(cpf);
		Funcionario f = this.funcionario.procurar(cpf);

		if (a != null && a.getSenha().equals(senha)) {
			igual = true;
		} else if (f != null && f.getSenha().equals(senha)) {
			igual = true;
		}

		return igual;
	}

}
