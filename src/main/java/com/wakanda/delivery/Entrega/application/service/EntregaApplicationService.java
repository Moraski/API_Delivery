package com.wakanda.delivery.Entrega.application.service;


import com.wakanda.delivery.Entrega.application.api.EditaEntregaRequest;
import com.wakanda.delivery.Entrega.application.api.EntregaResponse;
import com.wakanda.delivery.Entrega.application.repository.EntregaRepository;
import com.wakanda.delivery.Entrega.domain.Entrega;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class EntregaApplicationService implements EntregaService{

    private final EntregaRepository entregaRepository;
    @Override
    public EntregaResponse buscaEntregaPorId(UUID idEntrega) {
        log.info("[Inicia] EntregaApplicationService - buscarEntregaPorId");
        Entrega entrega = entregaRepository.buscaPorId(idEntrega);
        log.info("[Finaliza] EntregaApplicationService - buscarEntregaPorId");
        return new EntregaResponse(entrega);
    }

    @Override
    public EntregaResponse editaEntrega(UUID idEntrega, EditaEntregaRequest editaEntregaRequest) {
        log.info("[Inicia] EntregaApplicationService - editaCliente");
        Entrega entrega = entregaRepository.buscaPorId(idEntrega);
        entrega.editaEntrega(editaEntregaRequest);
        entregaRepository.salvar(entrega);
        log.info("[Finaliza] EntregaApplicationService - editaCliente");
        return new EntregaResponse(entrega);
    }

}
