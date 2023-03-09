CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

-- tabela da direita
CREATE TABLE tb_classes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    classe VARCHAR(255),
    subclasse VARCHAR(255),
    arma VARCHAR(255),
    montaria BOOLEAN,
    armadura BOOLEAN
);
-- tabela da esquerda
CREATE TABLE tb_personagens(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    nivel BIGINT,
	ataque INT,
    defesa INT,
	vida INT,
    inteligencia INT,
    destreza INT,
    agilidade INT,
    classe_id BIGINT,
    
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

INSERT INTO tb_classes (classe,subclasse,arma,montaria,armadura) 
VALUES  ("Arquimago", "Mago","Cajado", false,false),
		("Lord Knight", "Cavaleiro","Espada", true,true),
		("Bardo", "Trovador","Violão", false,false),
		("Sniper", "Arqueiro","Arco", false,true),
		("Mestre", "Noviço","Manopla", true,true),
        ("Mestre Ferreiro", "Mercador", "Machado", true, true),
        ("Algoz", "Gatuno","Adaga/Katar", true,true);
        
INSERT INTO tb_personagens (nome, nivel, ataque, defesa, vida, inteligencia, destreza, agilidade, classe_id) 
VALUES  ("HellBurns", 2700, 3500,1500,1150,255,255,0,1),
		("Charada", 1500, 2450,1300,5000,0,150,100,2),
		("Kindin", 3000, 500,500,1500,200,150,150,3),
        ("Mugi", 2000, 1500,3000,1500,0,255,255,4),
        ("iFeijao", 2500, 3000,1000,3000,255,100,0,5),
        ("Arturo", 2000, 4000,3000,2000,100,154,100,6),
        ("Brave", 2000, 500,500,1500,0,0,255,7),
        ("Darkizin", 200,1000,500,500,0,100,255,7);
 
-- Adicionando a constraint
ALTER TABLE tb_personagens ADD CONSTRAINT fk_pensonagens_classes
FOREIGN KEY (classe_id) REFERENCES tb_classes(id);


INSERT INTO tb_personagens (nome, nivel, ataque, defesa, vida, inteligencia, destreza, agilidade,classe_id) 
VALUES  ("Darkizinn", 2200,1000,500,500,0,100,255);

SELECT * FROM  tb_personagens;
SELECT * FROM  tb_classes;

SELECT * FROM  tb_personagens WHERE ataque > 2000;
SELECT * FROM  tb_personagens WHERE ataque < 2000;
SELECT * FROM  tb_personagens WHERE nivel BETWEEN 1000 AND 2000;
SELECT * FROM  tb_personagens WHERE nome LIKE "c%";

SELECT * FROM tb_personagens
INNER JOIN tb_classes
 ON tb_classes.id = tb_personagens.classe_id;


SELECT * FROM tb_personagens
right JOIN tb_classes ON tb_classes.id = tb_personagens.classe_id;
 
SELECT * FROM tb_personagens
left JOIN tb_classes ON tb_classes.id = tb_personagens.classe_id;

SELECT * FROM tb_personagens
INNER JOIN tb_classes
 ON tb_classes.id = tb_personagens.classe_id WHERE classe = "Algoz";