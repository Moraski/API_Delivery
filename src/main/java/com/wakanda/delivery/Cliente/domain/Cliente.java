package com.wakanda.delivery.Cliente.domain;

import com.wakanda.delivery.Cliente.application.api.ClienteNovoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Cliente {

    @Id
    @GeneratedValue
    private UUID idCliente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String endereco;

    public Cliente(@Valid ClienteNovoRequest clienteNovo) {
        this.nome = clienteNovo.getNome();
        this.cpf = clienteNovo.getCpf();
        this.email = clienteNovo.getEmail();
        this.telefone = clienteNovo.getTelefone();
        this.endereco = clienteNovo.getEndereco();
    }
}
