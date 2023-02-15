package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exc3_set {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		int numero;

		System.out.println("Digite um numero: ");

		for (int contador = 0; contador <= 9; contador++) {
			numero = sc.nextInt();
			numeros.add(numero);
		}
		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> nuIte = numeros.iterator(); // serve para andar dentro da lista

		while (nuIte.hasNext()) {
			System.out.println(nuIte.next());
		}

	}

}
