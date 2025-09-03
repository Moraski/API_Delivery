package com.wakanda.delivery.Cliente.infra;

import com.wakanda.delivery.Cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteMySQLSpringRepository extends JpaRepository<Cliente, UUID> {
}
