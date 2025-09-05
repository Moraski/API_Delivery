package com.wakanda.delivery.Cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(value = "/public/v1/cliente")

public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postNovoCliente(@RequestBody @Valid ClienteNovoRequest cliente);

    @GetMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteResponse getClientePorId(@PathVariable UUID idClietne);

    @PutMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteResponse atualizaCliente(@PathVariable UUID idCliente, @RequestBody @Valid EditaClienteRequest cliente);

    @DeleteMapping(value = "/{idCliente}/delete")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    Void deletaCliente(@PathVariable UUID idCliente);

}
