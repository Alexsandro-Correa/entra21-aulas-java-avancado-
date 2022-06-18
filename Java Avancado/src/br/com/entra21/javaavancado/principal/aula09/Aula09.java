package br.com.entra21.javaavancado.principal.aula09;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.entra21.javaavancado.principal.Aula;
import br.com.entra21.javaavancado.principal.Esporte;
import br.com.entra21.javaavancado.principal.Main.DiasSemana;
import br.com.entra21.javaavancado.principal.Pessoa;

public class Aula09 extends Aula {

	static Scanner input = new Scanner(System.in);
	public static HashMap<String, Pessoa> pessoas = new HashMap<>();
	public static HashMap<String, Esporte> esportes = new HashMap<>();

	public Aula09(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

		if (pessoas.isEmpty()) {

			pessoas.put("Ricardo", new Pessoa("Ricardo", (byte) 26));
			pessoas.put("Rodolfo", new Pessoa("Rodolfo", (byte) 19));
			pessoas.put("Carla", new Pessoa("Carla", (byte) 23));

		}

		System.out.println("---------------------------");

		if (esportes.isEmpty()) {

			esportes.put("Futebol", new Esporte("Futebol", "Chuteira"));
			esportes.put("Baseball", new Esporte("Baseball", "Taco"));
			esportes.put("Tênis", new Esporte("Tênis", "Raquete"));
		}

	}

	public enum DiaSemana {

		DOMINGO("Dia mais sossegado."), SEGUNDA("Começa a peleia."), TERCA("Primeiro dia da semana com aula de JAVA."),
		QUARTA("Meio da semana."), QUINTA("Fim de semana é logo ali."), SEXTA("Sextou..."),
		SABADO("Folguinha merecida");

		private final String DESCRICAO;

		private DiaSemana(String descricao) {
			this.DESCRICAO = descricao;
		}

		public String getDESCRICAO() {
			return DESCRICAO;
		}

	}
	
	@MenuExerciciosAula09
	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();

		switch (option) {

		case 1:
			exercicioWrapper();
			break;

		case 2:
			exercicioENUM();
			break;

		case 3:
			exercicioLists();
			break;

		case 4:
			exercicioTime();
			break;

		case 5:
			exercicioDate();
			break;

		case 6:
			exercicioGenerics();
			break;

		case 7:
			exercicioExceptions();
			break;

		case 8:
			exercicioLambda();
			break;
		}

