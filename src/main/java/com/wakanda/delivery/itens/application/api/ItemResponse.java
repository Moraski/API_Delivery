package com.wakanda.delivery.itens.application.api;

import com.wakanda.delivery.itens.domain.Item;
import lombok.Value;
import java.util.UUID;

@Value
public class ItemResponse {

    UUID idItem;
    String produto;
    Double valorUnitario;
    Integer quantidade;
    String descricao;


    public ItemResponse(Item item) {
        this.idItem = item.getIdItem();
        this.produto = item.getProduto();
        this.valorUnitario = item.getValorUnitario();
        this.quantidade = item.getQuantidade();
        this.descricao = item.getDescricao();
    }
}

