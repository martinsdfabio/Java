package aula_02;

import java.util.Scanner;

public class PlanodeSaudev2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 int faixa;
		 System.out.println("Faixas Etarias");
		 System.out.println("1\taté 10 anos");
		 System.out.println("2\taté 29 anos");
		 System.out.println("3\tate 45 anos");
		 System.out.println("4\tate 59 anos");
		 System.out.println("5\tate 65 anos");
		 System.out.println("6\t maior que 65 anos");
		 System.out.println("Digite a sua faixa etaria :");
		 faixa = leia.nextInt();
 
		 switch(faixa) {
		 
		 case 1:
			 System.out.println("O valor do seu Plano de Saude sera R$ 100,00");
			 break;
		 case 2:
			 System.out.println("O valor do seu Plano de Saude sera R$ 200,00");
			 break;
		 case 3:	
			 System.out.println("O valor do seu Plano de Saude sera R$ 300,00");
			 break;
		 case 4:	
			 System.out.println("O valor do seu Plano de Saude sera R$ 500,00");
			 break;
		 case 5:
			 System.out.println("O valor do seu Plano de Saude sera R$ 600,00");
             break;           
		 case 6:
			 System.out.println("O valor do seu Plano de Saude sera R$ 1000,00");
		     break;
		 
		      default:
		     System.out.println("Faixa Etaria Invalida");
		 }
		 
		 leia.close();
	
	}
}
