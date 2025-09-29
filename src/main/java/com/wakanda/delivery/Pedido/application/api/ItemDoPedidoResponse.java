package com.wakanda.delivery.Pedido.application.api;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ItemDoPedidoResponse {
    private final UUID idItem;
    private final String produto;
    private final Integer quantidade;
    private final Double valorUnitario;
    private final Double subtotal;

    public ItemDoPedidoResponse(com.wakanda.delivery.pedido.domain.ItemDoPedido itemDoPedido) {
        this.idItem = itemDoPedido.getItem().getIdItem();
        this.produto = itemDoPedido.getItem().getProduto();
        this.quantidade = itemDoPedido.getQuantidade();
        this.valorUnitario = itemDoPedido.getItem().getValorUnitario();
        this.subtotal = itemDoPedido.getSubtotal();
    }
}
