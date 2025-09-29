package com.wakanda.delivery.Pedido.application.api;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ItemDoPedidoRequest {
    private final UUID idItem;
    private final Integer quantidade;

    public ItemDoPedidoRequest(UUID idItem, Integer quantidade) {
        this.idItem = idItem;
        this.quantidade = quantidade;
    }
}