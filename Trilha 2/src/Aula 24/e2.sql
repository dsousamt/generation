CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
nome_categoria varchar(255),
popularidade int
);

CREATE TABLE tb_pizzas(
id bigint auto_increment primary key,
nome_pizza varchar(255),
descricao text,
tipo enum("doce", "salgado"),
preco decimal (8,2),
categoria_id bigint,
foreign key (categoria_id) references tb_categorias(id)
);

INSERT INTO tb_categorias(nome_categoria, popularidade) 
VALUES
('Margherita', 5),
('Pepperoni', 4),
('Vegetariana', 3),
('Frango com Catupiry', 4);

INSERT INTO tb_pizzas (nome_pizza, descricao, tipo, preco, categoria_id)
VALUES
    ('Pizza Margherita', 'Molho de tomate, muçarela, manjericão fresco.', 'salgado',80.99, 1),
    ('Pizza Pepperoni', 'Molho de tomate, pepperoni, queijo, orégano.', 'salgado', 50.00, 2),
    ('Pizza Vegetariana', 'Molho de tomate, pimentões, cebola, azeitonas.', 'salgado', 100.99, 3),
    ('Pizza Frango com Catupiry', 'Molho de tomate, frango desfiado, catupiry.', 'salgado', 65.99, 4);

SELECT * FROM tb_pizzas WHERE preco > 45.00;

SELECT * FROM tb_pizzas WHERE preco between 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE nome_pizza LIKE '%m%';

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_pizzas.categoria_id = tb_categorias.id;

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_pizzas.categoria_id WHERE tipo = "salgado";