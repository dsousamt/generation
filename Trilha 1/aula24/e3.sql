CREATE DATABASE bd_escola;
USE bd_escola;
CREATE TABLE tb_estudantes (
	id int not null auto_increment primary key,
    nome varchar(255) not null,
    nota int not null,
    email varchar(255) not null,
    telefone bigint not null
);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("João", 4, "joao@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Maria", 10, "maria@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Carlos", 9, "carlos@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Joana", 2, "joana@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Bernardo", 3, "bernardo@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Patrícia", 7, "patricia@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Pedro", 8, "pedro@email.com", 2422222222);
INSERT INTO tb_estudantes (nome, nota, email, telefone) VALUES  ("Juliano", 9, "juliano@email.com", 2422222222);

SELECT * FROM tb_estudantes WHERE nota > 7;
SELECT * FROM tb_estudantes WHERE nota < 7;

SELECT * FROM tb_estudantes;

UPDATE tb_estudantes SET nota = 10 WHERE id = 5;
SELECT * FROM tb_estudantes