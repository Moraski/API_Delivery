package com.wakanda.delivery.itens.application.api;

import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ItemAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ItemResponse postNovoItem(@RequestBody @Valid ItemNovoRequest item);
}
