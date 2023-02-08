package aula_01;

import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {
		float salarioB, adicionalN, horasE, descontos, salarioL;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salario :");
		salarioB = sc.nextFloat();
		System.out.println("Digite o adicional noturno :");
		adicionalN = sc.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasE = sc.nextFloat();
		System.out.println("Digite os descontos :");
		descontos = sc.nextFloat();
		salarioL = salarioB + adicionalN + (horasE *5) - descontos;
		System.out.printf("O salario liquido é : %.2f", salarioL);
		

	}

}
