package com.julianamaijer.aumatch.repository

import com.julianamaijer.aumatch.repository.model.Animal
import org.springframework.data.jpa.repository.JpaRepository

interface AnimalRepository: JpaRepository<Animal, Int>{

}
