package com.wakanda.delivery.Cliente.application.repository;

import com.wakanda.delivery.Cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);

    Cliente buscaPorId(UUID idCliente);

    void deleta(UUID idCliente);
}
