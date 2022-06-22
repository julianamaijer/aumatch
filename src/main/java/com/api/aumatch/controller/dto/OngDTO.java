package com.api.aumatch.controller.dto;


import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.domain.model.Endereco;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OngDTO {

    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private EnderecoDTO endereco;
    //private List<ChatDTO> historicoChat;
    //private StatusOngEnum statusOngEnum;

}
