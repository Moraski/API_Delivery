package com.wakanda.delivery.Pedido.application.api;

import com.wakanda.delivery.Entrega.domain.StatusEntrega;
import com.wakanda.delivery.Pedido.domain.Pedido;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class PedidoResponse {

    private final UUID idPedido;
    private final UUID idCliente;
    private final String enderecoEntrega;
    private final Double total;
    private final LocalDateTime dataCriacao;
    private final StatusEntrega statusEntrega;
    private final List<ItemDoPedidoResponse> itens;

    public PedidoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.idCliente = pedido.getIdCliente();
        this.enderecoEntrega = pedido.getEntrega() != null ? pedido.getEntrega().getEndereco() : null;
        this.total = pedido.getTotal();
        this.dataCriacao = pedido.getDataCriacao();
        this.statusEntrega = pedido.getEntrega() != null ? pedido.getEntrega().getStatus() : null;

        this.itens = pedido.getItens().stream()
                .map(ItemDoPedidoResponse::new)
                .collect(Collectors.toList());
    }
}
