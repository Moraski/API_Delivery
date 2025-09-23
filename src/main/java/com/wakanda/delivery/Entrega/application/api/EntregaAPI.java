package com.wakanda.delivery.Entrega.application.api;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/Entrega")
public interface EntregaAPI {
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    EntregaResponse GetEntregaById(@PathVariable UUID IdEntrega);
}
