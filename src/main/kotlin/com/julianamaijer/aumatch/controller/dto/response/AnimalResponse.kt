package com.julianamaijer.aumatch.controller.dto.response


import com.julianamaijer.aumatch.enums.GenderEnum
import com.julianamaijer.aumatch.enums.AnimalStatureEnum
import com.julianamaijer.aumatch.enums.StatusEnum
import com.julianamaijer.aumatch.enums.AnimalTypeEnum

data class AnimalResponse(

    var id: Int? = null,

    var name: String,

    var breed: String,

    var age: Int,

    var stature: AnimalStatureEnum,

    var type: AnimalTypeEnum,

    var gender: GenderEnum,

    var status: StatusEnum,

    var ong: OngResponse
        )
