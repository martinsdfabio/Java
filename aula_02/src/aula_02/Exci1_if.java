package aula_02;

import java.util.Scanner;

public class Exci1_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, calculoAb;

		System.out.print("Digite o numero A: ");
		a = sc.nextInt();

		System.out.print("Digite o numero B: ");
		b = sc.nextInt();

		System.out.print("Digite o numero C: ");
		c = sc.nextInt();

		calculoAb = a + b;

		if (calculoAb > c) {
			// 4 + 2 = 6 > 5
			System.out.println(a + " + " + b + " = " +  calculoAb + " > " +  c );
			
			System.out.println("A soma de A + B é maior do que C ");
	    }else if (calculoAb < c ) {
            System.out.println(a + " + " + b + " = " +  calculoAb + " < " +  c );
			
			System.out.println("A soma de A + B é menor do que C ");
			
		}else {
            System.out.println(a + " + " + b + " = " +  calculoAb + " = " +  c );
			
			System.out.println("A soma de A + B é igual a C ");
		}
		sc.close();
	}
}
