package com.wakanda.delivery.Pedido.application.api;
import com.wakanda.delivery.ItensPedido.application.api.ItemDoPedidoRequest;
import com.wakanda.delivery.Pedido.domain.StatusPedido;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class PedidoNovoRequest {

    UUID idCliente;
    String enderecoEntrega;
    StatusPedido statusPedido;
    List<ItemDoPedidoRequest> itens;
}
