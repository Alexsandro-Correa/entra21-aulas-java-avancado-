package br.com.entra21.javaavancado.principal.aula09;

public class IdadeImpossivelException extends Exception {

	public IdadeImpossivelException() {
		super("Você tem idade negativa?");
		
	}

	public IdadeImpossivelException(String mensagem) {
		super(mensagem);
		
	}
	
}

