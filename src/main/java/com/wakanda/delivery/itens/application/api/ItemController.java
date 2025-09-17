package com.wakanda.delivery.itens.application.api;

import com.wakanda.delivery.itens.application.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class ItemController implements ItemAPI{

    private  final ItemService itemservece;

    @Override
    public ItemResponse postNovoItem(ItemNovoRequest item) {
        log.info("[Inicia] ItemController - postNovoItem");
        ItemResponse response = itemservece.criaNovoItem(item);
        log.info("[Finaliza] ItemController - postNovoItem");
        return response;
    }

    @Override
    public ItemResponse getItemById(UUID idItem) {
        log.info("[Inicia] ItemController - getNovoItem");
        ItemResponse response = itemservece.buscaItemPorId(idItem);
        log.info("[Finaliza] ItemController - getNovoItem");
        return response;
    }

    @Override
    public ItemResponse putItemById(UUID idItem, EditaItemRequest item) {
        log.info("[Inicia] ItemController - putItemById");
        ItemResponse response = itemservece.editaItemPorId(idItem, item);
        log.info("[Finaliza] ItemController - putItemById");
        return response;
    }
}
