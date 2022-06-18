package br.com.entra21.javaavancado.principal.aula04;

import java.util.ArrayList;
import java.util.HashSet;
import br.com.entra21.javaavancado.principal.Aula;

public class Aula04 extends Aula {

	public Aula04(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();

		switch (option) {

		case 1:
			aprenderHashSet();
			break;

		case 2:
			aprenderCRUD();
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}

		return option;

	}

	private static void aprenderHashSet() {

		HashSet<String> linguagens = new HashSet<>();
		System.out.println("Quantidade de itens na minha lista " + linguagens.size());
		System.out.println("Minha lista está vazia? " + linguagens.isEmpty());
		System.out.println("Minha lista está vazia? " + (linguagens.isEmpty() ? "sim" : "não"));

	}

	private static void aprenderCRUD() {

		HashSet<String> linguagens = new HashSet<>();
		// CREATE
		System.out.println("------CREATE------");
		linguagens.add("JAVA");
		linguagens.add("C#");
		linguagens.add("Pyton");
		System.out.println(linguagens);
		linguagens.add("JAVA");
		linguagens.add("Java");
		System.out.println(linguagens);

		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(1);
		System.out.println(numeros);

		for (Integer numero : numeros) {

			System.out.println(numero);

		}

		// READ
		System.out.println("------READ------");
		for (String linguagem : linguagens) {

			System.out.println("Linguagem = " + linguagem);

		}

		System.out.println("Java existe na minha lista? " + linguagens.contains("Java")); // contains = tem
		System.out.println("SQL existe na minha lista?" + linguagens.contains("SQL"));

		// READ buscar

		String busca = "";

		for (String linguagem : linguagens) {

			if (linguagem.equals("C#")) {
				System.out.println("Escontrei ele ");
				busca = linguagem;

				break;
			}

		}

		System.out.println(busca);

		// UPDATE

		System.out.println("--------UPDATE-------");
		System.out.println("Lista antes " + linguagens);
		linguagens.remove("Java");
		linguagens.add("Java2");
		System.out.println("Lista depois " + linguagens);

		// DELETE

		System.out.println("--------DELETE-------");
		System.out.println("Lista antes " + linguagens);
		linguagens.remove("C#2");
		System.out.println("Lista depois " + linguagens);
	}

}
