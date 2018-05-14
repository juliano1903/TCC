package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Estrutura;
import br.com.apadrinhamentocalouros.model.Evento;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.repository.CursoRepository;
import br.com.apadrinhamentocalouros.repository.EstruturaRepository;
import br.com.apadrinhamentocalouros.repository.EventoRepository;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class EstruturaService {
	
	@Autowired
	private EstruturaRepository estruturaRepository;
	
	public Iterable<Estrutura> findAll() {
		return estruturaRepository.findAllByOrderByNomeAsc();
	}

}	
