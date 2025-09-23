package com.wakanda.delivery.Entrega.infra;

import com.wakanda.delivery.Entrega.application.repository.EntregaRepository;
import com.wakanda.delivery.Entrega.domain.Entrega;
import com.wakanda.delivery.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Slf4j
public class EntregaRepositoryMySQL implements EntregaRepository {

    private final EntregaMySQLSpringRepository entregaMySQLSpringRepository;

    @Override
    public Entrega buscaPorId(UUID idEntrega) {
        log.info("[Inicia] EntregaRepositoryMySQL - buscaPorId");
        Entrega entrega = entregaMySQLSpringRepository.findById(idEntrega)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Entrega Invalida"));
        log.info("[Inicia] EntregaRepositoryMySQL - buscaPorId");
        return entrega;
    }
}
