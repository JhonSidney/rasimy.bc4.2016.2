package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;

public class RepositorioAdministrador implements IRepositorioAdministrador, Serializable {

	private ArrayList<Administrador> administradores;
	public static RepositorioAdministrador instancia;

	private RepositorioAdministrador() {
		this.administradores = new ArrayList<Administrador>();
	}

	public static RepositorioAdministrador getInstance() {

		if (instancia == null) {
			instancia = new RepositorioAdministrador();
		}
		return instancia;
	}

	public static RepositorioAdministrador lerDoArquivo() throws IOException {

		RepositorioAdministrador instanciaLocal = null;
		File in = new File("arquivos\\cadastroAdministradores\\administradores.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioAdministrador) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioAdministrador();
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
		File out = new File("arquivos\\cadastroAdministradores\\administradores.dat");
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
	public boolean cadastrar(Administrador adm) {
		this.administradores.add(adm);
		return true;
	}

	@Override
	public boolean atualizar(Administrador adm) {

		int i = 0;
		for (Administrador a : this.administradores) {
			i++;
			if (a.getCpf().equals(adm.getCpf())) {
				this.administradores.add(i, adm);
				return true;
			}
		}

		return false;
	}

	@Override
	public Administrador procurar(String cpf) {

		for (Administrador a : this.administradores) {
			if (a.getCpf().equals(cpf)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Administrador> listar() {
		return this.administradores;

	}

	@Override
	public boolean remover(String cpf) {

		int i = 0;
		for (Administrador a : this.administradores) {
			i++;
			if (a.getCpf().equals(cpf)) {
				this.administradores.remove(i);
				return true;
			}
		}
		return false;
	}

}