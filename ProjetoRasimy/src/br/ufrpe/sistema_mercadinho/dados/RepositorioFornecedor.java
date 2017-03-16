package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;

public class RepositorioFornecedor implements IRepositorioFornecedor, Serializable {

	private ArrayList<Fornecedor> fornecedores;
	public static RepositorioFornecedor instancia;

	private RepositorioFornecedor() {
		this.fornecedores = new ArrayList<Fornecedor>();
	}

	public static RepositorioFornecedor getInstance() {

		if (instancia == null) {
			instancia = new RepositorioFornecedor();
		}
		return instancia;
	}

	public static RepositorioFornecedor lerDoArquivo() throws IOException {

		RepositorioFornecedor instanciaLocal = null;
		File in = new File("arquivos\\cadastroFornecedores\\fornecedores.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioFornecedor) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioFornecedor();
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
		File out = new File("arquivos\\cadastroFornecedores\\fornecedores.dat");
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
	public boolean cadastrar(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
		return true;
	}

	@Override
	public boolean atualizar(Fornecedor fornecedor) {
		int i = 0;
		for (Fornecedor f : this.fornecedores) {
			i++;
			if (f.getCnpj().equals(fornecedor.getCnpj())) {
				this.fornecedores.add(i, fornecedor);
				return true;
			}

		}
		return false;
	}

	@Override
	public Fornecedor procurar(String cnpj) {

		for (Fornecedor f : this.fornecedores) {
			if (f.getCnpj().equals(cnpj)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		return this.fornecedores;
	}

	@Override
	public boolean remover(String cnpj) {

		int i = 0;
		for (Fornecedor f : this.fornecedores) {
			i++;
			if (f.getCnpj().equals(cnpj)) {
				this.fornecedores.remove(i);
				return true;
			}
		}

		return false;
	}

}