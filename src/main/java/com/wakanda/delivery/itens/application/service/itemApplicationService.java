package com.wakanda.delivery.itens.application.service;

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
            itemRepository.buscaPorId(idItem);
            log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
            return n;
        }
}
