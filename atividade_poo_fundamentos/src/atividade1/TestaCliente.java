package atividade1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Clauber Profeta", "(19) 9999-54579", "474.856.895-48","theclauber.profeta@gmail.com", "Rua do Amor, Nº 746");
		Cliente cl2 = new Cliente("Jaina Sabia", "(11)9485-54684", "745.458.125-55","maga.do.java@gmail.com", "Rua dos Javeiros, Nº 1478");
	
		cl1.visualizar();
		System.out.println();
		cl2.visualizar();
	}

}
