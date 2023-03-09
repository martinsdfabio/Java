CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id BIGINT AUTO_INCREMENT,
    nome_aluno VARCHAR(200),
	nota DECIMAL(6,2),
    matricula INT(20),
     periodo VARCHAR(20),

	PRIMARY KEY(id)
);

SELECT * FROM tb_alunos;

INSERT INTO tb_alunos(nome_aluno, nota, matricula, periodo) VALUES 
("Giovana Tavares", 0.50, 1236, "Manha"), 
("Wallace Raio", 3.00, 5185, "Tarde"), 
("Pedro Patinson", 2.00, 5335, "Manha"), 
("Erica da Silva", 6.00, 7451, "Tarde"), 
("Jaina Proudmoore", 9.00, 3567, "Noite"), 
("Clebio Sabino", 7.50, 895, "Manha"), 
("Rafael Santos", 10.00, 7841, "noite"), 
("Lorraine Vecanandre", 5.00, 1475, "Tarde");

SELECT * FROM tb_alunos WHERE nota < 7.00;
SELECT * FROM tb_alunos WHERE nota > 7.00;

UPDATE tb_alunos SET nota = 5.00 WHERE id = 4;