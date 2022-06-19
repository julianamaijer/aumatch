package com.api.aumatch.mapper;

import com.api.aumatch.controller.dto.AnimalDTO;
import com.api.aumatch.domain.model.Animal;
import org.mapstruct.Mapper;

import java.util.List;

// uses = {OngMapper.class}
@Mapper(componentModel = "spring")
public interface AnimalMapper {

    AnimalDTO toAnimalDTO(Animal animal);

    List<AnimalDTO> toListAnimalDTO(List<Animal> animais);

}
