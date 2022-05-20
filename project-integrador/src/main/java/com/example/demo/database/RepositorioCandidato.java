package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Candidato;

@Repository
public interface RepositorioCandidato extends JpaRepository<Candidato, Long>{

}
