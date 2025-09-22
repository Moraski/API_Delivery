package com.wakanda.delivery.Entrega.domain;

import jakarta.persistence.*;
import lombok.*;
import com.wakanda.delivery.entrega.domain.StatusEntrega;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "entregas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Entrega {

    @Id
    @GeneratedValue
    private UUID idEntrega;

    @OneToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private StatusEntrega status;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_entrega")
    private LocalDateTime dataEntrega;

}