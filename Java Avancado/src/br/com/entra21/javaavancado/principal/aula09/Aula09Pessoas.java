package br.com.entra21.javaavancado.principal.aula09;

public class Aula09Pessoas {

	private String nome;
	private byte idade;

	public Aula09Pessoas() {
		super();
	}

	public Aula09Pessoas(String nome, byte idade) {
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
