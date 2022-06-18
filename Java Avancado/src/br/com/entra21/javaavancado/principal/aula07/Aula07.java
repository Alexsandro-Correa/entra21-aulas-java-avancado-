package br.com.entra21.javaavancado.principal.aula07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.Aula;

public class Aula07 extends Aula {

	public Aula07(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte option = super.capturarOpcao();

		switch (option) {

		case 1:
			aprenderTratarErros();
			break;

		case 2:
			obterDetalheErro();
			break;

		case 3:
			usarCustomException();
			break;

		default:
			System.out.println("Op��o inv�lida para a Aula07.");
			break;
		}

		return option;
	}

	private void aprenderTratarErros() {

		Scanner input = new Scanner(System.in);

		try { // Tentar executar o c�digo
			System.out.println("Informe um n�mero n�o muito alto, por favor");
			byte naoEstouPreparado = input.nextByte();
		} catch (InputMismatchException e) { // caso d� erro,executa o que tem dentro do catch

			System.out.println("N�o vou parar o projeto por causa desse erro."); // mensagem de erro
			System.out.println("Voc� vai capturar at� dar certo.");
			aprenderTratarErros();
		}

	}

	private void obterDetalheErro() {

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("INFORME UM VALOR PEQUENO");
			byte estouPreparado = input.nextByte();
		} catch (InputMismatchException e) {

			System.out.println("Voc� n�o sabia, mas eu estava preparado para essa situa��o: " + e.getMessage() + " ou "
					+ e.getCause());

		}

	}

	private void usarCustomException() {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Informe sua data de nascimento no formato YYYY-MM-DD: ");
			LocalDate dataNascimento = LocalDate.parse(input.next());
			
			if(dataNascimento.isAfter(LocalDate.now())) {
				throw new DataFuturaNaoPermitidaException(); // trow = lan�ar
			}
			
			if(dataNascimento.isEqual(LocalDate.now())) {
				throw new DataFuturaNaoPermitidaException("Voc� nasceu hoje?");
			}
			
		} catch (DateTimeParseException e) {
			System.out.println("Tem alguma coisa errada com essa data, motivo: " + e.getMessage());
			
		}catch(DataFuturaNaoPermitidaException e) {
			System.out.println(e.getMessage());
		}

	}

}
