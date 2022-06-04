package com.julianamaijer.aumatch.service


import com.julianamaijer.aumatch.enums.ErrorsEnum
import com.julianamaijer.aumatch.exception.NotFoundException
import com.julianamaijer.aumatch.repository.AnimalRepository
import com.julianamaijer.aumatch.repository.model.Animal
import org.springframework.stereotype.Service


@Service
class AnimalService (val animalRespository: AnimalRepository){

    fun findAnimalById(id : Int): Animal {
        return animalRespository.findById(id).orElseThrow{ NotFoundException(ErrorsEnum.AU101.message.format(id), ErrorsEnum.AU101.code) }
    }


}
