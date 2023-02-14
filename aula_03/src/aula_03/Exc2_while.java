package aula_03;

import java.util.Scanner;

public class Exc2_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, full = 0;
		String continua = "S";
		
		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Digite a idade: ");
			idade = sc.nextInt();

			System.out.println("Digite o sexo: ");
			sexo = sc.nextInt();

			System.out.println("Digite a categoria: ");
			categoria = sc.nextInt();

			if (categoria == 1)
				backend ++;
			if (categoria == 2 && sexo == 2)
				frontend ++;
			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile ++;
			if (categoria == 4 && sexo == 2 && idade < 30)
				full ++;
				
			
			System.out.println("Deseja continuar(S/N): ");
			sc.skip("\\R");
			continua = sc.nextLine().toUpperCase();

		}
	System.out.println("\nTotal de pessoas desenvolvedoras Backand: " + backend);
	System.out.println("\nTotal de pessoas desenvolvedoras Frontand: " + frontend);
	System.out.println("\nTotal de pessoas desenvolvedoras Mobile: " + mobile);
	System.out.println("\nTotal de pessoas desenvolvedoras FullStack: " + full);
	
	sc.close();
	}

}
