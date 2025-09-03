package com.wakanda.delivery.Cliente.application.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postNovoCliente(@Valid CriarClienteRequest cliente){
        log.info("[Inicia] ClienteController - postNovoCliente");
        ClienteResponse clienteResponse = clienteService.criaNovoCliente(cliente);
        log.info("[Finaliza] ClienteController - postNovoCliente");
        return clienteResponse;
    }
}
