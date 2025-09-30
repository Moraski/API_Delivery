package com.wakanda.delivery.Pedido.domain;

import com.wakanda.delivery.Entrega.domain.Entrega;
import com.wakanda.delivery.Pedido.application.api.PedidoNovoRequest;
import com.wakanda.delivery.itens.application.repository.ItemRepository;
import com.wakanda.delivery.itens.domain.Item;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.wakanda.delivery.ItensPedido.domain.ItemDoPedido;

@Entity
@Table(name = "pedidos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Pedido {

    @Id
    @GeneratedValue
    private UUID idPedido;

    @Column(nullable = false)
    private UUID idCliente;

    @Column(nullable = false)
    private StatusPedido statusPedido;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemDoPedido> itens = new ArrayList<>();

    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private Entrega entrega;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;


    public Pedido(PedidoNovoRequest request, ItemRepository itemRepository){

        this.idCliente = request.getIdCliente();
        this.dataCriacao = LocalDateTime.now();
        this.statusPedido = request.getStatusPedido();

        if (request.getItens() != null) {
            this.itens = request.getItens().stream()
                    .map(i -> {
                        Item item = itemRepository.buscaPorId(i.getIdItem());
                        if (item == null) {
                            throw new RuntimeException("Item não encontrado: " + i.getIdItem());
                        }
                        return ItemDoPedido.builder()
                                .item(item)
                                .quantidade(i.getQuantidade())
                                .pedido(this)
                                .build();
                    })
                    .collect(Collectors.toList());
        }
    }


// Calcula o total do pedido
public Double getTotal() {
    return itens.stream()
            .mapToDouble(ItemDoPedido::getSubtotal)
            .sum();
}
}
