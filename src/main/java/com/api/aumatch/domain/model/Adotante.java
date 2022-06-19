package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Repository
@Data
@Entity
public class Adotante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name="id_adotante")
    private Long idAdotante;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private Integer idade;

    @Column(name="descricao_perfil")
    private String descricaoDoPerfil;

    @Column
    private String senha;

/*
    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(name= "status_usuario")
    private StatusUsuarioEnum statusUsuarioEnum;

    private List<Chat> historicoChat;
    private List<Animal> animaisFavoritos;*/

}
