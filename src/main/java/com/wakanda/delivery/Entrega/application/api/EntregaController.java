package com.wakanda.delivery.Entrega.application.api;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import com.wakanda.delivery.Entrega.application.service.EntregaService;

import java.util.UUID;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI{

    private final EntregaService entregaService;

    @Override
    public EntregaResponse GetEntregaById(UUID IdEntrega) {
        log.info("[Inicia] EntregaController - getEntregaByID");
        log.info("[id Entrega] {}", IdEntrega);
        EntregaResponse entregaResponse = entregaService.buscaEntregaPorId(IdEntrega);
        log.info("[Inicia] EntregaController - getEntregaByID");
        return entregaResponse;
    }

    @Override
    public EntregaResponse UpdateEntrega(UUID idEntrega, EditaEntregaRequest editaEntregaRequest) {
        log.info("[Inicia] EntregaController - UpdateEntrega");
        log.info("[id Entrega] {}", idEntrega);
        EntregaResponse entregaResponse = entregaService.editaEntrega(idEntrega, editaEntregaRequest);
        log.info("[Inicia] EntregaController - UpdateEntrega");
        return entregaResponse;
    }
}
