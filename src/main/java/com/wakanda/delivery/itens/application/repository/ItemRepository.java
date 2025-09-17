package com.wakanda.delivery.itens.application.repository;

import com.wakanda.delivery.itens.domain.Item;

import java.util.UUID;

public interface ItemRepository {

    Item salva(Item item);

    Item buscaPorId(UUID idItem);
}
