package com.wakanda.delivery.Cliente.application.service;

import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public interface ClienteService {

     ClienteResponse criaNovoCliente(@Valid ClienteNovoRequest cliente);

     ClienteResponse buscarClientePorId(@PathVariable UUID idCliente);
}
