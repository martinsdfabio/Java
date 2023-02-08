package aula_01;

import java.util.Scanner;

public class exc2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1,n2,n3,n4,media;
		System.out.println("Digite a primeira nota :");
		n1 = sc.nextFloat();
		System.out.println("Digite a segunda nota :");
		n2 = sc.nextFloat();
		System.out.println("Digite a terceira nota :");
		n3 = sc.nextFloat();
		System.out.println("Digite a quarta nota :");
		n4 = sc.nextFloat();
		media = (n1 + n2 + n3 + n4) /4;
		System.out.printf("A media do aluno é : %.1f", media);
	}

}
