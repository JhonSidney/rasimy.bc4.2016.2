package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario, Serializable {

	// ATRIBUTOS
	private ArrayList<Funcionario> funcionarios;
	public static RepositorioFuncionario instancia;

	private RepositorioFuncionario() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public static RepositorioFuncionario getInstance() {

		if (instancia == null) {
			instancia = new RepositorioFuncionario();
		}
		return instancia;
	}

	public static RepositorioFuncionario lerDoArquivo() throws IOException {

		RepositorioFuncionario instanciaLocal = null;
		File in = new File("arquivos\\cadastroFuncionarios\\funcionarios.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioFuncionario) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioFuncionario();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					/* Silence exception */
				}
			}
		}
		return instanciaLocal;
	}

	public void salvarArquivo() {
		if (instancia == null) {
			return;
		}
		File out = new File("arquivos\\cadastroFuncionarios\\funcionarios.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instancia);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					/* Silent */}
			}
		}
	}

	@Override
	public boolean cadastrar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		return true;
	}

	@Override
	public boolean atualizar(Funcionario funcionario) {
		int i = 0;
		for (Funcionario f : this.funcionarios) {
			i++;
			if (f.getCpf().equals(funcionario.getCpf())) {
				this.funcionarios.add(i, funcionario);
				return true;
			}
		}
		return false;
	}

	@Override
	public Funcionario procurar(String cpf) {
		for (Funcionario f : this.funcionarios) {
			if (f.getCpf().equals(cpf)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Funcionario> listar() {

		return this.funcionarios;
	}

	@Override
	public boolean remover(String cpf) {
		int i = 0;
		for (Funcionario f : this.funcionarios) {
			i++;
			if (f.getCpf().equals(cpf)) {
				this.funcionarios.remove(i);
				return true;
			}
		}

		return false;
	}

}