		return option;
	}

	private static void exercicioWrapper() {

		// Utilize as classes wrapper para inicializar todos os tipos primitivos de
		// variáveis

		byte idade = Byte.parseByte("24");
		short ano = Short.parseShort("2022");
		int premioMegaSena = Integer.parseInt("1500000");
		long cpf = Long.parseLong("00000033360");

		char inicialNome = Character.valueOf('A');

		boolean souAlto = Boolean.parseBoolean("False");

		float altura = Float.parseFloat("1.64");
		double salario = Double.parseDouble("23550.90");

		System.out.println(idade);
		System.out.println(ano);
		System.out.println(cpf);
		System.out.println(premioMegaSena);
		System.out.println(inicialNome);
		System.out.println(souAlto);
		System.out.println(altura);
		System.out.println(salario);

	}

	private static void exercicioENUM() {

		// Crie 2 tipos de enum
		// Enum apenas com o nome dos itens
		// Enum com atributos (Exemplo DiaSemana.SEGUNDA ) dia da preguiça...
		// Escolher um ENUM diretamente no código
		// Percorrer os itens como lista

		System.out.println("Meu dia da semana preferido é " + DiaSemana.SABADO);

		for (byte dias = 0; dias < DiasSemana.values().length; dias++) {
			System.out.println(
					dias + 1 + "º = " + DiaSemana.values()[dias] + " = " + DiaSemana.values()[dias].getDESCRICAO());
		}

	}

	private static void exercicioLists() {

		// 3 - Collections
		// Realize as 4 operações sem interação com usuário
		// ArrayList de String nomes
		// LinkedList de String interesses
		// HashSet de String capitaisBrasileiras
		// HashMap onde a chave é String e o Valor é String

		ArrayList<String> alunos = new ArrayList<String>();
		alunos.add("Alex");
		alunos.add("José");
		alunos.add("Maria");

		LinkedList<Float> notas = new LinkedList<>();
		notas.add(10f);
		notas.add(7.5f);
		notas.add(6.5f);

		HashSet<String> captaisBrasileiras = new HashSet<>();
		captaisBrasileiras.add("Florianópolis");
		captaisBrasileiras.add("Porto Alegre");
		captaisBrasileiras.add("Vitória");

		HashMap<String, String> perfil = new HashMap<>();
		perfil.put("Alexsandro", "Correa");
		perfil.put("José", "Carlos");
		perfil.put("Cristiana", "Santos");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("--------------------------------");

		for (Float nota : notas) {
			System.out.println(nota);

		}

		System.out.println("--------------------------------");

		for (String capitais : captaisBrasileiras) {
			System.out.println(capitais);

		}
		System.out.println("--------------------------------");

		System.out.println(perfil);

	}

	private static void exercicioTime() {

		// 4 - Datas - Computador
		// Utilize a classe Instant para guardar o momento que o programa iniciou
		// e outro Instant para guardar o momento que o programa finalizou
		// Informe a Duração com a Classe duration
		// OBS: entre as 2 ações inclua uma ação que demore
		// Exemplo: Syso pedindo o nome completo

		String nome;

		Instant timerIn = Instant.now();

		System.out.println("Digite seu nome completo: ");
		nome = input.next();

		Instant timerOut = Instant.now();

		Duration duracao = Duration.between(timerIn, timerOut);
		long duracaoEmSegundos = duracao.toSeconds();
		System.out.println(nome + " você levou " + duracaoEmSegundos + " segundos para digitar e confirmar.");

	}

	private static void exercicioDate() {

		// 5 - Datas - Humano
		// Sem interação do usuário informe 2 datas e calcule o período entre elas
		// OBS: Utilize a classe DateTimeFormatter para definir um padrão de
		// exibição para a data no formato dd/MM/yyyy
		// Sem interação com usuário informe 2 horários e calcule o período entre elas

		LocalTime now = LocalTime.now();
		LocalDateTime now2 = LocalDateTime.now();
		LocalDate today = LocalDate.now();
		LocalDate myBirthday = LocalDate.of(2022, 10, 29);
		DateTimeFormatter.ofPattern("dd-MM-YYYY").format(myBirthday);

		System.out.println((now) + " -- " + (now2));

		System.out.println(DateTimeFormatter.ofPattern("dd-MM-YYYY").format(today));

		Period falta = Period.between(today, myBirthday);

		System.out.println(
				"Falta " + falta.getMonths() + " meses e " + falta.getDays() + " dias para o meu aniversário.");

	}

	private static void exercicioGenerics() {

		Scanner input2 = new Scanner(System.in);
		byte option;
		ArrayList<String> options = new ArrayList<>(Arrays.asList("Pessoa", "Esporte"));

		System.out.println("Escolha uma opção");
		System.out.println("0 = Voltar");
		for (byte action = 0; action < options.size(); action++) {
			System.out.println((action + 1) + " = " + options.get(action));
		}

		option = input2.nextByte();

		switch (option) {

		case 0:
			System.out.println("Até a proxima!");
			break;

		case 1:
			new Aula09Crud1().gerenciar();
			break;

		case 2:
			new Aula09Crud2().gerenciar();
			break;

		default:
			System.out.println("Digite uma opção válida.");
			break;

		}

	}

	private static void exercicioExceptions() {

		byte idade;
		Scanner inputException = new Scanner(System.in);

		try {

			System.out.println("Digite sua idade:");
			idade = inputException.nextByte();

			if (idade < 0) {

				throw new IdadeImpossivelException();

			} else {
				System.out.println("Você tem " + idade + " anos.");
			}

		} catch (InputMismatchException e) {
			System.out.println("Digite sua idade apenas com números.");

		} catch (IdadeImpossivelException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void exercicioLambda() {

		ArrayList<Integer> megaSena = new ArrayList<>(Arrays.asList(8, 12, 26, 33, 50, 56));
		ArrayList<Aula09Pessoas> participantes = new ArrayList<>();
		participantes.add(new Aula09Pessoas("W.João", (byte) 33));
		participantes.add(new Aula09Pessoas("L.Carlos", (byte) 24));
		participantes.add(new Aula09Pessoas("W.Roberto", (byte) 19));
		participantes.add(new Aula09Pessoas("W.Cris", (byte) 30));
		participantes.add(new Aula09Pessoas("L.Alex", (byte) 24));

		System.out.println("Números Sorteados:");
		megaSena.forEach(System.out::println);

		System.out.println("------------------------------------");

		System.out.println("E os participantes são:");
		participantes.forEach(participante -> {
			System.out.println(participante.getNome());
		});

		System.out.println("-------------------------------------");
		System.out.println("Os vencedores são:");
		participantes.
		stream().
		filter(participante -> participante.getNome().startsWith("W")).
		collect(Collectors.toList()).
		forEach(participante -> {
					System.out.println(participante.getNome());
				});

		System.out.println("-------------------------------------");

		LinkedList<Pessoa> pessoas = new LinkedList<>();
		pessoas.add(new Pessoa("Alex", (byte) 24));
		pessoas.add(new Pessoa("Janaina", (byte) 33));
		pessoas.add(new Pessoa("Tayna", (byte) 16));
		pessoas.add(new Pessoa("Alexsandro", (byte) 36));
		pessoas.add(new Pessoa("Karine", (byte) 32));
		pessoas.add(new Pessoa("Antonio", (byte) 15));
		pessoas.add(new Pessoa("Juliano", (byte) 32));

		System.out.println("Percorrer a lista de pessoas:\n");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa.getNome());
		});

		System.out.println("----------------------------------------");
		pessoas.
		stream().
		filter(pessoa -> pessoa.getNome().startsWith("A")).
		collect(Collectors.toList()).
		forEach(pessoa -> {
					System.out.println(pessoa.getNome() + " começa com a letra 'A'");
				});
		;

		System.out.println("----------------------------------------");
		pessoas.
		stream().
		filter(pessoa -> pessoa.getNome().endsWith("o")).
		collect(Collectors.toList()).
		forEach(pessoa -> {
					System.out.println(pessoa.getNome() + " termina com a letra 'O'");
				});

		System.out.println("----------------------------------------");
		pessoas.
		stream().
		filter(pessoa -> pessoa.getIdade() < 18).
		collect(Collectors.toList()).
		forEach(pessoa -> {
			System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos, portanto, é menor de idade.");
		});

		System.out.println("----------------------------------------");
		pessoas.
		stream().
		filter(pessoa -> pessoa.getIdade() >= 18).
		collect(Collectors.toList()).
		forEach(pessoa -> {
			System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos, portanto, é maior de idade.");
		});

		System.out.println("----------------------------------------");
		pessoas.
		stream().
		filter(pessoa -> pessoa.getNome().endsWith("o") && pessoa.getIdade() > 30).
		collect(Collectors.toList()).
		forEach(pessoa -> {
					System.out.println(pessoa.getNome() + " tem mais de 30 anos e seu nome termina com a letra 'O'");
				});

	}

}
