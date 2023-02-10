package aula_02;

import java.util.Scanner;

public class Exc3_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		String nome;
		boolean primeira;

		System.out.println("Digite o nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Digite a idade: ");
		leia.skip("\\R?");
		idade = leia.nextInt();

		System.out.println("É a  primeira doação? ");
		leia.skip("\\R?");
		primeira = leia.nextBoolean();

		if (idade >= 60 && idade <= 69) {
			if (primeira) {
				System.out.println(nome + " Não está apto a doar! ");
			} else {
				System.out.println(nome + " Está apto a doar! ");
			}
		} else if (idade >= 18 && idade < 60) {
			System.out.println(nome + " Está apto a doar! ");

		} else {
			System.out.println(nome + " Não Está apto a doar! ");
		}
		leia.close();
	}
}
