package com.wakanda.delivery.Pedido.domain;

import com.wakanda.delivery.Entrega.domain.Entrega;
import com.wakanda.delivery.itens.domain.Item;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.wakanda.delivery.pedido.domain.ItemDoPedido;

@Entity
@Table(name = "itens")
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

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemDoPedido> itens = new ArrayList<>();

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private Entrega entrega;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;


    public Pedido(UUID idCliente){
        this.idCliente = idCliente;
        this.dataCriacao = LocalDateTime.now();
    }

    public void adicionarItem(Item item, Integer quantidade){
        ItemDoPedido itemPedido = ItemDoPedido.builder()
                .pedido(this)
                .item(item)
                .quantidade(quantidade)
                .build();
        this.itens.add(itemPedido);
    }

    public Double getTotal(){
        return itens.stream()
                .mapToDouble(ItemDoPedido::getSubtotal)
                .sum();
    }

    public void adicionarEntrega(Entrega entrega){
        this.entrega = entrega;
    }
}
