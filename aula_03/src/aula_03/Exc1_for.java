package aula_03;

import java.util.Scanner;

public class Exc1_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite o primeiro numero do intervalo: ");
		n1 = sc.nextInt();

		System.out.println("Digite o ultimo numero do intervalo: ");
		n2 = sc.nextInt();
		if (n1 < n2) {
			System.out.println("No Intervalo entre " + n1 + " e " + n2 + ":" );
			for (int c = n1; c <= n2; c++) {

				if (c % 3 == 0 && c % 5 == 0) {
					System.out.println(c + " é múltiplo de 3 e 5 ");

				}
			}

		} else
			System.out.println("intervalo Invalido!");

		sc.close();
	}

}
