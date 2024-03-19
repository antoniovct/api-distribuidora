package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.Adress;

public record SellerDto(
        String cpf,
        String name,
        String telephone,
        Adress adress,
        String email
) {
}
