package atividade1;

public abstract class Cliente {
	
	private String nome;
	private String telefone;
	private Integer idade;
	private String email;
	private String endereco;
	private Integer tipo;
	
	public Cliente(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo) {
     //(o meu = o que o cliente digitou)
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getTelefone() {
		return telefone;
		
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getendereco() {
		return endereco;
	}
	
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
		
		String tipo = "";
		switch(this.tipo){
			case 1 -> System.out.println("Pessoa Fisica: ");
			case 2 -> System.out.println("Pessoa Juridica: ");
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);
		System.out.println("E-mail: " + email);
		System.out.println("Endereco: " + endereco);
		System.out.println("Tipo: " + tipo);
	}
}
