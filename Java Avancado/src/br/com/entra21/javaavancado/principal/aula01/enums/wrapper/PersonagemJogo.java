package br.com.entra21.javaavancado.principal.aula01.enums.wrapper;

public enum PersonagemJogo {

	BARBARO(1000, "Muito HP"), // Barbaro
	ANAO(100, "Ferreiro"), // Anão
	DRUIDA(50, "Suporte"), // Druída
	SACERDOTE(10, "Cura e Corre"); // Sacerdote

	private final int VIDA;
	private final String DESCRICAO;

	private PersonagemJogo(int vida, String descricao) {
		this.VIDA = vida;
		this.DESCRICAO = descricao;

	}

	public int getVIDA() {
		return VIDA;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public String getDetails() {
		return "Veja a descrição completa do " + this.name() + " sua vida é "
				+ this.VIDA + " e sua característica é " + this.DESCRICAO;
	}
}
