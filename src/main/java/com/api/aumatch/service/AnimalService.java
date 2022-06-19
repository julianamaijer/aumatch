package com.api.aumatch.service;

import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.exception.EntityNotFoundException;
import com.api.aumatch.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Animal procurarPorId(Long idAnimal){
        return animalRepository.findById(idAnimal).
                orElseThrow(() -> new EntityNotFoundException("Adotante " + idAnimal + "não encontrado."));
    }

    public List<Animal> listarTodos(Boolean tipoAnimalCao, Boolean tipoAnimalGato, String porte, String sexo, Integer idadeMinima, Integer idadeMaxima, Integer distanciaMinima, Integer distanciaMaxima) {
        Specification<Animal> animalSpecification = getAnimalQuery(tipoAnimalCao, tipoAnimalGato, porte,sexo, idadeMinima, idadeMaxima, distanciaMinima, distanciaMaxima);
        if(animalSpecification!=null){
            return animalRepository.findAll(animalSpecification);
        }else
            return animalRepository.findAll();
    }


    public Specification<Animal> getAnimalQuery(Boolean tipoAnimalCao, Boolean tipoAnimalGato, String porte, String sexo, Integer idadeMinima, Integer idadeMaxima, Integer distanciaMinima, Integer distanciaMaxima) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (tipoAnimalCao!=null) {
                predicates.add(criteriaBuilder.equal(root.get("tipoAnimal"), "cão"));
            }
            if (tipoAnimalGato!=null) {
                predicates.add(criteriaBuilder.equal(root.get("tipoAnimal"), "gato"));
            }
            if (porte!=null) {
                predicates.add(criteriaBuilder.equal(root.get("porte"), porte));
            }
            if (sexo!=null) {
                predicates.add(criteriaBuilder.equal(root.get("sexo"), sexo));
            }
            if (idadeMinima!=null && idadeMaxima!=null) {
                predicates.add(criteriaBuilder.between(root.get("idade"), idadeMinima,idadeMaxima));
            }
            if (distanciaMinima!=null && distanciaMaxima!=null) {
             //   predicates.add(criteriaBuilder.between(root.get("idade"), distanciaMinima,distanciaMaxima));
            }
            if(predicates.isEmpty()) return null;
            return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
        };
    }

}
