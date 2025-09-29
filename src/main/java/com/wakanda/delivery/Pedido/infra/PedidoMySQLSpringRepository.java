package com.wakanda.delivery.Pedido.infra;

import com.wakanda.delivery.Cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoMySQLSpringRepository extends JpaRepository<Cliente, UUID> {

}
