package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;



public class CadastroAdministrador {

	private IRepositorioAdministrador repositorioAdm;

	public CadastroAdministrador(IRepositorioAdministrador instancia){
		this.repositorioAdm = instancia;
	}

	public void cadastrarAdministrador(Administrador adm){
		if(adm != null && !this.existeAdministrador(adm.getId())){
			this.repositorioAdm.cadastrar(adm);
		}else{
			//interface com usuario;
		}
	}

	public void atualizarAdministrador(Administrador adm){
		if(adm != null && !this.existeAdministrador(adm.getId())){
			this.repositorioAdm.atualizar(adm);
		}
	}

	public Administrador procurarAdministrador(String id){
		return this.repositorioAdm.procurar(id);
	}
	
	public void listarAdministrador(){
		this.repositorioAdm.listar();
	}

	

	public boolean existeAdministrador(String id){
		return this.repositorioAdm.existe(id);
	}
	


	public void descadastrarAdministrador (String id){
		Administrador administrador = this.repositorioAdm.procurar(id);

		if (administrador != null) {
			this.repositorioAdm.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}


}