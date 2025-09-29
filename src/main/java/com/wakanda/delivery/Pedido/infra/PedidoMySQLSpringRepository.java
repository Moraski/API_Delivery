package com.wakanda.delivery.Pedido.infra;

import com.wakanda.delivery.Pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoMySQLSpringRepository extends JpaRepository<Pedido, UUID> {

}
