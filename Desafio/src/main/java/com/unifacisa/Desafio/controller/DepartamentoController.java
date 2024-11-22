package com.unifacisa.Desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.Desafio.entity.Departamento;
import com.unifacisa.Desafio.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping
    public List<Departamento> findAll() {
        return departamentoService.findAll();
    }

    @GetMapping("/{id}")
    public Departamento findById(@PathVariable Long id) {
        return departamentoService.findById(id).orElse(null);
    }

    @PostMapping
    public Departamento save(@RequestBody Departamento departamento) {
        return departamentoService.save(departamento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        departamentoService.deleteById(id);
    }
}
