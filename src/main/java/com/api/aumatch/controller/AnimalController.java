package com.api.aumatch.controller;

import com.api.aumatch.controller.dto.AnimalDTO;
import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.mapper.AnimalMapper;
import com.api.aumatch.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aumatch/v1/animais")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AnimalMapper animalMapper;

    @GetMapping("/{idAnimal}")
    public ResponseEntity<AnimalDTO> selecionarAdodante(@PathVariable Long idAnimal){
        return ResponseEntity.ok(animalMapper.toAnimalDTO(animalService.procurarPorId(idAnimal)));
    }


    @GetMapping
    public ResponseEntity<List<AnimalDTO>> listarAnimais(
            @RequestParam(name = "cao", required = false) Boolean tipoAnimalCao,
            @RequestParam(name ="gato", required = false) Boolean tipoAnimalGato,
            @RequestParam(name ="porte", required = false) String porte,
            @RequestParam(name ="sexo", required = false) String sexo,
            @RequestParam(name ="idadeMinima", required = false) Integer idadeMinima,
            @RequestParam(name ="idadeMaxima", required = false) Integer idadeMaxima,
            @RequestParam(name ="distanciaMinima", required = false) Integer distanciaMinima,
            @RequestParam(name ="distanciaMaxima", required = false) Integer distanciaMaxima
    ) {
        List<Animal> animais = animalService.listarTodos(tipoAnimalCao, tipoAnimalGato, porte,sexo, idadeMinima, idadeMaxima, distanciaMinima,distanciaMaxima);
        System.out.println("tamanho resposta lista "+animais.size());
        return ResponseEntity.ok(animalMapper.toListAnimalDTO(animais));
    }

}
