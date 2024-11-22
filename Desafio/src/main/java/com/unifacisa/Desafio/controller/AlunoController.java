package com.unifacisa.Desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Desafio.entity.Aluno;
import com.unifacisa.Desafio.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> findAll() {
        return alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Long id) {
        return alunoService.findById(id).orElse(null);
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        alunoService.deleteById(id);
    }
}