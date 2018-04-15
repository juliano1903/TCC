package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.repository.CursoRepository;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public Iterable<Curso> findAll() {
		return cursoRepository.findAllByOrderByNomeAsc();
	}
}	
