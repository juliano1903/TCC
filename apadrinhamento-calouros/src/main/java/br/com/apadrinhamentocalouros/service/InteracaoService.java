package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Interacao;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.repository.CursoRepository;
import br.com.apadrinhamentocalouros.repository.InteracaoRepository;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class InteracaoService {
	
	@Autowired
	private InteracaoRepository interacaoRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	public Interacao save(Interacao interacao) {
		if(interacao.coordenador)
			interacao.setUsuarioCoordenador(
					usuarioService.findCoordenadorByIdCurso(interacao.getUsuarioCalouro().getIdCurso()));
		return interacaoRepository.save(interacao);
	}
}	
