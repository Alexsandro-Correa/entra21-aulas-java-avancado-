package br.com.entra21.javaavancado.principal;

import java.util.Scanner;

import br.com.entra21.javaavancado.principal.aula01.enums.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
	}

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Obrigador por usar o programa Aulas JAVA Avançado.");
				break;

			case 1:
				aprenderWrapper();
				break;

			case 2:
				aprenderEnum();
				break;

			default:
				System.out.println("Digite uma opção válida.");
				break;

			}

		} while (option != 0);

	}

	private static String exibirMenu() {
		String menu = "Vamos aprender sobre conceitos avançados em JAVA!\n";
		menu += "\nEscolha uma das opções:";
		menu += "\n0 - Sair";
		menu += "\n1 - Wrapper";
		menu += "\n2 - Enum";

		return menu;
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
		System.out.println("Geralmente a classe " + PersonagemJogo.SACERDOTE + " tem HP = " + PersonagemJogo.SACERDOTE.getVIDA());
		
		System.out.println("A característica mais comum dele é " + PersonagemJogo.ANAO.getDESCRICAO());
		
		System.out.println("O druída está no índice no Enum " + PersonagemJogo.DRUIDA.ordinal());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.DRUIDA + " sua vida é "
		
				+ PersonagemJogo.DRUIDA.getVIDA() + " e sua característica é " + PersonagemJogo.DRUIDA.getDESCRICAO());
		System.out.println(PersonagemJogo.BARBARO.getDetails());
		
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			
			System.out.println("Contador = " + personagem + " posição do Enum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println("Hp = " + PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("---------------------------------------------------");
			
		}
	
				

	}
}
