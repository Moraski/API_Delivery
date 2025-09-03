package com.wakanda.delivery.Cliente.application.service;

import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import com.wakanda.delivery.Cliente.application.repository.ClienteRepository;
import com.wakanda.delivery.Cliente.domain.Cliente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaNovoCliente(@Valid ClienteNovoRequest clienteNovo){
        log.info("[Inicia] ClienteApplicationService - criaNovoCliente");
        var cliente = new Cliente(clienteNovo);
        clienteRepository.salva(cliente);
        log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
        return new ClienteResponse(cliente);
    }
}
