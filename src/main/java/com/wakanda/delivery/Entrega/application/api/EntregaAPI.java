package com.wakanda.delivery.Entrega.application.api;


import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/Entrega")
public interface EntregaAPI {
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    ClienteResponse GetEntregaById(@PathVariable UUID IdEntrega);
}
