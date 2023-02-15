package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		
		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Eli");
	
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover 1 elemento da fila");
		
		pilha.pop();
		
		for(var elemento : pilha) 
				System.out.println(elemento);
			
		System.out.println("Topo da pilha: " + pilha.peek());
	
	

}
}