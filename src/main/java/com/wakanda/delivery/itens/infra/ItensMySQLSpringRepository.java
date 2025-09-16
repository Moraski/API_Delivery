package com.wakanda.delivery.itens.infra;

import com.wakanda.delivery.Cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItensMySQLSpringRepository extends JpaRepository<Cliente, UUID> {
}
