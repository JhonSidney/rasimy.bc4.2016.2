package br.ufrpe.sistema_mercadinho.dados;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class RepositorioAdministrador implements IRepositorioAdministrador{
 
	private ArrayList<Administrador> administradores;
	private int qtdAdministradores;
	public static RepositorioAdministrador instancia;
	
	private RepositorioAdministrador(){
		this.administradores = new ArrayList<Administrador>();
	}
	
	public static RepositorioAdministrador getInstance() {

		if(instancia == null){
			instancia = new RepositorioAdministrador();
		}
	    return instancia;
	  }
	


	public ArrayList<Administrador> getAdministradores() {
		return administradores;
	}

	public void cadastrar(Administrador adm){
		this.administradores.add(adm);
	}


	public void atualizar(Administrador adm){
		int indice = this.procurarIndice(adm.getId());
		if(indice != qtdAdministradores){
			this.administradores[indice] = adm;
		}
		
	}

	public Administrador procurar(String id){
		int indice = this.procurarIndice(id);
		Administrador resultado = null;
		if(indice != this.qtdAdministradores){
			resultado = this.administradores[indice];
		}
		return resultado;
	}

	public  listar(){
		for(int i=0; i< this.qtdAdministradores;i++){
			System.out.println(""+administradores[i]);
		}
	}

	public void remover(String id){
		int indice = this.procurarIndice(id);
		if(indice != this.qtdAdministradores){
			this.administradores[indice] = this.administradores[this.qtdAdministradores - 1];
			this.administradores[this.qtdAdministradores - 1] = null;
			this.qtdAdministradores = this.qtdAdministradores - 1;	
		}
	}


	private int procurarIndice(String id) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdAdministradores)) {
			if (id.equals(this.administradores[indice].getId())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayAdministradores() {

		if (this.administradores != null && this.administradores.length > 0) {
			Administrador[] arrayDuplicado = new Administrador[this.administradores.length * 2];

			for (int i = 0; i < this.administradores.length; i++) {
				arrayDuplicado[i] = this.administradores[i];
			}
			this.administradores = arrayDuplicado;
		}

	}

	
	public boolean existe(String id){
		boolean existe = false;
		int indice = this.procurarIndice(id);
		if(indice != this.qtdAdministradores){
			existe = true;
		}
		return existe;
	}
}