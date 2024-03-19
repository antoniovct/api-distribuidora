CREATE TABLE client (
id BIGINT AUTO_INCREMENT,
cnpj VARCHAR(100),
razao VARCHAR(100),
fantasia VARCHAR(100),
telefone VARCHAR(100),
email VARCHAR(100),
endereco_id BIGINT,
PRIMARY KEY(id)
);
