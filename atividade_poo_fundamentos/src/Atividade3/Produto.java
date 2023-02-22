package Atividade3;

public class Produto {
	
	private String nome;
	private String categoria;
	private String genero;
	private String descricao;
	private double preco;

	public Produto(String nome, String categoria, String genero, String descricao, double preco) {

		this.nome = nome;
		this.categoria = categoria;
		this.genero = genero;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void vizualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Genero: " + genero);
		System.out.println("Descrição: " + descricao);
		System.out.println(String.format("Preço: R$ %.2f", preco));
	}
}
