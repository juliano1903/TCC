package br.com.apadrinhamentocalouros.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Mensagem;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.repository.CursoRepository;
import br.com.apadrinhamentocalouros.repository.MensagemRepository;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class MensagemService {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	public VinculoUsuario enviarMensagemGrupo(Mensagem mensagem) {
		mensagemRepository.save(mensagem);
		return null;
	}
}	
