package com.api.autmatch.service

import com.api.autmatch.repository.AnimalRepository
import com.julianamaijer.aumatch.domain.model.Animal
import com.julianamaijer.aumatch.enums.ErrorsEnum
import com.julianamaijer.aumatch.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class AnimalService (val animalRespository: AnimalRepository){

    fun findAnimalById(id : Int): Animal {
        return animalRespository.findById(id).orElseThrow{ NotFoundException(ErrorsEnum.AU101.message.format(id), ErrorsEnum.AU101.code) }
    }
}