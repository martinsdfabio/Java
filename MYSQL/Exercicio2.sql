CREATE DATABASE db_gamedev;

USE db_gamedev;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome_produto VARCHAR(200),
	preco DECIMAL(6,2),
    desenvolvedora VARCHAR(200),
    quantidade INT(20),
    categoria VARCHAR(20),
    
    
	PRIMARY KEY(id)
);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome_produto, preco, desenvolvedora, quantidade, categoria) VALUES 
("League of Legends", 0.00, "Riot Games", 1000, "MOBA"), 
("God of War", 300.00, "Santa Monica Studio", 200, "RPG"), 
("Ragnarok Online", 20.00, "Gravity", 1000, "MMORPG"), 
("Hogwarts Legacy", 650.00, "Avalanche Software", 150, "Aventura"), 
("Age of Empires IV", 99.00, "Relic Entertainment World's Edge", 50, "Estratégia"), 
("YU-GI-OH! Master Duel", 0.00, "Konami Digital Entertainment", 1000, "Estratégia"), 
("CSGO", 300.00, "Valve", 1000, "FPS"), 
("FIFA 23", 575.00, "EA Canada", 150, "Esporte");

SELECT * FROM tb_produtos WHERE preco < 500;
SELECT * FROM tb_produtos WHERE preco > 500;

UPDATE tb_produtos SET preco = 600.00 WHERE id = 4;

