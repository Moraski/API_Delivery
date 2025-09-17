package com.wakanda.delivery.itens.infra;

import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ItemRepositoryMySQL implements ItemRepository {

    private final ItensMySQLSpringRepository itensMySQLSpringRepository;

    @Override
    public Item salva(Item item) {
        log.info("[Inicia] ItemRepositoryMySQL - salva");
        Item novoItem = itensMySQLSpringRepository.save(item);
        log.info("[Finaliza] ItemRepositoryMySQL - salva");
        return novoItem;
    }
}
