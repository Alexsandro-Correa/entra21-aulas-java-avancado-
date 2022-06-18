package br.com.entra21.javaavancado.principal.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.entra21.javaavancado.principal.Aula;
import br.com.entra21.javaavancado.principal.aula03.assuntos.Lembrete;

public class Aula03 extends Aula {

	
	public Aula03(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	static Scanner input = new Scanner(System.in);

	@Lembrete(value = "Datas e Annotations") // <--- Anotações

	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();

		switch (option) {

		case 1:
			aprenderDatasComputador();
			break;

		case 2:
			aprenderDatasHumanizadas();
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}

		return option;

	}

	private static void aprenderDatasComputador() {

		Instant inicio = Instant.now();

		System.out.println("Escolha um número aleatório:");
		long numero = input.nextLong();

		Instant fim = Instant.now();

		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Você demorou " + tempo.toSeconds() + " segundos para escolher o número " + numero);
		System.out.println("Para datas, levamos " + tempo.toSeconds() + " segundos.");
	}

	

	private static void aprenderDatasHumanizadas() {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate nascimento = LocalDate.of(1997, 10, 29);
		System.out.println(nascimento);

		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
		System.out.println("Essa quinta é igual a " + essaQuinta);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY");
		System.out.println(formatter.format(nascimento));

		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));

		Period vida = Period.between(nascimento, hoje);
		System.out.println("Durante minha vida já gastei " + vida.getYears() + " anos, " + vida.getMonths()
				+ " meses e " + vida.getDays() + " dias.");

		LocalTime intervalo = LocalTime.of(20, 0); // Primeiro hora, depois minutos
		LocalTime finalAula = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);

		System.out.println("Fomos para o intervalo às " + intervalo + " , fizemos a avaliação da aula às " + avaliacao
				+ " e a aula terminou às " + finalAula);

	}

}
