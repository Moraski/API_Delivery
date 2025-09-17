package com.wakanda.delivery.itens.application.service;

import com.wakanda.delivery.itens.application.api.ItemNovoRequest;
import com.wakanda.delivery.itens.application.api.ItemResponse;
import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Itens;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class itemApplicationService implements ItemService{

        private final ItemRepository itemRepository;

        @Override
        public ItemResponse criaNovoItem(@Valid ItemNovoRequest itemNovo){
             log.info("[Inicia] ClienteApplicationService - criaNovoCliente");
            var item = new Itens(itemNovo);
            System.out.println("/n/n/n/n/");
            System.out.println(item.getDescricao());
            System.out.println("/n/n/n/n/");
            itemRepository.salva(item);
            log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
            return new ItemResponse(item);
        }
}
