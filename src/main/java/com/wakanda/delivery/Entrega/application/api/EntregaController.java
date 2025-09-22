package com.wakanda.delivery.Entrega.application.api;

import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI{

    @Override
    public ClienteResponse GetEntregaById(UUID IdEntrega) {
        log.info("[Inicia] EntregaController - getEntregaByID");
        log.info("[id Entrega] {}", IdEntrega);
        ClienteResponse clienteResponse = EntregaService.buscarClientePorId(IdEntrega);
        log.info("[Inicia] EntregaController - getEntregaByID");
        return clienteResponse;
    }
}
