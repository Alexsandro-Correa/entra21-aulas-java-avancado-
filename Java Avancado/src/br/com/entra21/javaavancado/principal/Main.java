package br.com.entra21.javaavancado.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.aula01.enums.wrapper.Aula01;
import br.com.entra21.javaavancado.principal.aula02.collections.list.Aula02;
import br.com.entra21.javaavancado.principal.aula03.Aula03;
import br.com.entra21.javaavancado.principal.aula04.Aula04;
import br.com.entra21.javaavancado.principal.aula05.Aula05;
import br.com.entra21.javaavancado.principal.aula06.Aula06;
import br.com.entra21.javaavancado.principal.aula07.Aula07;
import br.com.entra21.javaavancado.principal.aula08.Aula08;
import br.com.entra21.javaavancado.principal.aula09.Aula09;
import br.com.entra21.javaavancado.principal.aula09.ConteudosJavaAvancado;


public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
	}

	@ConteudosJavaAvancado
	public static void main (String[] args) {

		byte option;
		Repositorio.inicializarPessoas();

		do {
			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Obrigador por usar o programa Aulas JAVA Avançado.");
				break;
			
			case 1:
				new Aula01("Wrapper e ENUM",
				new ArrayList<>(Arrays.asList("Wrapper", "ENUM"))).aprender();;
				break;

			case 2:
				new Aula02("ArrayList e LinkedList",
				new ArrayList<>(Arrays.asList("ArrayList", "LinkedList"))).aprender();
				break;
				
			case 3:
				new Aula03("Dates e Annotations", 
				new ArrayList<>(Arrays.asList("Datas Humanizadas", "Datas Computadorizadas"))).aprender();
				break;
										
			case 4:
				new Aula04("HashSet e CRUD",
				new ArrayList<>(Arrays.asList("HashSet", "CRUD"))).aprender();
				break;
				
			case 5:
				new Aula05("Collections - MAP - HashMap",
				new ArrayList<>(Arrays.asList("Definir", "Create", "Read", "Update", "Delete","Exemplo prático"))).aprender();
				break;
				
			case 6:
				new Aula06("Generics",
				new ArrayList<>(Arrays.asList("Aprender Generics" , "Implementar CRUDS", "Adicionar Pessoa","Editar Pessoa", "Deletar Pessoa"))).aprender();;
				break;

			case 7:
				ArrayList<String> assuntos = new ArrayList<>();
				assuntos.add("Tratamento de Erro");
				assuntos.add("Obter Detalhes do Erro");
				assuntos.add("Custom Exception");
				
				new Aula07("Execeptions", assuntos).aprender();
				break;
				
			case 8:
				new Aula08("Lambda Functions",
				new ArrayList<>(Arrays.asList("Listar", "Filtrar", "Estatísticas", "Ordenação"))).aprender();
				break;
			
			case 9:
				new Aula09("Exercises", 
				new ArrayList<>(Arrays.asList("Wrapper","ENUM","Lists", "Time", "Date","Generics","Exceptions","Lambda"))).aprender();
				break;
				
			default:
				System.out.println("Digite uma opção válida.");
				break;

			}

		} while (option != 0);

	}

	private static String exibirMenu() {
		String menu = "Vamos aprender sobre conceitos avançados em JAVA!\n";
		menu += "\nEscolha uma das opções:\n";
		menu += "\n0 - Exit";
		menu += "\n1 - Wrapper e ENUM";
		menu += "\n2 - Collections-List";
		menu += "\n3 - Annotations and Dates";
		menu += "\n4 - HashSet and CRUD";
		menu += "\n5 - HashMap";
		menu += "\n6 - Genererics";
		menu += "\n7 - Exceptions";
		menu += "\n8 - Lambda Functions ";
		menu += "\n9 - Exercises";

		return menu;
	}
	
}
