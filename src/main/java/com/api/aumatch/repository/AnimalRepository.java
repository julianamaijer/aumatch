package com.api.aumatch.repository;

import com.api.aumatch.domain.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    Optional<Animal> findById(Long idAnimal);
    List<Animal> findAll();

}
