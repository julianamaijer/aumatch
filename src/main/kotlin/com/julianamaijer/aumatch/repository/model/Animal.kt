package com.julianamaijer.aumatch.repository.model

import javax.persistence.*


@Entity(name = "animal")
data class Animal (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int? = null,

        @Column
        var name: String,

        @Column
        var breed: String,

        @Column
        var age: Int,

        @Column
        var stature: String,

        @Column
        var type: String,

        @Column
        var gender: String,

        @Column
        var status: String,

        @ManyToOne
        @JoinColumn(name = "ong_id")
        var ong : Ong

        )
