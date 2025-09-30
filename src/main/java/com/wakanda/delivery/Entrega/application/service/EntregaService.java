package com.wakanda.delivery.Entrega.application.service;

import com.wakanda.delivery.Entrega.application.api.EditaEntregaRequest;
import com.wakanda.delivery.Entrega.application.api.EntregaRequest;
import com.wakanda.delivery.Entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public interface EntregaService {

    EntregaResponse buscaEntregaPorId(@PathVariable UUID idEntrega);

    EntregaResponse editaEntrega(UUID idEntrega, EditaEntregaRequest editaEntregaRequest);

    EntregaResponse novaEntrega (@Valid EntregaRequest entregaRequest);
}
