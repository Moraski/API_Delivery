package com.wakanda.delivery.Cliente.application.api;

import lombok.Value;

@Value
public class ClienteNovoRequest {

    String nome;
    String cpf;
    String email;
    String telefone;
    String endereco;
}
