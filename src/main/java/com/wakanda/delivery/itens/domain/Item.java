package com.wakanda.delivery.itens.domain;

import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.util.UUID;
@Entity
@Table(name = "itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Item {


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

    public Item(@Valid ItemNovoRequest itemNovo){
        this.idItem = itemNovo.getIdItem();
        this.produto = itemNovo.getProduto();
        this.valorUnitario = itemNovo.getValorUnitario();
        this.quantidade = itemNovo.getQuantidade();
        this.descricao = itemNovo.getDescricao();
    }
}
