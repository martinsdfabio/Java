package aula_02;

import java.util.Scanner;

public class exc2_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Digite um numero: ");
		a = sc.nextInt();

		if (a % 2 == 0 & a >= 0) {
			System.out.println("O Número " + a + " é par e positivo!");

		} else if (a % 2 == 0 & a < 0) {
			System.out.println("O Número " + a + " é par e negativo!");

		} else if (a % 2 != 0 & a > 0) {
			System.out.println("O Número " + a + " é impar e positivo!");

		} else {
			System.out.println("O Número " + a + " é impar e negativo!");
		}
		sc.close();
	}
}
