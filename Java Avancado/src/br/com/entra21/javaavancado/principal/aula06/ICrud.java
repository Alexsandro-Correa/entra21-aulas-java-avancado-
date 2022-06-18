package br.com.entra21.javaavancado.principal.aula06;

import java.util.HashMap;

public interface ICrud<G> {

	public void listar(HashMap<String, G> lista);
	public void adicionar();
	public G capturarValores();
	public G buscar(G chave);
	public G capturarChave();
	public void editar(G chave);
	public void deletar(G chave);
	

}
