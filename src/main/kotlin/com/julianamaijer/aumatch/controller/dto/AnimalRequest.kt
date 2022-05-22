package com.julianamaijer.aumatch.controller.dto

import com.julianamaijer.aumatch.domain.model.Ong
import com.julianamaijer.aumatch.enums.AnimalStatusEnum
import com.julianamaijer.aumatch.enums.GenderEnum
import com.julianamaijer.aumatch.enums.SizeEnum
import com.julianamaijer.aumatch.enums.TypeAnimalEnum

data class AnimalRequest (

    var name: String,

    var breed: String,

    var age: Int,

    var size: SizeEnum,

    var type: TypeAnimalEnum,

    var gender: GenderEnum,

    var status: AnimalStatusEnum,

    var ong : Ong
        )