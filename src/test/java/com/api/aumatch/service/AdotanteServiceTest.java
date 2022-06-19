/*
package com.api.aumatch.service;

import com.api.aumatch.domain.model.*;
import com.api.aumatch.exception.EntityNotFoundException;
import com.api.aumatch.repository.AdotanteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class AdotanteServiceTest {

    @Mock
    AdotanteRepository adotanteRepository;

    @InjectMocks
    AdotanteService adotanteService;

    @Test
    public void testeSalvarAdotante(){
        //GIVEN
        Adotante adotante = dadoUmAdotante();
        //WHEN
        given(adotanteRepository.save(adotante)).willReturn(Optional.ofNullable(adotante)); //é optional mesmo?
        Adotante adotanteSalvo = adotanteService.salvar(adotante);
        //THEN
        assertEquals(adotanteSalvo, adotante);
        verify(adotanteRepository,times(1)).save(adotante);

    }

    @Test
    public void testeBuscarAdotantePorIdComSucesso(){
        //GIVEN
        Adotante adotanteCadastrado = dadoUmAdotante();
        long idAdotanteCadastrado = adotanteCadastrado.getIdAdotante();
        //WHEN
        given(adotanteRepository.findById(idAdotanteCadastrado)).willReturn(Optional.ofNullable(adotanteCadastrado));
        Adotante adotanteEncontrado = adotanteService.procurarPorId(idAdotanteCadastrado);
        //THEN
        assertEquals(adotanteEncontrado, adotanteCadastrado);
        verify(adotanteRepository,times(1)).findById(idAdotanteCadastrado);
    }

    @Test
    public void testeBuscarAdotantePorIdNaoEncontrado(){
        //GIVEN
        Adotante adotanteCadastrado = dadoUmAdotante();
        long idAdotanteCadastrado = adotanteCadastrado.getIdAdotante();
        //WHEN
        given(adotanteRepository.findById(idAdotanteCadastrado)).willThrow(EntityNotFoundException.class);
        //THEN
        assertThrows(EntityNotFoundException.class, () ->  adotanteService.procurarPorId(idAdotanteCadastrado));
        verify(adotanteRepository,times(1)).findById(idAdotanteCadastrado);
    }


    public Adotante dadoUmAdotante(){
        Adotante adotante = new Adotante(1L, "Juliana", "Zanon Maijer", "juliana@gmail.com", "1199999-5555",
                28, "sou uma pessoa muito carinhosa e procuro um animal de estimação", "12345", null,
                StatusUsuarioEnum.ATIVO, null, null);
        return adotante;
    }


}*/
