package com.wakanda.delivery.itens.infra;

import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Itens;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ItemRepositoryMySQL implements ItemRepository {

    private final ItensMySQLSpringRepository itensMySQLSpringRepository;

    @Override
    public Itens salva(Itens itens) {
        log.info("[Inicia] ItemRepositoryMySQL - salva");
        Itens novoItem = itensMySQLSpringRepository.save(itens);
        log.info("[Finaliza] ItemRepositoryMySQL - salva");
        return novoItem;
    }
}
