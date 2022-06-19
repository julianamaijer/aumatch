package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name="id_animal")
    private Long idAnimal;

    @Column
    private String nome;

    @Column
    private String raca;

    @Column
    private Integer idade;

    @Column
    private String porte;

    @Column(name = "tipo_animal")
    private String tipoAnimal;

    @Column
    private String sexo;

    //private StatusAnimalEnum statusAnimal;

    @ManyToOne
    @JoinColumn(name = "id_ong", nullable = false)
    private Ong ongOrigem;

}
