package com.wakanda.delivery.Entrega.application.api;


import com.wakanda.delivery.Entrega.domain.Entrega;
import  com.wakanda.delivery.Entrega.domain.StatusEntrega ;
import com.wakanda.delivery.Pedido.domain.Pedido;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class EntregaResponse {


    UUID idEntrega;
    Pedido pedido;
    String endereco;
    StatusEntrega status;
    LocalDateTime dataCriacao;
    LocalDateTime dataEntrega;

    public EntregaResponse(Entrega entrega) {
        this.idEntrega = entrega.getIdEntrega();
        this.pedido = entrega.getPedido();
        this.endereco = entrega.getEndereco();
        this.status = entrega.getStatus();
        this.dataCriacao = entrega.getDataCriacao();
        this.dataEntrega = entrega.getDataEntrega();
    }
}
