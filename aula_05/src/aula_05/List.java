package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	//Arraylist 
		ArrayList<Double> notas = new ArrayList<Double>();
		
		
		
		
		int opcao=0;
		double nota = 0.0;
		
		do {
			
			System.out.println(" 1 - Cadastra nota ");
			System.out.println(" 2 - lista de Notas ");
			System.out.println(" 3 - Digite a opção desejada ");
			System.out.println(" 4 - Excluir  nota");
			System.out.println(" 5 - Atualizar no Nota");
			System.out.println(" 6 - Sair");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println(" Digite uma nota entre 1 e 10 ");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as Notas ");
				if (notas.isEmpty())//se tiver vazio 
					System.out.println("Base de dodas vazia!");
				else
					notas.forEach(System.out::println);//vai passa em todas as indice e vai mostra cada uma.
			//for( var listaNota : notas)
				//System.out.println(listaNota);
			
			break;
			case 3:
				System.out.println("Procurar um Nota");
				System.out.println(" Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A Nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("O índice da minha nota é: " + notas.indexOf(nota));
				break;
			case 4:
				System.out.println(" Excluir Nota");
				System.out.println(" Digite uma nota: ");
				nota = leia.nextDouble();
				notas.remove(nota);//Nota
				//notas.remove(notas.indexOf(nota));//Precurar o indice da nota
				
				break;
			case 5:
				System.out.println(" Atualizar uma Nota");
				System.out.println(" Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println(" Digite a nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);//set esta atualizar nota e o set não deixar mutiplica informação.
				default:

					if (opcao > 6);
					System.out.println(" Opção Invalida ");
			}
				
			}while(opcao !=6);
		
}
}