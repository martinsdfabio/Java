package aula_02;

import java.util.Scanner;

public class Exc2_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float salario, salarioLiquido;
		String nomeColaborador;
		int cargo;

		System.out.print("Digite o nome: ");
		sc.skip("\\R?");
		nomeColaborador = sc.nextLine();

		System.out.print("Digite o numero do cargo: ");
		cargo = sc.nextInt();

		System.out.printf("Digite seu salario: ");
		salario = sc.nextFloat();

		switch (cargo) {
		case 1:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Gerente");
			salarioLiquido = salario + (0.10f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		case 2:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Vendedor");
			salarioLiquido = salario + (0.07f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		case 3:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Supervisor");
			salarioLiquido = salario + (0.09f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		case 4:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Motorista");
			salarioLiquido = salario + (0.06f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		case 5:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Estoquista");
			salarioLiquido = salario + (0.05f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		case 6:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Tecnico Ti");
			salarioLiquido = salario + (0.08f * salario);
			System.out.printf("Salario: R$ %.2f ", salarioLiquido);
			break;
		}

	}

}
