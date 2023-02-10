package aula_02;

import java.util.Scanner;

public class Exc1_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item, quantidade;
		float calculoTotal;
		System.out.print("Qual o numero do item: ");
		item = sc.nextInt();

		System.out.print("Qual a quantidade do item: ");
		quantidade = sc.nextInt();

		switch (item) {
		case 1:
			System.out.print("Produto: Cachorro quente");
			calculoTotal = 10.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		case 2:
			System.out.print("Produto: X-Salada");
			calculoTotal = 15.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		case 3:
			System.out.print("Produto: X-Bacon");
			calculoTotal = 18.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		case 4:
			System.out.print("Produto: Bauru");
			calculoTotal = 12.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		case 5:
			System.out.print("Produto: Refrigerante");
			calculoTotal = 8.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		case 6:
			System.out.print("Produto: Suco de laranja");
			calculoTotal = 13.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", calculoTotal);
			break;
		}
		sc.close();
	}
}
