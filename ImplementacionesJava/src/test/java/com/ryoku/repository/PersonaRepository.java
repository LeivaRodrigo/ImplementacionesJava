package com.ryoku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryoku.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
