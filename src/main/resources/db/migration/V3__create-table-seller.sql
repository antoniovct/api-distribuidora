CREATE TABLE vendedor (
id BIGINT AUTO_INCREMENT,
cpf VARCHAR(100),
nome VARCHAR(100),
telefone VARCHAR(100),
endereco_id BIGINT,
email VARCHAR(100),
pedidos_id BIGINT,
PRIMARY KEY(id));