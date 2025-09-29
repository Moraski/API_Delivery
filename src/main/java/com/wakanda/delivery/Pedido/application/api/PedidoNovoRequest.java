package com.wakanda.delivery.Pedido.application.api;

import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class PedidoNovoRequest {

    UUID idCliente;
    String enderecoEntrega;
    List<com.wakanda.delivery.pedido.domain.ItemDoPedido> itens;
}
