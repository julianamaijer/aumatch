package com.api.aumatch.repository;

import com.api.aumatch.domain.model.Adotante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, Long> {
    void delete(Adotante adotante);
    List<Adotante> findAll();
}
