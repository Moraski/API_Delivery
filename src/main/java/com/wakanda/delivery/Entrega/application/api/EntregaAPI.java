package com.wakanda.delivery.Entrega.application.api;



import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/Entrega")
public interface EntregaAPI {

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    EntregaResponse GetEntregaById(@PathVariable UUID IdEntrega);

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    EntregaResponse UpdateEntrega(@PathVariable UUID idEntrega, @RequestBody @Valid EditaEntregaRequest editaEntregaRequest);
}
