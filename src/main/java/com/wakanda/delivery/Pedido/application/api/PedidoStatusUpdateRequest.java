package com.wakanda.delivery.Pedido.application.api;

import com.wakanda.delivery.Entrega.domain.StatusEntrega;
import com.wakanda.delivery.Pedido.domain.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PedidoStatusUpdateRequest {
    private final StatusPedido statusPedido;
}
