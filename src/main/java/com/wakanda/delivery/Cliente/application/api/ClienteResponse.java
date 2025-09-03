package com.wakanda.delivery.Cliente.application.api;

import com.wakanda.delivery.Cliente.domain.Cliente;

import java.util.UUID;

public class ClienteResponse {


     UUID idCliente;
     String nome;
     String cpf;
     String email;
     String telefone;
     String endereco;

    public ClienteResponse(Cliente cliente){
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.telefone = cliente.getTelefone();
        this.endereco = cliente.getEndereco();
    }
}
