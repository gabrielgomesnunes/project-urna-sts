package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.database.RepositorioUsers;

@Service
public class CandidatoService {
	@Autowired
	private RepositorioUsers userDAO;
	@Autowired
	private RepositorioCandidato candidatoDAO;
}