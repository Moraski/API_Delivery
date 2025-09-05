package com.wakanda.delivery.Cliente.infra;

import com.wakanda.delivery.Cliente.application.repository.ClienteRepository;
import com.wakanda.delivery.Cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

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
}
