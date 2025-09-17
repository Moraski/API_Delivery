package com.wakanda.delivery.itens.application.api;

import com.wakanda.delivery.handler.APIException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/item")
public interface ItemAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ItemResponse postNovoItem(@RequestBody @Valid ItemNovoRequest item);

    @GetMapping("/{idItem}")
    @ResponseStatus(code = HttpStatus.OK)
    ItemResponse getItemById(@PathVariable UUID idItem);

    @PutMapping("/{idItem}")
    @ResponseStatus(code = HttpStatus.OK)
    ItemResponse putItemById(@PathVariable UUID idItem, @RequestBody @Valid AtualizaItemRequest item);
}
