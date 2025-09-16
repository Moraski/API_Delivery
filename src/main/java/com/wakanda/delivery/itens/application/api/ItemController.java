package com.wakanda.delivery.itens.application.api;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class ItemController implements ItemAPI{
    @Override
    public ItemResponse postNovoItem(ItemNovoRequest item) {
        log.info("[Inicia] ItemController - postNovoItem");
        ItemResponse ItemResponse = itemService.criaNovoItem(item);
        log.info("[Finaliza] ItemController - postNovoItem");
        return ItemResponse;
    }
}
