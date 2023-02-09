package aula_02;

import java.util.Scanner;

public class PlanodeSaude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 int idade;
		 
		 System.out.println("Digite a sua idade :");
		 idade = leia.nextInt();
		 
		 if(idade >= 0 && idade <= 10)
		    System.out.println("O valor do seu Plano de Saude sera R$ 100,00");
		 else if(idade > 10 && idade <= 29)
			System.out.println("O valor do seu Plano de Saude sera R$ 200,00");
		 else if(idade > 29 && idade <= 45)
				System.out.println("O valor do seu Plano de Saude sera R$ 300,00");
		 else if(idade > 45 && idade <= 59)
				System.out.println("O valor do seu Plano de Saude sera R$ 500,00");
		 else if(idade > 59 && idade <= 65)
				System.out.println("O valor do seu Plano de Saude sera R$ 600,00");
		 else if(idade > 65) 
				System.out.println("O valor do seu Plano de Saude sera R$ 1000,00");
	     else
	    	    System.out.println("Idade Invalida!");
	
	leia.close();
	}
	
	

}
