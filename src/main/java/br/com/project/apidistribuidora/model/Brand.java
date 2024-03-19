package br.com.project.apidistribuidora.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "marcas")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String razao;
    private String fantasia;
    @OneToMany(mappedBy = "brand")
    private List<Product> product = new ArrayList<>();
}
