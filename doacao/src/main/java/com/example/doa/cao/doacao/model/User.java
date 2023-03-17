package com.example.doa.cao.doacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private String nasc;
    private Character sexo;


}
