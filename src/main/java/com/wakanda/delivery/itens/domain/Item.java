package com.wakanda.delivery.itens.domain;

import com.wakanda.delivery.handler.APIException;
import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import com.wakanda.delivery.itens.application.api.ItemResponse;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;
@Entity
@Table(name = "itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Item {


    @Id
    @GeneratedValue
    private UUID idItem;

    @Column(nullable = false)
    private String produto;

    @Column(nullable = false)
    private Double valorUnitario;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private String descricao;

    public Item(@Valid ItemNovoRequest itemNovo){
        this.idItem = itemNovo.getIdItem();
        this.produto = itemNovo.getProduto();
        this.valorUnitario = itemNovo.getValorUnitario();
        this.quantidade = itemNovo.getQuantidade();
        this.descricao = itemNovo.getDescricao();
    }

    public void editaItem(String produto, Double valorUnitario, Integer quantidade, String descricao){
        if (produto == null || produto.isBlank()){
            throw APIException.build(HttpStatus.BAD_REQUEST, "produto não pode estar vazio");
        }
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
}
