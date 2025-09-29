package com.wakanda.delivery.Pedido.application.api;

import com.wakanda.delivery.Pedido.application.service.PedidoService;
import com.wakanda.delivery.Pedido.domain.Pedido;
import com.wakanda.delivery.itens.application.api.ItemAPI;
import com.wakanda.delivery.itens.application.api.ItemResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {

    private final PedidoService pedidoservice;

    @Override
    public PedidoResponse postNovoPedido(PedidoNovoRequest pedido) {
        log.info("[Inicia] PedidoController - postNovoPedido");
        PedidoResponse response = pedidoservice.criaNovoPedido(pedido);
        log.info("[Finaliza] PedidoController - postNovoPedido");
        return response;
    }
}
