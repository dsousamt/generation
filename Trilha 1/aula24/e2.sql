CREATE DATABASE bd_ecommerce;
USE bd_ecommerce;
CREATE TABLE tb_produtos (
	id int not null auto_increment primary key,
    produto varchar(255) not null,
    quantidade int not null,
    categoria varchar(255) not null,
    preco decimal(10,2) not null
);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Pão", 50, "Padaria", 1.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Bolo", 10, "Padaria", 10.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Alface", 9, "Hortifruti", 2.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Tomate", 15, "Hortifruti", 5.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Frango", 22, "Açougue", 13.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Picanha", 7, "Açougue", 30.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Detergente", 34, "Limpeza", 12.00);
INSERT INTO tb_produtos (produto, quantidade, categoria, preco) VALUES  ("Shampoo", 17, "Limpeza", 15.00);

SELECT * FROM tb_produtos WHERE preco > 5.00;
SELECT * FROM tb_produtos WHERE preco < 5.00;

SELECT * FROM tb_produtos;

UPDATE tb_produtos SET preco = 15.00 WHERE id = 5;
SELECT * FROM tb_produtos