package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.Adress;

public record ClientDto(
        String cnpj,
        String razao,
        String fantasia,
        AdressDto adress,
        String telephone,
        String email
) {
}
