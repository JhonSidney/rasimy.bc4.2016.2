package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class CadastroLogin {

	private RepositorioAdministrador adm;
	private RepositorioFuncionario func;

	public boolean efetuarLogin(String id, String senha){
		boolean igual = false;
		if(adm.existe(id)){
			Administrador administrador = null;
			administrador = adm.procurar(id);
			if(senha.equals(administrador.getSenha())){
				igual = true;
				return igual;
			}
		}
		if(func.existe(id)){
			Funcionario funcionario = null;
			funcionario = func.procurar(id);
			if(senha.equals(funcionario.getSenha())){
				igual = true;
				return igual;
			}	
		}else{
			//interface usuario retornar mensagem de erro de login
		}

		return igual;
	}


}
