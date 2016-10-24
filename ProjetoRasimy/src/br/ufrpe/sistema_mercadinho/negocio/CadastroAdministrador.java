package br.ufrpe.sistema_mercadinho.negocio;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;



public class CadastroAdministrador {

	private RepositorioAdministrador repositorioAdm;

	public CadastroAdministrador(){
		this.repositorioAdm = new RepositorioAdministrador(1000);//tamanho array do repositório adm
	}

	public void cadastrar(Administrador adm){
		if(adm != null && !this.equals(adm.getId())){
			this.repositorioAdm.cadastrar(adm);
		}else{
			//interface com usuario;
		}
	}

	public void atualizar(String id){
		Administrador administrador = this.repositorioAdm.procurar(id);
		if (administrador != null) {
			this.repositorioAdm.atualizar(id);
		} else {
			// interface com usuario
		}
	}

	public Administrador procurar(String id){
		return this.repositorioAdm.procurar(id);
	}
	public boolean existe(String id){
		return this.repositorioAdm.existe(id);
	}

	public void descadastrar (String id){
		Administrador administrador = this.repositorioAdm.procurar(id);

		if (administrador != null) {
			this.repositorioAdm.remover(id);
		} else {
			// Conta inexistente ou conta ainda ativa
		}
	}


}