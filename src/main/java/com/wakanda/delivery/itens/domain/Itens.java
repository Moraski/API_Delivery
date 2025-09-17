package com.wakanda.delivery.itens.domain;

import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
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

    public Itens(@Valid ItemNovoRequest itemNovo){
        this.idItem = itemNovo.getIdItem();
        this.produto = itemNovo.getProduto();
        this.valorUnitario = itemNovo.getValorUnitario();
        this.quantidade = itemNovo.getQuantidade();
        this.descricao = itemNovo.getDescricao();
    }
}
