package br.com.entra21.javaavancado.principal.aula01.enums.wrapper;

import java.util.ArrayList;

import br.com.entra21.javaavancado.principal.Aula;
import br.com.entra21.javaavancado.principal.Main.DiasSemana;

public class Aula01 extends Aula {

	public Aula01(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();
		switch (option) {
		case 1:
			aprenderWrapper();
			break;
		case 2:
			aprenderEnum();
			break;

		default:
			System.out.println("Opção inválida para o menu de " + super.getTitulo());
			break;

		}

		return option;
	}

	private static void aprenderWrapper() {

		char letra = Character.valueOf('A');

		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiro1 = Byte.parseByte("127");
		short inteiro2 = Short.parseShort("128");
		int inteiro3 = Integer.parseInt("600000");
		long inteiro4 = Long.parseLong("15000000");

		float decimal1 = Float.parseFloat("1000.10");
		double decimal2 = Double.parseDouble("1500.65");

	}

	private static void aprenderEnum() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "não");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " " + DiasSemana.values()[dia]);
		}

		System.out.println("Gosto desse tipo de personagem " + PersonagemJogo.SACERDOTE);
		System.out.println(
				"Geralmente a classe " + PersonagemJogo.SACERDOTE + " tem HP = " + PersonagemJogo.SACERDOTE.getVIDA());

		System.out.println("A característica mais comum dele é " + PersonagemJogo.ANAO.getDESCRICAO());

		System.out.println("O druída está no índice no Enum " + PersonagemJogo.DRUIDA.ordinal());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.DRUIDA + " sua vida é "

				+ PersonagemJogo.DRUIDA.getVIDA() + " e sua característica é " + PersonagemJogo.DRUIDA.getDESCRICAO());
		System.out.println(PersonagemJogo.BARBARO.getDetails());

		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {

			System.out.println(
					"Contador = " + personagem + " posição do Enum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println("Hp = " + PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("---------------------------------------------------");

		}

		for (PersonagemJogo variavel : PersonagemJogo.values()) {
			System.out.println(variavel.ordinal() + " - " + variavel.name());
		}

		System.out.println("O druída está na posição " + PersonagemJogo.DRUIDA.ordinal());

	}

}
