package com.wakanda.delivery.Entrega.application.api;

import com.wakanda.delivery.Cliente.domain.Cliente;
import com.wakanda.delivery.Entrega.domain.Entrega;
import jakarta.persistence.GeneratedValue;
import  com.wakanda.delivery.entrega.domain.StatusEntrega ;
import java.time.LocalDateTime;
import java.util.UUID;

public class EntregaResponse {


    private UUID idEntrega;
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
