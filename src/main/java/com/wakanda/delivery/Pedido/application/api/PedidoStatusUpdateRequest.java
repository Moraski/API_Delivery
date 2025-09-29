package com.wakanda.delivery.Pedido.application.api;

import com.wakanda.delivery.Entrega.domain.StatusEntrega;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PedidoStatusUpdateRequest {
    private final StatusEntrega statusEntrega;
}
