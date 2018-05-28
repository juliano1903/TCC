package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Avaliacao;
import br.com.apadrinhamentocalouros.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {
	
	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	
	public Avaliacao avaliar(Avaliacao avaliacao) {
		avaliacao.setDataAvaliacao(new Date());
		return avaliacaoRepository.save(avaliacao);
	}

}	
