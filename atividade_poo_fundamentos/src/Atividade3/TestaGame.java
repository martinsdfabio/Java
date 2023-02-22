package Atividade3;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto jogo1 = new Produto("Hogwarts Legacy ", "Aventura ", "Mundo Aberto ", "Hogwarts Legacy é um RPG de ação imersivo de mundo aberto.", 299.99);
		Produto jogo2 = new Produto("New World ", "RPG ", "Multiplayer Massivo ", "Explore um MMO de mundo aberto emocionante e cheio de perigos e oportunidades.", 107.99);
	
		jogo1.vizualizar();
		System.out.println();
		jogo2.vizualizar();
	}

}
