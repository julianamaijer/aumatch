package com.julianamaijer.aumatch.extension

import com.julianamaijer.aumatch.controller.dto.AnimalRequest
import com.julianamaijer.aumatch.domain.model.Animal
import com.julianamaijer.aumatch.enums.AnimalStatusEnum

fun AnimalRequest.toAnimal(): Animal {
    return Animal(
        name = this.name,
        breed = this.breed,
        age = this.age,
        size = this.size,
        type = this.type,
        gender = this.gender,
        status = AnimalStatusEnum.ACTIVE,
        ong = this.ong
    )
}