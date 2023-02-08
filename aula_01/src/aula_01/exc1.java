package aula_01;

import java.util.Scanner;

public class exc1 {
	public static void main(String[] args) {
		float salario;
		float abono;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario :");
		salario = sc.nextFloat();
		System.out.println("Digite o abono");
		abono = sc.nextFloat();
		float novoSalario = salario + abono;
		System.out.printf("O salario atual é : %.2f", novoSalario);
		
		
	}
	
	

}
