package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exc_Pilha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();

		int opcao = 4;
		String nomeLivro;
		do {
			System.out.println("1- Adicionar livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar livro da pilha");
			System.out.println("0- Sair");
			System.out.println("Digite uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				sc.skip("\\R?");
				nomeLivro = sc.nextLine();
				livros.push(nomeLivro);
				System.out.println("Pilha: ");
				livros.forEach(System.out::println);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				System.out.println("Lista de livros na Pilha:");
				livros.forEach(System.out::println);
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha esta vazia!");
				} else {
					System.out.println("Pilha: ");
					System.out.println(livros.pop());
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;

			default:
				System.out.println("Programa Finalizado!");
			}

		} while (opcao != 0);

	}

}
