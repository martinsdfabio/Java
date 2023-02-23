package atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Farmacia> farmaciaList = new ArrayList<>();

		String principioAtivo;
		String resposta;

		do {
			System.out.println("Id: ");
			long id = sc.nextLong();

			System.out.println("Nome: ");
			sc.skip("\\R?");
			String nome = sc.nextLine();

			System.out.println("Nome Comercial: ");
			sc.skip("\\R?");
			String nomeComercial = sc.nextLine();

			System.out.println("Categoria: ");
			sc.skip("\\R?");
			String categoria = sc.nextLine();

			System.out.println("Preco: ");
			double preco = sc.nextDouble();

			System.out.println("Tipo: ");
			int tipo = sc.nextInt();

			switch (tipo) {
			case 1 -> {
				System.out.println("Principio Ativo: ");
				sc.skip("\\R?");
				principioAtivo = sc.nextLine();
				farmaciaList.add(new Medicamento(id, nome, nomeComercial, categoria, preco, tipo, principioAtivo));
			}
			case 2 -> {
				System.out.println("Fragância: ");
				sc.skip("\\R?");
				String fragrancia = sc.nextLine();
				farmaciaList.add(new Perfumaria(id, nome, nomeComercial, categoria, preco, tipo, fragrancia));
			}
			}

			System.out.println("Deseja adicionar mais algum produto? ");
			resposta = sc.next();

		} while (resposta.equalsIgnoreCase("sim"));
		
		
		for (Farmacia farmacia : farmaciaList){
            farmacia.visualizar();
        }
		sc.close();
    }
}
	
