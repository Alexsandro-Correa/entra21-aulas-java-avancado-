package br.com.entra21.javaavancado.principal.aula06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import br.com.entra21.javaavancado.principal.Aula;
import br.com.entra21.javaavancado.principal.Pessoa;
import br.com.entra21.javaavancado.principal.Repositorio;

public class Aula06 extends Aula implements ICrud<Pessoa> {

	public Aula06(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			aprenderGenerics();
			break;
		case 2:
			listar(Repositorio.pessoas);
			break;
			
		case 3:
			adicionar();
			break;

		case 4:
			editar(capturarChave());
			break;
			
		case 5:
			deletar(capturarChave());
			break;
			
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitulo());
			break;
		}
		return opcao;
	}

	private void aprenderGenerics() {
		System.out.println("Criar uma Interface onde o nome terá um sufixo <Letra>.");
		System.out.println("Essa letra é um parâmetro para quem implementa essa interface.");
		System.out.println(
				"Os métodos gerados que tinham essa letra serão substituídos pelo parâmetro informado pela classe.");

	}

	 @Override
	    public void listar(HashMap<String, Pessoa> lista) {
	        System.out.println("-----Listando Pessoas------");
	        for (Entry<String, Pessoa> pessoa : lista.entrySet()) {
	            System.out.println("Chave: "+pessoa.getKey()+ " \t\t"+pessoa.getValue().getNome()+"\t"+pessoa.getValue().getIdade());
	           
	        }
	        System.out.println("-------"+(lista.isEmpty()? "Lista vazia" : "Quantidade "+lista.size()) + "---------");
	        
	    }

	@Override
	public void adicionar() {
		
		Pessoa novo = capturarValores();
		if(buscar(novo) == null) {
			Repositorio.pessoas.put(novo.getNome(), novo);
		}else {
			System.out.println("Já existe alguém com a chave " + novo.getNome());
		}
		
	}

	@Override
	public Pessoa capturarValores() {
		
		Pessoa formulario = new Pessoa();
		System.out.println("Informe o nome: ");
		formulario.setNome(super.getEntrada().next());
		System.out.println("Informe a idade:");
		formulario.setIdade(super.getEntrada().nextByte());
		
		return formulario;
	}

	@Override
	public Pessoa buscar(Pessoa chave) {
		
		Pessoa busca = Repositorio.pessoas.get(chave.getNome());
		
		return busca;
	}

	@Override
	public Pessoa capturarChave() {
		
		Pessoa chave = new Pessoa();
		System.out.println("Informe o valor da chave:");
		chave.setNome(super.getEntrada().next());
		
		return chave;
	}

	@Override
	public void editar(Pessoa chave) {
		
		if(buscar(chave) != null) {
			
			Pessoa editado = capturarValores();
			Repositorio.pessoas.put(chave.getNome(), editado);
			
		}else {
			
			System.out.println("Não existe alguém com a chave " + chave.getNome());
			
		}
		
	}

	@Override
	public void deletar(Pessoa chave) {
		
		if(buscar(chave) != null) {
			
			Repositorio.pessoas.remove(chave.getNome());
			
		}else {
			System.out.println("Não existe ninguém com a chave " + chave.getNome());
		}
		
	}

	
	

	

	

}
