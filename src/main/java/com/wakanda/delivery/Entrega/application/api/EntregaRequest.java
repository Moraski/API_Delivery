package com.wakanda.delivery.Entrega.application.api;

import com.wakanda.delivery.Entrega.domain.StatusEntrega;
import com.wakanda.delivery.Pedido.domain.Pedido;
import jakarta.persistence.*;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class EntregaRequest {

    Pedido pedido;
    String endereco;
    StatusEntrega status;
    LocalDateTime dataCriacao;
    LocalDateTime dataEntrega;
}
