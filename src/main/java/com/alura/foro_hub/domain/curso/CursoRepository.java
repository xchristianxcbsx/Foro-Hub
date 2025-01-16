package com.alura.foro_hub.domain.curso;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    Optional<Curso> findById(Integer id);

}
