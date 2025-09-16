package com.wakanda.delivery.Cliente.application.service;

import com.wakanda.delivery.Cliente.application.api.ClienteResponse;
import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import com.wakanda.delivery.Cliente.application.api.EditaClienteRequest;
import com.wakanda.delivery.Cliente.application.repository.ClienteRepository;
import com.wakanda.delivery.Cliente.domain.Cliente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaNovoCliente(@Valid ClienteNovoRequest clienteNovo){
        log.info("[Inicia] ClienteApplicationService - criaNovoCliente");
        var cliente = new Cliente(clienteNovo);
        clienteRepository.salva(cliente);
        log.info("[Finaliza] ClienteApplicationService - criaNovoCliente");
        return new ClienteResponse(cliente);
    }

    @Override
    public ClienteResponse buscarClientePorId(UUID idCliente) {
        log.info("[Inicia] ClienteApplicationService - buscarClientePorId");
        Cliente cliente = clienteRepository.buscaPorId(idCliente);
        log.info("[Finaliza] ClienteApplicationService - buscarClientePorId");
        return new ClienteResponse(cliente);
    }

    @Override
    public ClienteResponse AtualizaCliente(UUID idCliente, EditaClienteRequest clienteNovo) {
        log.info("[Inicia] ClienteApplicationService - AtualizaCliente");
        Cliente cliente = clienteRepository.buscaPorId(idCliente);
        cliente.editaCliente(clienteNovo.getNome(), clienteNovo.getCpf(), clienteNovo.getEmail(), clienteNovo.getTelefone(),clienteNovo.getEndereco());
        clienteRepository.salva(cliente);
        log.info("[Finaliza] ClienteApplicationService - AtualizaCliente");
        return new ClienteResponse(cliente);
    }

    @Override
    public void DeletaCliente(UUID idCliente) {
        log.info("[Inicia] ClienteApplicationService - DeletaCliente");
        clienteRepository.deleta(idCliente);
        log.info("[Finaliza] ClienteApplicationService - DeletaCliente");
    }
}
