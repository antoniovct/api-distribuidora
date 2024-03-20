package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.Adress;
import br.com.project.apidistribuidora.model.Client;

public record ClientDataDto(
        Long id,
        String cnpj,
        String razao,
        String fantasia,
        Adress adress,
        String telephone,
        String email
) {
    public ClientDataDto(Client client) {
        this(client.getId(), client.getCnpj(), client.getRazao(), client.getFantasia(), client.getAdress(), client.getTelephone(), client.getEmail());
    }
}
