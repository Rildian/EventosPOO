package com.grupog.eventospoo.model;

public class Autor extends Usuario {
    Autor(String nome, String cpf, String instituicao, String senha, String email) {
        super(nome, cpf, instituicao, senha, email, TipoUsuario.AUTOR);
    }
}
