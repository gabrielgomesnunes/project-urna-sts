package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Voto;

@Repository
public interface RepositorioVoto extends JpaRepository<Voto, Long>{
	
}
