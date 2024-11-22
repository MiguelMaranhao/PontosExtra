package com.unifacisa.Desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unifacisa.Desafio.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}


