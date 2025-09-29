package com.wakanda.delivery.Entrega.domain;

import com.wakanda.delivery.Entrega.application.api.EditaEntregaRequest;
import com.wakanda.delivery.handler.APIException;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
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

    public void editaEntrega(EditaEntregaRequest entrega){
        if (entrega.getStatus() == null){
            throw APIException.build(HttpStatus.BAD_REQUEST, "status de entrega não pode estar vazio");
        }
        this.status = entrega.getStatus();

    }
}
