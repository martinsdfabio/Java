package lista4_vetor;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double[] A = new Double[100];
		double x;

		for (int i = 0; i < A.length; i++) {
			x = sc.nextDouble();
			A[i] = x;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 10) {
				System.out.println("A[" + i + "]" + " = " + A[i]);
			}
		}
	}

}
