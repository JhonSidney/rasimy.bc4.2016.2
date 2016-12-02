package br.ufrpe.sistema_mercadinho.dados;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class RepositorioFuncionario {

	private Funcionario[] funcionarios;
	private int qtdFuncionarios;


	public RepositorioFuncionario(int tamanho){
		this.funcionarios = new Funcionario[tamanho];
		this.qtdFuncionarios = 0; 

	}

	public Funcionario[] getFuncionarios() {
		return this.funcionarios;
	}

	public int getQtdFuncionarios() {
		return this.qtdFuncionarios;
	}

	public void cadastrar(Funcionario funcionario){
		this.funcionarios[qtdFuncionarios] = funcionario;
		this.qtdFuncionarios++;
		if(this.qtdFuncionarios ==  this.funcionarios.length){
			this.duplicaArrayFuncionarios();
		}
	}


	public void atualizar(Funcionario funcionario){
		int indice = this.procurarIndice(funcionario.getId());
		if(indice != qtdFuncionarios){
			this.funcionarios[indice] = funcionario;
		}else{
			//
		}
	}


	public Funcionario procurar(String id){
		int indice = this.procurarIndice(id);
		Funcionario resultado = null;
		if(indice != this.qtdFuncionarios){
			resultado = this.funcionarios[indice];
		}
		return resultado;
	}

	public void listar(){
		for(int i=0; i< this.qtdFuncionarios;i++){
			System.out.println(""+funcionarios[i]);
		}
	}

	public void remover(String id){
		
		int indice = this.procurarIndice(id);
		if(indice != this.qtdFuncionarios){
			this.funcionarios[indice] = this.funcionarios[this.qtdFuncionarios - 1];
			this.funcionarios[this.qtdFuncionarios - 1] = null;
			this.qtdFuncionarios = this.qtdFuncionarios - 1;
		}else{
			//
		}

	}


	private int procurarIndice(String id) {
		int indice = 0;
		boolean achou = false;
		while ((!achou) && (indice < this.qtdFuncionarios)) {
			if (id.equals(this.funcionarios[indice].getId())) {
				achou = true;
			} else {
				indice++;
			}
		}
		return indice;
	}	


	private void duplicaArrayFuncionarios() {

		if (this.funcionarios != null && this.funcionarios.length > 0) {
			Funcionario[] arrayDuplicado = new Funcionario[this.funcionarios.length * 2];

			for (int i = 0; i < this.funcionarios.length; i++) {
				arrayDuplicado[i] = this.funcionarios[i];
			}
			this.funcionarios = arrayDuplicado;
		}

	}

	
	public boolean existe(String id){
		boolean existe = false;
		int indice = this.procurarIndice(id);
		if(indice != this.qtdFuncionarios){
			existe = true;
		}
		return existe;
	}
}