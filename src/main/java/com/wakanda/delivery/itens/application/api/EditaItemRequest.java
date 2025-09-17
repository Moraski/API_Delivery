package com.wakanda.delivery.itens.application.api;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EditaItemRequest {

    String produto;
    Double valorUnitario;
    Integer quantidade;
    String descricao;

    public EditaItemRequest(String produto, Double valorUnitario, Integer quantidade, String descricao){
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

}


