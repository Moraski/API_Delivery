package com.wakanda.delivery.itens.application.service;

import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import com.wakanda.delivery.itens.application.api.ItemResponse;
import jakarta.validation.Valid;

import java.util.UUID;

public interface ItemService {

    ItemResponse criaNovoItem(@Valid ItemNovoRequest item);
}
