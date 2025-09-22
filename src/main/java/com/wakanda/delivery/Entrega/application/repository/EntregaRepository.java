package com.wakanda.delivery.Entrega.application.repository;

import com.wakanda.delivery.Cliente.domain.Cliente;
import com.wakanda.delivery.Entrega.domain.Entrega;

import java.util.UUID;

public interface EntregaRepository {

    Cliente buscaPorId(UUID idCliente);
}
