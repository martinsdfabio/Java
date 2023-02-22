package atividade2;

public class Funcionario {

	private String nome;
	private String cargo;
	private String funcao;
	private String beneficios;
	private double salario;

	public Funcionario(String nome, String cargo, String funcao, String beneficios, double salario) {

		this.nome = nome;
		this.cargo = cargo;
		this.funcao = funcao;
		this.beneficios = beneficios;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getfuncao() {
		return funcao;
	}

	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void vizualizar() {

		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Função: " + funcao);
		System.out.println("Beneficios: " + beneficios);
		System.out.println(String.format("Salario: R$ %.2f", salario));
	}
}
