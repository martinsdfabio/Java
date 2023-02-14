package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetoresInteiros[] = { 1, 2, 3, 4, 5 };

		float[] vetorFloat = new float[5];

		for (int contador = 0; contador < vetoresInteiros.length; contador++)
			System.out.println("posição " + contador + " = " + vetoresInteiros[contador]);

		for (int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("Digite um valor para a posição[" + indice + "]");
			vetorFloat[indice] = sc.nextFloat();
		}
		for (float numero : vetorFloat)
			System.out.println(numero);

		Arrays.sort(vetorFloat);
		for (var numero : vetorFloat)
			System.out.println(numero);

		sc.close();
	}

}
