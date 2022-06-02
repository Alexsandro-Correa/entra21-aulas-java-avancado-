package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {
			System.out.println("Escolha uma das opções:\n");
			System.out.println("0 - Voltar ao menu pricipal");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Volte sempre quando quiser aprender collections - list\n");

	}

	private static void aprenderArrayList() {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Alex");
		nomes.add("Ariana");
		nomes.add("Arthur");
		nomes.add(0, "primeiro");
		System.out.println("Quantos nomes? : " + nomes.size());
		
		for(String item : nomes) {
			System.out.println("O nome no momento é " + item);
		}
		
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));
		}
		
		System.out.println("O primeiro nome é " + nomes.get(0));
		System.out.println("O quarto nome é " + nomes.get(3));
		
		nomes.set(3, "Arthur atualizado");
		System.out.println("O quarto nome é " + nomes.get(3));
		
		//Atualizar valor da posição da Array
		nomes.set(0, nomes.get(2));
		System.out.println("O primeiro nome é " + nomes.get(0));
		
		//Acessar posição Array
		System.out.println("Onde será que está a Ariana? " + nomes.indexOf("Ariana"));
		
		//Deletar índice da Array
		System.out.println("Vou deletar quem estiver no índice 3 " + nomes.get(3) + "\n");
		nomes.remove(3); //removendo o item no índice 2
		nomes.remove(nomes.indexOf("Ariana")); // removendo de forma dinâmica
		
		//Criar uma lista de interesses
		//Inclua 5 interesses
		//Liste todos os interesses
		//Dessa lista escolha 2 para mostrar que são seus favoritos
		//Exclua um item por posição e outro por valor
		//Um syso para cada ação dessa
		
		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("Futebol");
		interesses.add("Séries");
		interesses.add("Programação");
		interesses.add("Jogos");
		interesses.add("Filmes");
		
		System.out.println("Tenho interesse em:");
		for (String item : interesses) {
			System.out.println("\t" + item);
		}
		
		System.out.println("\nDesses, meus favoritos são " + interesses.get(2) + " e " + interesses.get(3));
		
		System.out.println("\nTenho menos interesse em " + interesses.get(0) + " e Filmes, por isso vou exclui-los.\n");
		interesses.remove(0);
		interesses.remove(interesses.indexOf("Filmes"));
	}

	private static void aprenderLinkedList() {

	}

}
