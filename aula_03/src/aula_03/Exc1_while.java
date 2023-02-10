package aula_03;

import java.util.Scanner;

public class Exc1_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1, somaMe = 0, somaMa = 0;
		
		while(n >= 0) {
			System.out.println("Digite uma idade: ");
			n = sc.nextInt();
			if(n < 0) {
				System.out.println(" Fim \n");
			}else {
				if(n < 21 && n != 0) {
					somaMe += 1;
				}else if(n > 50) {
					somaMa += 1;
				}
			}
		}
System.out.println("Total de pessoas com menos de 21 anos: " + somaMe);
System.out.println("Total de pessoas com mais de 50 anos: " + somaMa);
}

}



