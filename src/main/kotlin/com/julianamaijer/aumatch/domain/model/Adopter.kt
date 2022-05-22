package com.julianamaijer.aumatch.domain.model

import com.julianamaijer.aumatch.enums.AdopterStatusEnum

data class Adopter (

    var id: Int,

    var name: String,

    var surname: String,

    var email: String,

    var telephoneNumber: String,

    var age: Int,

    var profileDescription: String,

    var password: String,

    var address: Address,

    var status: AdopterStatusEnum,

    var chats: List<Chat>,

    var favouriteAnimals: List<Animal>

    )