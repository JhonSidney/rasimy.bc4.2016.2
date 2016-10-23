package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class CadastroAdministrador {
	 
	 private RepositorioAdministrador repositorioAdm;
	 
	 public CadastroAdministrador(){
	  
	  this.repositorioAdm = new RepositorioAdministrador(100);//array do repositório adm
	 }

	 public void cadastrar(Administrador adm){
	  if(adm == null && this.equals(adm.getSenha())&& this.equals(adm.getId())){
		  this.repositorioAdm.cadastrar(adm);
	   
	  }
	 }
	
public Administrador procurar(String id){
	return this.repositorioAdm.procurar(id);
}
public boolean equals(String id){
	return this.repositorioAdm.equals(id);
}


}