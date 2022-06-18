package br.com.entra21.javaavancado.principal.aula09;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import br.com.entra21.javaavancado.principal.Esporte;

public class Aula09Crud2 implements CrudAula09<Esporte> {

	private Scanner input = new Scanner(System.in);

	public byte gerenciar() {
		byte opcao;

		do {

			System.out.println("0 = Voltar");

			for (byte action = 0; action < options.size(); action++) {
				System.out.println((action + 1) + " = " + options.get(action));
			}

			opcao = input.nextByte();
			switch (opcao) {

			case 1:
				list(Aula09.esportes);
				return gerenciar();

			case 2:
				add();
				return gerenciar();

			case 3:
				delete(captureKey());
				return gerenciar();

			}
			// 1 override que aproveita o meu código
			// é como se ele tivesse sido escrito aqui.
			return opcao;

		} while (opcao != 0);
		
	}

	@Override
	public void list(HashMap<String, Esporte> lista) {
		System.out.println("-----Listando Pessoas------");
		for (Entry<String, Esporte> pessoa : lista.entrySet()) {
			System.out.println("Chave: " + pessoa.getKey() + " \t\t" + pessoa.getValue().getEsporte() + "\t"
					+ pessoa.getValue().getAcessorio());

		}
		System.out.println("-------" + (lista.isEmpty() ? "Lista vazia" : "Quantidade " + lista.size()) + "---------");

	}

	@Override
	public void add() {

		Esporte novo = captureValues();
		Aula09.esportes.put(novo.getEsporte(), novo);

	}

	@Override
	public Esporte captureValues() {

		Esporte forms = new Esporte();

		System.out.println("Informe o nome do esporte:");
		forms.setEsporte(input.next());

		System.out.println("Informe o acessório necessário para a prática desse esporte:");
		forms.setAcessorio(input.next());

		return forms;
	}

	@Override
	public Esporte captureKey() {

		Esporte forms = new Esporte();

		System.out.println("Informe a CHAVE:");
		forms.setEsporte(input.next());

		return forms;
	}

	@Override
	public void delete(Esporte chave) {

		Aula09.esportes.get(chave.getEsporte());
		Aula09.esportes.remove(chave.getAcessorio());

	}

}
