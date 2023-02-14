package teste;

import java.util.Scanner;

public class If_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano, idade, anoAtual = 2023;
		
		System.out.println("Digite o ano de nascimento: ");
		ano = sc.nextInt();
		
		idade = anoAtual - ano;
		
		if (idade >= 18){
			System.out.println("Esta apto a votar: ");
		
		}else {
			System.out.println("Não esta apto a votar!");
			
		}
		
		 
	}
}
