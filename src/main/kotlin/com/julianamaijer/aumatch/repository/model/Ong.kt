package com.julianamaijer.aumatch.repository.model

import com.julianamaijer.aumatch.enums.OngStatusEnum
import javax.persistence.*


@Entity(name="ong")
data class Ong (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,

        @Column(name = "company_name")
        var companyName: String,

        @Column(name = "registered_number")
        var registeredNumber: String,


/*
        var animals: List<Animal>,

        var chats: List<Chat>,

        @OneToOne
        @JoinColumn(name = "address_id")
        var address: Address,

        @Column
        var status: String
*/

        )
