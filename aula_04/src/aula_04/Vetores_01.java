package aula_04;

import java.util.Scanner;

public class Vetores_01 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
        int numero, i;

        System.out.println("Digite o número que voce deseja encontrar: ");
        numero = entrada.nextInt();

        for (i = 0; i < vetor.length; i++) {

            if (numero == vetor[i]) {
                System.out.println("O número " + numero + " está localizado na posição " + i);
                i = vetor.length;
            } else if (vetor.length - 1 == i && vetor[i] != numero)
                System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}
