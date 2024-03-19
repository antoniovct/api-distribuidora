package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.Product;

import java.util.List;

public record BrandDto(
        String cnpj,
        String razao,
        String fantasia,
        List<Product> product
) {
}
