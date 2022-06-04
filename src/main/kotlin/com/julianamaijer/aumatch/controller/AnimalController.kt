package com.julianamaijer.aumatch.controller

import com.julianamaijer.aumatch.controller.dto.response.AnimalResponse
import com.julianamaijer.aumatch.extension.toResponse
import com.julianamaijer.aumatch.service.AnimalService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("aumatch/v1/pets")
class AnimalController (val animalService: AnimalService) {

    //não usaremos o método post
/*    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createAnimal(@RequestBody animalRequest: AnimalRequest): AnimalRequest{
        val animal = animalService.getOngById(OngRequest.ongId)
        return animalRequest
    }*/

    @GetMapping("{id}")
    fun selectAnimal(@PathVariable id: Int): ResponseEntity<AnimalResponse> {
        //fazer a extension e criar o banco de dados
        return ResponseEntity.ok(animalService.findAnimalById(id).toResponse())
    }
}