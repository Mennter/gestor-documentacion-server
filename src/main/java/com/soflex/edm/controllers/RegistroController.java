package com.soflex.edm.controllers;

import java.util.List;

import com.soflex.edm.dominio.Registro;
import com.soflex.edm.repository.RegistroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registro")
public class RegistroController {

    @Autowired
    private RegistroRepository registroRepository;

    @GetMapping
    public List<Registro> getALL() {
        return this.registroRepository.findByBorradoFalse();
    }

    @PostMapping
    public Registro post(@RequestBody Registro registro) {
        return this.registroRepository.save(registro);
    }
    
    @GetMapping("/{id}")
    public Registro getId(@PathVariable("id") Long id){
        return this.registroRepository.findOneById(id);
    }

}