package br.com.entra21.javaavancado.principal.aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.entra21.javaavancado.principal.Aula;
import br.com.entra21.javaavancado.principal.Pessoa;

public class Aula08 extends Aula {

	public Aula08(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();

		switch (option) {

		case 1:
			aprenderListar();
			break;

		case 2:
			aprenderFiltar();
			break;

		case 3:
			aprenderEstat�sticas();

		case 4:
			aprenderOrdenar();
			break;
		}

		return option;
	}

	private void aprenderListar() {

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 5, 6, 10, 15, 19));
		ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Alexsandro", "Correa", "Rosa", "Matos"));

		System.out.println("Listando de forma muito resumida:");
		numeros.forEach(System.out::println);

		System.out.println("Listando de forma normal:");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("Listando nomes de forma resumida:");
		nomes.forEach(System.out::println);

		System.out.println("Listando nomes de forma normal:");
		for (String nome : nomes) {
			System.out.println(nome);

		}

		System.out.println("Listando utilizando Arrow -> , quando executa apenas uma instru��o n�o precisa de escopo");
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println(
				"Listando utilizando Arrow -> , quando executa mais de uma instru��o � necess�rio declarar o escopo");
		nomes.forEach(nome -> {

			System.out.println(nome);
			System.out.println("[" + nome + "]");

		});
	}

	private void aprenderFiltar() {

		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Alex", (byte) 24));
		pessoas.add(new Pessoa("Jo�o", (byte) 15));
		pessoas.add(new Pessoa("Roberto", (byte) 33));
		pessoas.add(new Pessoa("Maria", (byte) 12));
		pessoas.add(new Pessoa("Cris", (byte) 30));

		pessoas.forEach(pessoa -> {
			System.out.println("Nome: " + pessoa.getNome() + " \tIdade: " + pessoa.getIdade());
		});

		System.out.println(
				"--------------------Percorrendo a lista e filtrando apenas os menores de idade--------------");

		List<Pessoa> pessoasNovas = pessoas.stream() // Gera um stream para a minha lista, uma c�pia que n�o afeta a
														// lista original
				.filter(pessoa -> pessoa.getIdade() < 18) // O filter vai filtrar com base no meu crit�rio criando uma
															// vari�vel tempor�ria que � verificada a cada item
				.collect(Collectors.toList()); // Os itens resultantes ser�o convertidos em uma lista

		pessoasNovas.forEach(pessoa -> {
			System.out.println("Essa pessoa � de menor.");
			System.out.println("Nome: " + pessoa.getNome() + " \tIdade: " + pessoa.getIdade());
		});

		System.out.println(
				"--------------------Percorrendo a lista e filtrando apenas os menores de idade (sem lambda) --------------");

		ArrayList<Pessoa> pessoasMenores = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 18) {
				pessoasMenores.add(pessoa);
			}

		}

		for (Pessoa pessoa : pessoasMenores) {
			System.out.println("Essa pessoa � de menor.");
			System.out.println("Nome: " + pessoa.getNome() + " \tIdade: " + pessoa.getIdade());
		}

		System.out.println(
				"-------------- Filtrando nomes que terminam com a letra  O ou � maior de idade. ------------");

		pessoas.stream().filter(pessoa -> pessoa.getNome().endsWith("o") || pessoa.getIdade() >= 18 // condi��es do
																									// filter
		).forEach(pessoa -> {

			System.out.println("Essa pessoa termina com a letra 'o' ou � maior de idade.");
			System.out.println("Nome: " + pessoa.getNome() + " \tIdade: " + pessoa.getIdade());

		});

	}

	private void aprenderEstat�sticas() {

		ArrayList<Double> notas = new ArrayList<>(Arrays.asList(8.5d, 7.5d, 10d));
		notas.forEach(System.out::println);
		DoubleSummaryStatistics estatisticas = notas.stream().mapToDouble((numero) -> numero).summaryStatistics();

		System.out.println("A soma das notas � " + estatisticas.getSum());
		System.out.println("A m�dia � " + estatisticas.getAverage());
		System.out.println("A menor nota � " + estatisticas.getMin());
		System.out.println("A maior nota � " + estatisticas.getMax());
		System.out.println("Quantidade de notas " + estatisticas.getCount());

	}

	private void aprenderOrdenar() {
		
	ArrayList<String> nomes = new ArrayList<>();
	nomes.add("Alex");
	nomes.add("Cris");
	nomes.add("Josy");
	nomes.add("Carlos");
	nomes.add("Cesar");
	
	System.out.println("Listando os nomes na ordem de cria��o");
	nomes.forEach(System.out :: println);
	
	System.out.println("Listando os nomes em ordem alfab�tica");
	nomes.sort(String :: compareTo);
	nomes.forEach(System.out :: println);
	
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	pessoas.add(new Pessoa("Alex", (byte) 24));
	pessoas.add(new Pessoa("Maria", (byte) 26));
	pessoas.add(new Pessoa("Carlos", (byte) 29));
	pessoas.add(new Pessoa("Jos�", (byte) 21));
	
	Collections.sort(pessoas, new Comparator<Pessoa>() {
		@Override
		public int compare(Pessoa pessoaA, Pessoa pessoaB) {
			return pessoaA.getNome().compareTo(pessoaB.getNome());
		}
	});
	
	System.out.println("-----------Imprimindo em ordem alfab�tica-------------");
	pessoas.forEach(pessoa ->{
		System.out.println(pessoa.getNome());
	});
	
	}

}
