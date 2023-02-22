package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funci1 = new Funcionario("Giovana da Silva", "Gerente", "Delegar tarefas aos seus subordinados", "Plano de Saude", 10000.00);
		Funcionario funci2 = new Funcionario("Jaina Joseane", "Vendedora", "Vender o Produto e bater metas de venda", "Ajuda de Custo", 8000.00);

		funci1.vizualizar();
		System.out.println();
		funci2.vizualizar();
	}
}


