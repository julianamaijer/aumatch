package com.julianamaijer.aumatch.controller

import com.api.autmatch.domain.model.Animal
import com.api.autmatch.service.AnimalService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("aumatch/v1/animals")
class AnimalController (val animalService: AnimalService) {

    @GetMapping("{id}")
    fun selectAnimal(@PathVariable id: Int): ResponseEntity<Animal> {
        return ResponseEntity.ok(animalService.findAnimalById(id))
    }
}