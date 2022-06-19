package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Ong {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name="id_ong")
    private Long idOng;

    @Column(name="razao_social")
    private String razaoSocial;

    @Column
    private String cnpj;

    @OneToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;
    //private List<Chat> historicoChat;
    //private StatusOngEnum statusOngEnum;

}
