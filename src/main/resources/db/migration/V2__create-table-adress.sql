CREATE TABLE endereco (
id BIGINT AUTO_INCREMENT,
cep VARCHAR(100),
logradouro VARCHAR(100),
complemento VARCHAR(100),
bairro VARCHAR(100),
localidade VARCHAR(100),
uf CHAR(2),
PRIMARY KEY(id));