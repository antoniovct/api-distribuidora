package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.Brand;

public record ProductDto(
        String name,
        Double value,
        Brand brand
) {
}
