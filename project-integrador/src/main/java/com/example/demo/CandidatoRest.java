package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositorioCandidato;
import com.example.demo.entidade.Candidato;
import com.example.demo.service.CandidatoService;

@SpringBootApplication
@RestController
@RequestMapping("/candidato")
public class CandidatoRest {
	
	 	@Autowired
	    private RepositorioCandidato repositorio;
	 	
	 	@Autowired
	 	private CandidatoService candidatoService; 

	    @GetMapping
	    public List<Candidato> listar(){
	        return repositorio.findAll();
	    }

	    @PostMapping
	    public void salvar(@RequestBody Candidato candidato){
	        repositorio.save(candidato);
	    }

	    @PutMapping
	    public void alterar(@RequestBody Candidato candidato){
	        if(candidato.getId() > 0)
	            repositorio.save(candidato);
	    }

	    @DeleteMapping("/{id}")
	    public void excluir(@PathVariable Long id){
	        repositorio.deleteById(id);
	    }
	
}
