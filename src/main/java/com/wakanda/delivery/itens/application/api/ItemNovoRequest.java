package com.wakanda.delivery.itens.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class ItemNovoRequest {

    UUID idItem;
    String produto;
    Double valorUnitario;
    Integer quantidade;
    String descricao;
}
