package com.wakanda.delivery.itens.infra;

import com.wakanda.delivery.handler.APIException;
import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

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

    @Override
    public Item buscaPorId(UUID idItem) {
        log.info("[Inicia] ItemRepositoryMySQL - buscaPorId");
        Item item = itensMySQLSpringRepository.findById(idItem)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Item não encontrado"));
        log.info("[Finaliza] ItemRepositoryMySQL - buscaPorId");
        return item;
    }

    @Override
    public void deleta(UUID idItem) {
        itensMySQLSpringRepository.deleteById(idItem);
    }
}
