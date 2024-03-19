package br.com.project.apidistribuidora.dto;

public record AdressDto(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {
}
