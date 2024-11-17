package Tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {

	private static ArrayList<Tarefa> tarefas = new ArrayList<>();
	private static int contagem_ide = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcoes;

		do {
			System.out.println("1.Adicionar Tarefas");
			System.out.println("2.Listar tarefas");
			System.out.println("3.Exluir tarefas");
			System.out.println("4.Sair");
			System.out.println("Escolha uma das opçoes: ");
			opcoes = scan.nextInt();
			scan.nextLine();
			switch (opcoes) {
			case 1 -> adicionartarefa(scan);
			case 2 -> listarTarefas();
			case 3 -> excluirTarefa(scan);
			case 4 -> System.out.println("Saindo...");
			default -> System.out.println("Opçao invalida");
			}
		} while (opcoes != 4);
		scan.close();
	}

	public static void adicionartarefa(Scanner scan) {

		System.out.print("Digite o titulo da tarefa: ");
		String titulo = scan.nextLine();
		System.out.print("Digite a descricao da tarefa: ");
		String descricao = scan.nextLine();
		System.out.print("Digite a data da tarefa: ");
		String data = scan.nextLine();

		Tarefa tarefa = new Tarefa(contagem_ide++, titulo, descricao, data);
		tarefas.add(tarefa);
		System.out.println("Tarefa adicionada com sucesso!!");

	}

	public static void listarTarefas() {

		if (tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada! ");
		} else {
			System.out.println("=========Tarefas cadastradas=========");
			for (Tarefa tarefas : tarefas) {
				System.out.println(tarefas);
			}
		}

	}

	public static void excluirTarefa(Scanner scan) {

		listarTarefas();
		if (!tarefas.isEmpty()) {
			System.out.println("Digite o id que deseja excluir: ");
			int id = scan.nextInt();
			boolean removido = tarefas.removeIf(tarefas -> tarefas.id == id);
			if (removido) {
				System.out.println("Tarefa excluida com sucesso!");
			} else {
				System.out.println("Tarefa nao encontrada!");
			}
		}

	}

}
