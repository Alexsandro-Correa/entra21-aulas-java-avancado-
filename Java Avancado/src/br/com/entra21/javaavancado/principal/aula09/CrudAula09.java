package br.com.entra21.javaavancado.principal.aula09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface CrudAula09<G> {

		ArrayList<String> options = new ArrayList<>(Arrays.asList("List","Add","Delete"));
	
		public void list(HashMap<String, G> lista);

		public void add();

		public G captureValues();

		public G captureKey();

		public void delete(G chave);
	
}

