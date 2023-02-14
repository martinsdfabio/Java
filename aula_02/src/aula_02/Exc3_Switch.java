package aula_02;

import java.util.Scanner;

public class Exc3_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, total;

		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();

		total = n1 + n2;
		System.out.println("A soma é: " + total);

		sc.close();

	}
}
