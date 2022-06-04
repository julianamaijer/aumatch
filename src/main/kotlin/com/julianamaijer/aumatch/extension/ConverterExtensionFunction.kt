package com.julianamaijer.aumatch.extension

import com.julianamaijer.aumatch.controller.dto.response.AnimalResponse
import com.julianamaijer.aumatch.controller.dto.response.OngResponse
import com.julianamaijer.aumatch.enums.AnimalStatureEnum
import com.julianamaijer.aumatch.enums.StatusEnum
import com.julianamaijer.aumatch.enums.AnimalTypeEnum
import com.julianamaijer.aumatch.enums.GenderEnum
import com.julianamaijer.aumatch.repository.model.Animal
import com.julianamaijer.aumatch.repository.model.Ong

/*
import com.julianamaijer.aumatch.controller.dto.request.AnimalRequest
import com.julianamaijer.aumatch.repository.model.Animal
import com.julianamaijer.aumatch.enums.AnimalStatusEnum

fun AnimalRequest.toAnimal(): Animal {
    return Animal(
        name = this.name,
        breed = this.breed,
        age = this.age,
        stature = this.stature.toString(),
        type = this.type.toString(),
        gender = this.gender.toString(),
        status = AnimalStatusEnum.ACTIVE.toString(),
        ong = this.ong
    )
}*/

fun Animal.toResponse(): AnimalResponse {
    return AnimalResponse(
        id = this.id,
        name = this.name,
        breed = this.breed,
        age = this.age,
        stature = AnimalStatureEnum.valueOf(stature),
        type = AnimalTypeEnum.valueOf(type),
        gender = GenderEnum.valueOf(gender),
        status = StatusEnum.ACTIVE,
        ong = this.ong.toResponse()
    )
}

fun Ong.toResponse(): OngResponse {
    return OngResponse(
        id = this.id,
        companyName = this.companyName,
        registeredNumber = this.registeredNumber
    )
}
