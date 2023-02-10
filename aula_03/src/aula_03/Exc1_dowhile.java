package aula_03;

import java.util.Scanner;

public class Exc1_dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0, somaP = 0;

		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			if (numero > 0) {
				somaP += numero;
			}
		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + somaP);
	}

}
