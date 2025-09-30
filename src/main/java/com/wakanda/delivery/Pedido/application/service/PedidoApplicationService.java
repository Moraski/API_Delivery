package com.wakanda.delivery.Pedido.application.service;

import com.wakanda.delivery.Pedido.application.api.PedidoNovoRequest;
import com.wakanda.delivery.Pedido.application.api.PedidoResponse;
import com.wakanda.delivery.Pedido.application.repository.PedidoRepository;
import com.wakanda.delivery.Pedido.domain.Pedido;
import com.wakanda.delivery.itens.application.repository.ItemRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService{

    private final PedidoRepository pedidoRepository;
    private final ItemRepository itemRepository;

    @Override
    public PedidoResponse criaNovoPedido(@Valid PedidoNovoRequest pedidoNovo) {
        log.info("[Inicia] PedidoApplicationService - criaNovoPedido");
        var pedido = new Pedido(pedidoNovo, itemRepository);
        pedidoRepository.salva(pedido);
        log.info("[Finaliza] PedidoApplicationService - criaNovoPedido");
        return new PedidoResponse(pedido);
    }
}
