package com.api.aumatch.service;

import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.exception.EntityNotFoundException;
import com.api.aumatch.exception.UnauthorizedException;
import com.api.aumatch.repository.AdotanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdotanteService {

    @Autowired
    private AdotanteRepository adotanteRepository;

    public Adotante salvar(Adotante adotante) {
        return adotanteRepository.save(adotante);
    }

    public Adotante procurarPorId(Long idAdotante){
        return adotanteRepository.findById(idAdotante).
                orElseThrow(() -> new EntityNotFoundException("Adotante " + idAdotante + "não encontrado."));
    }

    public Adotante atualizar(Long idAdotante, Adotante adotante) {
        procurarPorId(idAdotante);
        adotante.setIdAdotante(idAdotante);
        return adotanteRepository.save(adotante);
    }

    public void delete(Long idAdotante) {
        Adotante adotante = procurarPorId(idAdotante);
        adotanteRepository.delete(adotante);
    }

    public List<Adotante> listarTodos() {
        return adotanteRepository.findAll();
    }

    public void procurarPorEmailSenha(String email, String senha) {
        adotanteRepository.findByEmailAndSenha(email, senha).
                orElseThrow(() -> new UnauthorizedException("Usuario ou senha inválido(s)"));

    }
}
