package com.api.aumatch.controller.dto;

import lombok.*;

import java.util.List;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdotanteDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private Integer idade;
    private String descricaoDoPerfil;
    private String senha;

    /*
    private EnderecoDTO endereco;
    private StatusUsuarioEnum statusUsuarioEnum;
    private List<ChatDTO> historicoChat;
    private List<AnimalDTO> animaisFavoritos;*/

}
