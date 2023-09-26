CREATE DATABASE bd_ecommerce;
USE bd_colaboradores;
CREATE TABLE tb_colaboradores (
	id int not null auto_increment primary key,
    nome varchar(255) not null,
    cargo varchar(255) not null,
    email varchar(255) not null,
    salario decimal(10,2) not null
);
INSERT INTO tb_colaboradores (nome, cargo, email, salario) VALUES  ("João", "Gerente", "joao@email.com", 2000.00);
INSERT INTO tb_colaboradores (nome, cargo, email, salario) VALUES  ("Maria", "Supervisora", "maria@email.com", 2100.00);
INSERT INTO tb_colaboradores (nome, cargo, email, salario) VALUES  ("Carlos", "Proletário", "carlos@email.com", 1300.00);
INSERT INTO tb_colaboradores (nome, cargo, email, salario) VALUES  ("Joana", "Proletária", "joana@email.com", 1300.00);
INSERT INTO tb_colaboradores (nome, cargo, email, salario) VALUES  ("Bernardo", "Proletário", "bernardo@email.com", 1300.00);

SELECT * FROM tb_colaboradores WHERE salario > 2000.00;
SELECT * FROM tb_colaboradores WHERE salario < 2000.00;

UPDATE tb_colaboradores SET cargo = "Proletária Plena" WHERE id = 4;
SELECT * FROM tb_colaboradores