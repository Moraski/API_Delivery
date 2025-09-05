package com.wakanda.delivery.Cliente.application.api;

import com.wakanda.delivery.Cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI{

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postNovoCliente(@Valid ClienteNovoRequest cliente){
        log.info("[Inicia] ClienteController - postNovoCliente");
        ClienteResponse clienteResponse = clienteService.criaNovoCliente(cliente);
        log.info("[Finaliza] ClienteController - postNovoCliente");
        return clienteResponse;
    }

    @Override
    public ClienteResponse getClientePorId(UUID idCliente) {
        log.info("[Inicia] ClienteController - getNovoCliente");
        log.info("[idUsuario] {}", idCliente);
        ClienteResponse clienteResponse = clienteService.buscarClientePorId(idCliente);
        log.info("[Inicia] ClienteController - getNovoCliente");
        return clienteResponse;
    }

    @Override
    public ClienteResponse atualizaCliente(UUID idCliente, EditaClienteRequest cliente) {
        log.info("[Inicia] ClienteController - atualizaCliente");
        log.info("[idUsuario] {}", idCliente);
        ClienteResponse clienteResponse = clienteService.atualizarCliente(idCliente, cliente);
        log.info("[Inicia] ClienteController - atualizaCliente");
        return null;
    }
}
