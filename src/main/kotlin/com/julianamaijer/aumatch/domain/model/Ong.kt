package com.julianamaijer.aumatch.domain.model

import com.julianamaijer.aumatch.enums.OngStatusEnum
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name="ong")
data class Ong (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,

        @Column
        var companyName: String,

        @Column
        var registeredNumber: String,


        var animals: List<Animal>,

        var chats: List<Chat>,

        var address: Address,

        @Column
        var status: OngStatusEnum

        )
