package br.com.entra21.javaavancado.principal;

import java.util.HashMap;

public class Repositorio  {

	public static HashMap<String, Pessoa> pessoas = new HashMap<>();

	public static void inicializarPessoas() {

		if (pessoas.isEmpty()) {
			pessoas.put("Alex", new Pessoa("Alex", (byte) 24));
			pessoas.put("Ciro", new Pessoa("Ciro", (byte) 30));
			pessoas.put("Lucas", new Pessoa("Lucas", (byte) 27));
		}

	}

}
