package com.unifacisa.Desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Desafio.entity.Curso;
import com.unifacisa.Desafio.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Long id) {
        return cursoService.findById(id).orElse(null);
    }

    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        cursoService.deleteById(id);
    }
}
