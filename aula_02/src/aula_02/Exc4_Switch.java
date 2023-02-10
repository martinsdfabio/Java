package aula_02;

import java.util.Scanner;

public class Exc4_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo;
		float saldo, valorSaque, novoSaldo, deposito;
		saldo = 1000f;

		System.out.println("Digite o codigo: ");
		codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo" + saldo);
			break;
		case 2:
			System.out.println("Digite o valor: ");
			valorSaque = sc.nextFloat();
			novoSaldo = saldo - valorSaque;
			if (valorSaque > saldo) {
				System.out.println("Saldo Insuficiente! ");
			} else {
				System.out.println("Novo Saldo: R$ " + novoSaldo );
			}
			break;
		case 3:
			System.out.println("Digite o valor: ");
			deposito = sc.nextFloat();
			novoSaldo = saldo + deposito;
			System.out.println("Novo Saldo: R$ " + novoSaldo);
			break;

		default:
			System.out.println("Operação Invalida!");
		}
      sc.close();
	}

}
