package com.wakanda.delivery.Entrega.infra;

import com.wakanda.delivery.Entrega.domain.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntregaMySQLSpringRepository extends JpaRepository<Entrega, UUID> {
}
