package com.wakanda.delivery.itens.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Itens {


    @Id
    @GeneratedValue
    private UUID idItem;

    @Column(nullable = false)
    private String produto;

    @Column(nullable = false)
    private Double valorUnitario;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private String descricao;
}
