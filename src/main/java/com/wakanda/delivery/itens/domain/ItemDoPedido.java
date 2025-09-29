package com.wakanda.delivery.pedido.domain;

import com.wakanda.delivery.Pedido.domain.Pedido;
import com.wakanda.delivery.itens.domain.Item;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "pedido_itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ItemDoPedido {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_item", nullable = false)
    private Item item;

    @Column(nullable = false)
    private Integer quantidade;

    public Double getSubtotal() {
        return item.getValorUnitario() * quantidade;
    }
}
