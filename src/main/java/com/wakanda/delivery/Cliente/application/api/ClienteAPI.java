package com.wakanda.delivery.Cliente.application.api;

import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/cliente")

public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postNovoCliente(@RequestBody @Valid ClienteNovoRequest cliente);

    @GetMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.FOUND)
    ClienteResponse getClientePorId(@PathVariable UUID idClietne);

}
