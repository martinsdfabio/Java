package aula_02;

import java.util.Scanner;

public class Exc3_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		String nome;
		boolean primeira;

		System.out.println("digite o nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("digite a idade: ");
		leia.skip("\\R?");
		idade = leia.nextInt();

		System.out.println("primeira doação: ");
		leia.skip("\\R?");
		primeira = leia.nextBoolean();

		if (idade >= 60 && idade <= 69) {
			if (primeira)
				System.out.println("não esta apto para doar: ");
			else
				System.out.println("Não esta apto a doar:");
		} else {

		}
	}
}
