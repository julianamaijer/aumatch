package com.julianamaijer.aumatch.domain.model

import java.time.LocalDate

data class Chat (

    var initialDate: LocalDate,

    var idAdopter: Long,

    var ong: Ong,

    var messages: List<String>,

    var animal: Animal

    )