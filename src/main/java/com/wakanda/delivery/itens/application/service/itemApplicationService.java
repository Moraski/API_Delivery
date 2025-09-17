package com.wakanda.delivery.itens.application.service;

import com.wakanda.delivery.Cliente.domain.Cliente;
import com.wakanda.delivery.itens.application.api.EditaItemRequest;
import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import com.wakanda.delivery.itens.application.api.ItemResponse;
import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Item;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class itemApplicationService implements ItemService{

        private final ItemRepository itemRepository;

        @Override
        public ItemResponse criaNovoItem(@Valid ItemNovoRequest itemNovo){
             log.info("[Inicia] ClienteApplicationService - criaNovoCliente");
            var item = new Item(itemNovo);
            itemRepository.salva(item);
            log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
            return new ItemResponse(item);
        }

        @Override
        public ItemResponse buscaItemPorId(UUID idItem) {
            log.info("[Inicia] ClienteApplicationService - criaNovoCliente");
            Item item = itemRepository.buscaPorId(idItem);
            log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
            return new ItemResponse(item);
        }

    @Override
    public ItemResponse editaItemPorId(UUID idItem, EditaItemRequest itemEditado) {

        log.info("[Inicia] ClienteApplicationService - editaItemPorId");
        Item item = itemRepository.buscaPorId(idItem);
        item.editaItem(itemEditado);
        itemRepository.salva(item);
        log.info("[Finaliza] ClienteApplicationService - editaItemPorId");
        return new ItemResponse(item);
    }

    @Override
    public void deleteItem(UUID idItem) {
        log.info("[Inicia] ClienteApplicationService - deleteItem");
        itemRepository.Deleta(idItem);
        log.info("[Finaliza] ClienteApplicationService - deleteItem");

    }
}
