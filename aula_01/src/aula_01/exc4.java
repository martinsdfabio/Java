package aula_01;

import java.util.Scanner;

public class exc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4,diferenca;
		System.out.println("Entre com o primeiro numero :");
		n1 = sc.nextInt();
		System.out.println("Entre com o segundo numero :");
		n2 = sc.nextInt();
		System.out.println("Entre com o terceiro numero :");
		n3 = sc.nextInt();
		System.out.println("Entre com o quarto numero :");
		n4 = sc.nextInt();
		diferenca = (n1 * n2)-(n3 * n4);
		System.out.println("A diferença é :" + diferenca);
		
		

	}

}
