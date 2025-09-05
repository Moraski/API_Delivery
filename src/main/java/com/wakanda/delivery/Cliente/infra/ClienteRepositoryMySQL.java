package com.wakanda.delivery.Cliente.infra;

import com.wakanda.delivery.Cliente.application.repository.ClienteRepository;
import com.wakanda.delivery.Cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ClienteRepositoryMySQL implements ClienteRepository {

    private final ClienteMySQLSpringRepository clienteMySQLSpringRepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[Inicia] ClienteRepositoryMySQL - salva");
        Cliente novoCliente = clienteMySQLSpringRepository.save(cliente);
        log.info("[Finaliza] ClienteRepositoryMySQL - salva");
        return novoCliente;
    }

    @Override
    public Cliente buscaPorId(UUID idCliente) {
        log.info("[Inicia] ClienteRepositoryMySQL - buscaPorId");
        Cliente cliente = clienteMySQLSpringRepository.findById(idCliente)
                        .orElseThrow(() -> new APIException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
        log.info("[Inicia] ClienteRepositoryMySQL - buscaPorId");
        return cliente;
    }
}
