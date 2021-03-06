package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.database.RepositorioUsers;
import com.example.demo.entidade.Candidato;
import com.example.demo.entidade.User;

@Service
public class CandidatoService {
	@Autowired
	private RepositorioUsers userDAO;
	@Autowired
	private RepositorioCandidato candidatoDAO;
	
	public boolean verificadorCpfAndNumber(Candidato candidato) {
		boolean cpfAndNumberExist = false;
		java.util.List<Candidato> findAllCandidatos = this.candidatoDAO.findAll();
		for (int i = 0; i < findAllCandidatos.size(); i++) {
			if(findAllCandidatos.get(i).getCpf().equals(candidato.getCpf()) 
					&& findAllCandidatos.get(i).getNumero().equals(candidato.getNumero())) {
				cpfAndNumberExist = true;
			}
		}
		return cpfAndNumberExist;
	}
}
