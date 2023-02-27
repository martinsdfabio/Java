package lista3_repetitivas;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int calcI = i * i;
			System.out.println((i) + " " + calcI +" " + (calcI * i));
			
		}

	}

}
