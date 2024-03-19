CREATE TABLE pedidos (
id BIGINT AUTO_INCREMENT,
vendedor_id BIGINT,
data_emissao DATE,
posicao VARCHAR(20),
produtos_id BIGINT,
PRIMARY KEY(id));