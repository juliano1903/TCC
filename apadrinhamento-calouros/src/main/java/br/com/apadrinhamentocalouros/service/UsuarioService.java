package br.com.apadrinhamentocalouros.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Iterables;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
//	@Autowired
//	private UsuarioSession usuarioSession;
	
	/*
	 * Adicionar a escolha do curso np cadastro
	 * 
	 * Proxima semana
	 * 
	 * Vincular alunos - limitar alunos do seu curso Coord.
	 * 
	 * Enviar mensagem ao grupo do aluno
	 * 
	 * Marcar encontro
	 * 
	 * Aprimorar layout
	 */
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario save(Usuario usuario) {
		if(usuario.isCalouro()) {
			usuario.setDataAceite(new Date());
		}
		
		return usuarioRepository.save(usuario);
	}
	
	public Usuario validarCadastro(Usuario usuario) {
		if(usuario.getJustificativaNegativa() == null) {
			usuario.setDataAceite(new Date());
		} else {
			usuario.setDataNegativa(new Date());
		}
		return usuarioRepository.save(usuario);
	}
	
	public Iterable<Usuario> findUsuariosPendentesDeAceite() {
		return usuarioRepository.findUsuariosPendentesDeAceite();
	}
	
	public Usuario login(Usuario usuario) {
		return usuarioRepository.findByMatriculaAndSenha(usuario.getMatricula(), usuario.getSenha());
	}

	public Iterable<Usuario> findUsuariosPendentesVinculacao() {
		List<Usuario> calourosList = findUsuariosCalourosPendentesVinculacao();
		calourosList.addAll(findUsuariosVeteranosPendentesVinculacao());
		return calourosList;
	}
	
	public List<Usuario> findUsuariosCalourosPendentesVinculacao() {
		return usuarioRepository.findUsuariosCalourosPendentesVinculacao();
	}
	
	public List<Usuario> findUsuariosVeteranosPendentesVinculacao() {
		return usuarioRepository.findUsuariosVeteranosPendentesVinculacao();
	}
}
