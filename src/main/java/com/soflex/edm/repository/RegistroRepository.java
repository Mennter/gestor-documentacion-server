package com.soflex.edm.repository;

import java.util.List;

import com.soflex.edm.dominio.Registro;

import org.springframework.data.repository.CrudRepository;

public interface RegistroRepository extends CrudRepository<Registro, Long> {
    

    List<Registro> findByBorradoFalse();

    Registro findOneById(Long id);

}