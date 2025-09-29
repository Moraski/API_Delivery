package com.wakanda.delivery.Pedido.application.service;

import com.wakanda.delivery.Pedido.application.api.PedidoNovoRequest;
import com.wakanda.delivery.Pedido.application.api.PedidoResponse;

public interface PedidoService {
    PedidoResponse criaNovoPedido(PedidoNovoRequest pedidoNovo);
}
