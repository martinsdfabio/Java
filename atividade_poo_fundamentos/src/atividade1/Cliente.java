package atividade1;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String cpf;
	private String email;
	private String endereco;
	
	public Cliente(String nome, String telefone, String cpf, String email, String endereco) {
     //(o meu = o que o cliente digitou)
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("CPF: " + cpf);
		System.out.println("Endereco: " + endereco);
		System.out.println("E-mail: " + email);
	}
}
