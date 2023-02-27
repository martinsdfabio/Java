package lista1_entrada_saida_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Muda pra padrão americano troca "," por ponto ".".
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		final double n = 3.14159;
		
		double area = (Math.pow(raio, 2)) * n;
		
		System.out.printf("A=%.4f", area);

	}

}
