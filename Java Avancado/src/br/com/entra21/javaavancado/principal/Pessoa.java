package br.com.entra21.javaavancado.principal;

public class Pessoa {// modelo de unidade pessoa

	private String nome;
	private byte idade;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, byte idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

}
