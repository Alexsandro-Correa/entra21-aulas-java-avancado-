package br.com.entra21.javaavancado.principal;

public class Esporte {

	private String esporte;
	private String acessorio;
	
	public Esporte() {
		
	}
	
	public Esporte(String esporte, String acessorio) {
		super();
		this.esporte = esporte;
		this.acessorio = acessorio;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	
	
}
