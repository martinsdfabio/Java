package atividade4;

public abstract class Farmacia {

	private Long id;
	private String nome;
	private String nomeComercial;
	private String categoria;
	private Double preco;

	private Integer tipo;

	public Farmacia() {
	}

	public Farmacia(Long id, String nome, String nomeComercial, String categoria, Double preco, Integer tipo) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.nomeComercial = nomeComercial;
		this.preco = preco;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public abstract void reajuste(float percentual);
	
	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1 -> System.out.println("Medicamento");
		case 2 -> System.out.println("Perfumaria");
		}
		System.out.println(id + ", " + nome + ", " + nomeComercial + ", " + categoria + ", "
				+ String.format("%.2f", preco) + ", " + tipo);
	}
}