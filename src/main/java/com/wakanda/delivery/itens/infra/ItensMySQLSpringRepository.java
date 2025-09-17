package com.wakanda.delivery.itens.infra;

import com.wakanda.delivery.itens.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItensMySQLSpringRepository extends JpaRepository<Item, UUID> {
}
