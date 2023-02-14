package teste;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite a sua nota: ");
		nota = sc.nextInt();
		
		if (nota >= 7) {
			System.out.println("Parabens você passou");
		}else if (nota >= 5 && nota < 7) {
				System.out.println("Ficou de recuperação: ");
			
		}else {
			
			System.out.println("Alune reprovade: ");
		}
	}
}
	


