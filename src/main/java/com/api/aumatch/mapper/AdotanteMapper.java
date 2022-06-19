package com.api.aumatch.mapper;

import com.api.aumatch.controller.dto.AdotanteDTO;
import com.api.aumatch.domain.model.Adotante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdotanteMapper {

    Adotante toAdotante(AdotanteDTO adotanteDTO);
    AdotanteDTO toAdotanteDTO(Adotante adotante);

}
