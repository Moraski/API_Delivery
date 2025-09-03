package com.wakanda.delivery.Cliente.application.service;

import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import jakarta.validation.Valid;

public interface ClienteService {

     ClienteResponse criaNovoCliente(@Valid ClienteNovoRequest cliente);
}
