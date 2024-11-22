package com.unifacisa.Desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unifacisa.Desafio.entity.Departamento;
import com.unifacisa.Desafio.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> findById(Long id) {
        return departamentoRepository.findById(id);
    }

    public Departamento save(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public void deleteById(Long id) {
        departamentoRepository.deleteById(id);
    }
}
