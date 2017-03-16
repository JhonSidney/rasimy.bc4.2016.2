package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class RepositorioVenda implements IRepositorioVenda, Serializable {

	private ArrayList<Venda> vendas;
	public static RepositorioVenda instancia;

	private RepositorioVenda() {
		this.vendas = new ArrayList<Venda>();
	}

	public static RepositorioVenda getInstance() {

		if (instancia == null) {
			instancia = new RepositorioVenda();
		}
		return instancia;
	}

	public static RepositorioVenda lerDoArquivo() throws IOException {

		RepositorioVenda instanciaLocal = null;
		File in = new File("arquivos\\cadastroVendas\\vendas.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioVenda) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioVenda();
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
		File out = new File("arquivos\\cadastroVendas\\vendas.dat");
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
	public boolean cadastrar(Venda venda) {
		this.vendas.add(venda);
		return true;
	}

	@Override
	public boolean atualizar(Venda venda) {
		int i = 0;
		for (Venda v : this.vendas) {
			i++;
			if (v.getCodigoVenda().equals(venda.getCodigoVenda())) {
				this.vendas.add(i, venda);
				return true;
			}
		}
		return false;
	}

	@Override
	public Venda procurar(String codigoVenda) {
		for (Venda v : this.vendas) {
			if (v.getCodigoVenda().equals(codigoVenda)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Venda> listar() {
		return this.vendas;
	}

	@Override
	public boolean remover(String codigoVenda) {
		int i = 0;
		for (Venda v : this.vendas) {
			i++;
			if (v.getCodigoVenda().equals(codigoVenda)) {
				this.vendas.remove(i);
				return true;
			}
		}
		return false;
	}

}