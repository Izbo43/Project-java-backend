package com.consumption.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consumption.crud.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {

}
