package br.com.project.apidistribuidora.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "pedidos")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Seller seller;
    @Column(name = "data_emissao")
    private LocalDate date;
    @Column(name = "posicao")
    @Enumerated(EnumType.STRING)
    private OrderPosition position;
    @OneToMany
    private List<Product> products;
}
