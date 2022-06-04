package com.julianamaijer.aumatch.repository.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne

/*
@Entity(name="chat")
data class Chat (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var initialDate: LocalDate,

    @Column
    var idAdopter: Long,

    @ManyToOne
    @JoinColumn(name = "ong_id")
    var ong: Ong,

    @Column
    var messages: List<Message>,

    @OneToOne
    @JoinColumn(name = "animal_id")
    var animal: Animal

    )*/
