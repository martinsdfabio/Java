package aula_05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exc1_lista {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList <String> cores = new ArrayList<String>(); //lista
		
		String cor;
		
		
		System.out.println("Digite a cor: ");
		for(int contador = 0; contador <= 4; contador ++) { //inicio meu contador com 0 dps entro no for e realizo a impressão e adc o valor que o usuario dgt dentro da minha variavel COR e adc essa cor na minha lista
			cor = sc.nextLine();
			cores.add(cor);
		}
		
		
		System.out.println("Listar todas as cores: ");
		cores.forEach(System.out::println); //System.out::println é usado para imprimir
		
		Collections.sort(cores);
		System.out.println("Ordenar as cores: ");
		cores.forEach(System.out::println); //System.out::println é usado para imprimir
	}

}
