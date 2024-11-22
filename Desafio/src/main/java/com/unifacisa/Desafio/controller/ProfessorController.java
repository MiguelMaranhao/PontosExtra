package com.unifacisa.Desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Desafio.entity.Professor;
import com.unifacisa.Desafio.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> findAll() {
        return professorService.findAll();
    }

    @GetMapping("/{id}")
    public Professor findById(@PathVariable Long id) {
        return professorService.findById(id).orElse(null);
    }

    @PostMapping
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        professorService.deleteById(id);
    }
}
