package com.wakanda.delivery.itens.application.api;

import com.wakanda.delivery.itens.domain.Itens;
import lombok.Value;
import java.util.UUID;

@Value
public class ItemResponse {

    UUID idItem;
    String produto;
    Double valorUnitario;
    Integer quantidade;
    String descricao;


    public ItemResponse(Itens itens) {
        this.idItem = itens.getIdItem();
        this.produto = itens.getProduto();
        this.valorUnitario = itens.getValorUnitario();
        this.quantidade = itens.getQuantidade();
        this.descricao = itens.getDescricao();
    }
}

