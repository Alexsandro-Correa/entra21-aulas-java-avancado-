package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.Aula;

public class Aula02 extends Aula {

	

	public Aula02(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public byte capturarOpcao() {
		
		byte option = super.capturarOpcao();
		switch (option) {
		case 1:
			aprenderArrayList();
			break;
		case 2:
			aprenderLinkedList();
			break;
		
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitulo());
			break;
		}
		
		return option;
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

		LinkedList<String> nomes = new LinkedList<>();
		 

		System.out.println("---------------Inserindo itens no LINKED ------------------");
		nomes.add("Rubem");
		nomes.add("Fulano");
		nomes.addFirst("Teste");
		nomes.addLast("Ultimo");
		nomes.add(2, "Inserido");

		System.out.println("Quantos nomes? " + nomes.size());

		System.out.println("---------------Acessando itens no LINKED ------------------");
		System.out.println("Quem é o primeiro? " + nomes.getFirst());
		System.out.println("Quem é o segundo? " + nomes.get(1));
		System.out.println("Quem é o ultimo? " + nomes.getLast());

		System.out.println("---------------Percorrendo itens no LINKED com iteração em array------------------");
		System.out.println("Ordem de inserção");
		for (String nome : nomes) {
			System.out.println("nome = " + nome);
		}

		System.out.println("---------------Percorrendo itens no LINKED com index em array------------------");
		System.out.println("De forma inversa");
		for (int nome = nomes.size() - 1; nome >= 0; nome--) {

			System.out.println("(" + nome + ") cargo = " + nomes.get(nome));

		}

		System.out.println("---------------Removendo itens no LINKED ------------------");
		System.out.println("Removendo quem estava no indice 0 ou seja " + nomes.getFirst());
		nomes.removeFirst();// removi o item no indice 0

		System.out.println("Removendo quem tem o nome \"Fulano\" pelo valor, sem saber que esta no indice "
				+ nomes.indexOf("Fulano"));
		nomes.remove("Fulano");// remove o elemento que tiver esse valor, o indice será procurado

		System.out.println("---------------Percorrendo itens no LINKED com forEach------------------");
		nomes.forEach(nome -> {
			System.out.println("nome " + nome);
		});
	}

}
