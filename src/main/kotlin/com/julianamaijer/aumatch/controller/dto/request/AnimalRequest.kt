package com.julianamaijer.aumatch.controller.dto.request

import com.julianamaijer.aumatch.enums.GenderEnum
import com.julianamaijer.aumatch.enums.AnimalStatureEnum
import com.julianamaijer.aumatch.enums.AnimalTypeEnum

data class AnimalRequest (

    var name: String,

    var breed: String,

    var age: Int,

    var stature: AnimalStatureEnum,

    var type: AnimalTypeEnum,

    var gender: GenderEnum,

    //alterar para objeto Ong
    var ong : String
        )