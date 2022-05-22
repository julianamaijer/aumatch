package com.julianamaijer.aumatch.controller.dto

import com.julianamaijer.aumatch.domain.model.Ong
import com.julianamaijer.aumatch.enums.AnimalStatusEnum
import com.julianamaijer.aumatch.enums.GenderEnum
import com.julianamaijer.aumatch.enums.SizeEnum
import com.julianamaijer.aumatch.enums.TypeAnimalEnum
import javax.persistence.*

data class AnimalResponse (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var breed: String,

    @Column
    var age: Int,

    @Column
    var size: SizeEnum,

    @Column
    var type: TypeAnimalEnum,

    @Column
    var gender: GenderEnum,

    @Column
    var status: AnimalStatusEnum,

    @ManyToOne
    @JoinColumn(name = "ong_id")
    var ong : Ong
        )