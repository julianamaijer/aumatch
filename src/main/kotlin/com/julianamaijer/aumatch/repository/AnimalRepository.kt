package com.api.autmatch.repository

import com.julianamaijer.aumatch.domain.model.Animal
import org.springframework.data.jpa.repository.JpaRepository

interface AnimalRepository: JpaRepository<Animal, Int>{

}
