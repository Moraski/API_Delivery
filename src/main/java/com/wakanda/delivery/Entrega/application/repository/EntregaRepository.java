package com.wakanda.delivery.Entrega.application.repository;


import com.wakanda.delivery.Entrega.application.api.EditaEntregaRequest;
import com.wakanda.delivery.Entrega.domain.Entrega;

import java.util.UUID;

public interface EntregaRepository {

    Entrega buscaPorId(UUID idEntrega);
    Entrega salvar(Entrega entrega);
}
