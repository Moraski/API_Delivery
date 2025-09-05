package com.wakanda.delivery.Cliente.application.api;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EditaClienteRequest {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    public EditaClienteRequest(String nome, String cpf, String email, String telefone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}


