package teste;

import java.util.Scanner;

public class If_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 ,valor2;
		
		System.out.println("Digite um numero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor é: "+ valor1);
		}else {
			System.out.println("O maior valor é: "+ valor2);
		}
			

	}

}
