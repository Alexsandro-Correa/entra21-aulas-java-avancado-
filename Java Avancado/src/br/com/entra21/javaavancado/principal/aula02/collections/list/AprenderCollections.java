package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {
			System.out.println("Escolha uma das op��es:\n");
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
				System.out.println("Escolha uma op��o v�lida");
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
			System.out.println("O nome no momento � " + item);
		}
		
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));
		}
		
		System.out.println("O primeiro nome � " + nomes.get(0));
		System.out.println("O quarto nome � " + nomes.get(3));
		
		nomes.set(3, "Arthur atualizado");
		System.out.println("O quarto nome � " + nomes.get(3));
		
		//Atualizar valor da posi��o da Array
		nomes.set(0, nomes.get(2));
		System.out.println("O primeiro nome � " + nomes.get(0));
		
		//Acessar posi��o Array
		System.out.println("Onde ser� que est� a Ariana? " + nomes.indexOf("Ariana"));
		
		//Deletar �ndice da Array
		System.out.println("Vou deletar quem estiver no �ndice 3 " + nomes.get(3) + "\n");
		nomes.remove(3); //removendo o item no �ndice 2
		nomes.remove(nomes.indexOf("Ariana")); // removendo de forma din�mica
		
		//Criar uma lista de interesses
		//Inclua 5 interesses
		//Liste todos os interesses
		//Dessa lista escolha 2 para mostrar que s�o seus favoritos
		//Exclua um item por posi��o e outro por valor
		//Um syso para cada a��o dessa
		
		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("Futebol");
		interesses.add("S�ries");
		interesses.add("Programa��o");
		interesses.add("Jogos");
		interesses.add("Filmes");
		
		System.out.println("Tenho interesse em:");
		for (String item : interesses) {
			System.out.println("\t" + item);
		}
		
		System.out.println("\nDesses, meus favoritos s�o " + interesses.get(2) + " e " + interesses.get(3));
		
		System.out.println("\nTenho menos interesse em " + interesses.get(0) + " e Filmes, por isso vou exclui-los.\n");
		interesses.remove(0);
		interesses.remove(interesses.indexOf("Filmes"));
	}

	private static void aprenderLinkedList() {

	}

}
