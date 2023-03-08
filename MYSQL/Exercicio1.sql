-- comando para criação de banco de dados
CREATE DATABASE db_empresa;

-- comando que indica ao mysql qual banco de dados usar
USE db_empresa;

CREATE TABLE tb_funcionarios(
	id BIGINT AUTO_INCREMENT,
    nome_funcionario VARCHAR(255),
	salario DECIMAL(6,2),
    cargo VARCHAR(255),
    cpf VARCHAR(20),
    
    
	PRIMARY KEY(id)
);

-- comando que tras todos os dados da tabela de produtos
SELECT * FROM tb_funcionarios WHERE salario > 2000.00;
SELECT * FROM tb_funcionarios WHERE salario < 2000.00;

INSERT INTO tb_funcionarios(nome_funcionario, salario, cargo, cpf) VALUES 
("Giovana", 3000.00, "Dev Jr", "412.125.124-55"),
("Jaine", 5000.00, "Dev Pleno", "454.554.854-44"), 
("Rafael", 7000.00, "Dev Senior", "784.252.457-11"), 
("Clebio", 1500.00, "Estagiario", "485.858.154-99");

UPDATE tb_funcionarios SET salario = 1950.00 WHERE id = 4;

SELECT * FROM tb_funcionarios;

