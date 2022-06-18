package br.com.entra21.javaavancado.principal.aula09;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import br.com.entra21.javaavancado.principal.Pessoa;

public class Aula09Crud1 implements CrudAula09<Pessoa> {

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
				list(Aula09.pessoas);
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
	public void list(HashMap<String, Pessoa> lista) {
		System.out.println("-----Listando Pessoas------");
		for (Entry<String, Pessoa> pessoa : lista.entrySet()) {
			System.out.println("Chave: " + pessoa.getKey() + " \t\t" + pessoa.getValue().getNome() + "\t"
					+ pessoa.getValue().getIdade());

		}
		System.out.println("-------" + (lista.isEmpty() ? "Lista vazia" : "Quantidade " + lista.size()) + "---------");

	}

	@Override
	public void add() {

		Pessoa novo = captureValues();
		Aula09.pessoas.put(novo.getNome(), novo);
	}

	@Override
	public Pessoa captureValues() {

		Pessoa forms = new Pessoa();

		System.out.println("Informe seu nome:");
		forms.setNome(input.next());

		System.out.println("Informe sua idade:");
		forms.setIdade(input.nextByte());

		return forms;
	}

	@Override
	public Pessoa captureKey() {

		Pessoa forms = new Pessoa();

		System.out.println("Informe a CHAVE:");
		forms.setNome(input.next());

		return forms;
	}

	@Override
	public void delete(Pessoa chave) {
		
		Aula09.pessoas.get(chave.getNome());
		Aula09.pessoas.remove(chave.getNome());

	}

}
