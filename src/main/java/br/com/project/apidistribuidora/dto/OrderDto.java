package br.com.project.apidistribuidora.dto;

import br.com.project.apidistribuidora.model.OrderPosition;
import br.com.project.apidistribuidora.model.Product;
import br.com.project.apidistribuidora.model.Seller;

import java.time.LocalDate;
import java.util.List;

public record OrderDto(
        Seller seller,
        LocalDate date,
        OrderPosition position,
        List<Product> products
) {
}
