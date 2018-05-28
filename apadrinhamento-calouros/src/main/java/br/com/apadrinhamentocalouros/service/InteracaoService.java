package br.com.apadrinhamentocalouros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Interacao;
import br.com.apadrinhamentocalouros.repository.InteracaoRepository;

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

	public Iterable<Interacao> findAllByIdsAlunos(List<Long> idsAlunos) {
		return interacaoRepository.findAllByIdsAlunos(idsAlunos);
	}
}	
